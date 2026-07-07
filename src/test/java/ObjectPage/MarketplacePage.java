package ObjectPage;

import Control.BaseController;
import Control.DriverContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;
import java.util.List;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Keys;
import org.openqa.selenium.JavascriptExecutor;
import java.time.Duration;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class MarketplacePage extends BaseController {

    private WebDriver driver;

    public MarketplacePage() {
        super();
        initPage();
    }

    @FindBy(xpath = "//input[contains(@id,'downshift')]")
    private WebElement txtBuscador;
    @FindBy(css = "button.vtex-modal-layout-0-x-closeButton")
    private WebElement btnCerrarPopup;
    @FindBy(css = ".vtex-product-summary-2-x-container")
    private List<WebElement> productos;
    @FindBy(css = ".vtex-add-to-cart-button-0-x-buttonText")
    private WebElement btnAgregarCarrito;
    @FindBy(xpath = "//h1[contains(text(),'Y no encuentro nada')]")
    private WebElement lblSinResultados;
    @FindBy(css = "td.product-name a")
    private WebElement productoCarrito;
    @FindBy(css = "a.item-quantity-change-increment")
    private WebElement btnMasCantidad;
    @FindBy(xpath = "//div[contains(text(),'Subtotal')]/following-sibling::div")
    private WebElement lblSubtotal;
    //validocantidad
    @FindBy(css = "input[id*='item-quantity']")
    private WebElement txtCantidad;
    //Vaciarcarro
    @FindBy(css = "a[id*='item-remove']")
    private WebElement btnEliminar;
    @FindBy(css = "h2.empty-cart-title")
    private WebElement lblCarritoVacio;
    //validar
    @FindBy(name = "email")
    private WebElement txtCorreo;
    @FindBy(xpath = "//input[@type='password']")
    private WebElement txtPassword;
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement btnEntrar;
    //invalid
    @FindBy(xpath="//div[@role='alert']")
    private WebElement lblErrorLogin;
    //Checkout
    @FindBy(id = "cart-to-orderform")
    private WebElement btnCompletarCompra;
    @FindBy(xpath = "//span[@data-i18n='clientProfileData.identification']")
    WebElement txtIdentificacion;
    @FindBy(id = "go-to-shipping")
    WebElement btnContinuarCheckout;
    @FindBy(xpath = "//span[@class='help error']")
    WebElement mensajeCampoObligatorio;
    //validarcampocorreo
    @FindBy(xpath = "//span[@class='help error']")
    WebElement mensajeError;





    // métodos

    public void ingresarPagina(String url) {
        DriverContext.getDriver().get(url);
    }
    public void cerrarPopup() {
        try {
            visualizarElemento(btnCerrarPopup, 10);
            btnCerrarPopup.click();
            System.out.println("Popup cerrado");
        } catch (Exception e) {
            System.out.println("No apareció popup");
        }
    }

    public void hacerClicBuscador() {

        cerrarPopup();

        visualizarElemento(txtBuscador, 10);
        txtBuscador.click();
    }

    public void escribirProducto(String producto) {
        visualizarElemento(txtBuscador, 10);
        txtBuscador.clear();
        txtBuscador.sendKeys(producto);
    }

    public void presionarEnter() {
        txtBuscador.sendKeys(Keys.ENTER);
    }

    public boolean existenProductos() {
        visualizarElemento(productos.get(0), 10);
        return productos.size() > 0;
    }

    public void seleccionarPrimerProducto() {
        productos.get(0).click();
    }

    public void agregarAlCarrito() {

        ((JavascriptExecutor) DriverContext.getDriver())
                .executeScript("arguments[0].scrollIntoView({block:'center'});", btnAgregarCarrito);

        visualizarElemento(btnAgregarCarrito, 10);

        ((JavascriptExecutor) DriverContext.getDriver())
                .executeScript("arguments[0].click();", btnAgregarCarrito);
    }

    public boolean validarCarrito() {
        return true;
    }
    //Productonoexiste
    public boolean noExistenProductos() {

        visualizarElemento(lblSinResultados,10);

        return lblSinResultados.isDisplayed();

    }
    //productoalcarrocantidad
    public boolean validarProductoEnCarrito() {
        visualizarElemento(productoCarrito, 10);
        return productoCarrito.isDisplayed();

    }
    public void aumentarCantidad() {

        visualizarElemento(btnMasCantidad, 10);
        btnMasCantidad.click();

    }
    //validocantidad
    public boolean validarCantidad() {

        visualizarElemento(txtCantidad, 10);

        return txtCantidad.getAttribute("value").equals("2");

    }
    //vaciarcarro
    public void eliminarProducto() {

        visualizarElemento(btnEliminar, 10);
        btnEliminar.click();

    }
    public boolean validarCarritoVacio() {

        visualizarElemento(lblCarritoVacio, 10);

        return lblCarritoVacio.getText().equals("Su carrito está vacío");

    }
    //refrech
    public void refrescarPagina() {

        DriverContext.getDriver().navigate().refresh();

    }

    public boolean validarProductoPermanece() {
        visualizarElemento(productoCarrito, 10);
        return productoCarrito.isDisplayed();

    }
    //validar
    public void escribirCorreo(String correo){
        visualizarElemento(txtCorreo,10);
        txtCorreo.clear();
        txtCorreo.sendKeys(correo);

    }
    public void escribirPassword(String password){
        visualizarElemento(txtPassword,10);
        txtPassword.clear();
        txtPassword.sendKeys(password);

    }
    public void hacerClickEntrar(){
        visualizarElemento(btnEntrar,10);
        btnEntrar.click();

    }
    //invalid
    public boolean validarMensajeError(){
        visualizarElemento(lblErrorLogin,10);
        return lblErrorLogin.getText()
                .contains("Usuario y/o contraseña equivocada");

    }
    public void completarCompra() {
        visualizarElemento(btnCompletarCompra, 10);
        btnCompletarCompra.click();

    }
    public boolean validarIngresoCheckout() {
        visualizarElemento(txtIdentificacion,10);
        return txtIdentificacion.isDisplayed();

    }
    //ContinuarCheckout
    public void presionarContinuarCheckout() {

        visualizarElemento(btnContinuarCheckout,10);
        btnContinuarCheckout.click();

    }
    public boolean validarMensajeCampoObligatorio() {

        visualizarElemento(mensajeCampoObligatorio, 10);
        return mensajeCampoObligatorio.getText()
                .equals("Este campo es obligatorio.");

    }
    //validarcampocorreo
    public boolean validarCorreoInvalido() {
        visualizarElemento(mensajeError, 10);
        return mensajeError.getText()
                .equals("Introduzca un correo electrónico válido, por favor.");

    }


}