package ObjectPage;

import Control.BaseController;
import Control.DriverContext;
import org.openqa.selenium.WebDriver;
import java.util.List;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Keys;
import org.openqa.selenium.JavascriptExecutor;
import java.time.Duration;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.By;



public class MarketplacePage extends BaseController {

    private WebDriver driver;

    private List<WebElement> productos;

    public MarketplacePage() {
        super();
        initPage();
    }


    @FindBy(xpath = "//input[contains(@id,'downshift')]")
    private WebElement txtBuscador;
    @FindBy(css = "button.vtex-modal-layout-0-x-closeButton")
    private WebElement btnCerrarPopup;
    @FindBy(linkText = "Guitarras")
    private WebElement lnkGuitarras;
    @FindBy(css = ".vtex-store-drawer-0-x-openIconContainer")
    private WebElement btnMenu;
    @FindBy(xpath = "//span[contains(text(),'GUITARRAS')]")
    private WebElement btnGuitarras;

    @FindBy(xpath = "//h1[contains(text(),'Y no encuentro nada')]")
    private WebElement lblSinResultados;
    @FindBy(css = ".vtex-add-to-cart-button-0-x-buttonText")
    private WebElement btnAgregarCarrito;
    @FindBy(xpath = "//*[contains(text(),'TOTAL')]")
    private WebElement lblSubtotal;

    //validocantidad
    @FindBy(css = "input[id*='item-quantity']")
    private WebElement txtCantidad;
    //Vaciarcarro

    @FindBy(xpath = "//h2[contains(.,'carrito está vacío')]")
    private WebElement lblCarritoVacio;
    //validar

    @FindBy(xpath = "//input[@type='password']")
    private WebElement txtPassword;
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement btnEntrar;
    @FindBy(xpath = "//span[contains(text(),'Mi Cuenta')] | //div[contains(text(),'Mi Cuenta')] | //a[contains(.,'Mi Cuenta')]")
    private WebElement btnMiCuenta;
    @FindBy(xpath = "//div[@role='alert']")
    private WebElement lblErrorLogin;
    //Checkout
    @FindBy(id = "cart-to-orderform")
    private WebElement btnCompletarCompra;
    @FindBy(xpath = "//span[@data-i18n='clientProfileData.identification']")
    WebElement txtIdentificacion;
    @FindBy(id = "go-to-shipping")
    private WebElement btnContinuarCheckout;
    @FindBy(css = "span.help.error")
    private List<WebElement> mensajesCampoObligatorio;
    //validarcampocorreo
    @FindBy(xpath = "//*[contains(text(),'Usuario y/o contraseña equivocada')]")
    private WebElement mensajeError;
    @FindBy(xpath = "//*[contains(text(),'Ingresa texto después del signo')]")
    private WebElement lblCorreoInvalido;

    private WebElement obtenerBtnAgregarCarrito() {

        return DriverContext.getDriver().findElement(
                By.xpath("//button[.//span[contains(text(),'Agregar')]]"));
    }

    private WebElement obtenerProductoCarrito() {
        return DriverContext.getDriver().findElement(
                By.cssSelector(".product-name a"));
    }

    private WebElement obtenerBtnMasCantidad() {
        return DriverContext.getDriver().findElement(
                By.cssSelector("a.item-quantity-change-increment"));
    }

    private WebElement obtenerBtnIrAlCarro() {
        return DriverContext.getDriver().findElement(
                By.id("proceed-to-checkout"));
    }

    private WebElement obtenerBtnEliminar() {
        return DriverContext.getDriver().findElement(
                By.cssSelector("a.item-link-remove"));
    }



    // métodos

    public void ingresarPagina(String url) {
        DriverContext.getDriver().get(url);
    }

    public void cerrarPopup() {

        try {

            Thread.sleep(3000);

            WebElement btnCerrar = DriverContext.getDriver().findElement(
                    By.cssSelector("button.vtex-modal-layout-0-x-closeButton"));

            ((JavascriptExecutor) DriverContext.getDriver())
                    .executeScript("arguments[0].click();", btnCerrar);

            Thread.sleep(1000);

        } catch (Exception e) {

            System.out.println("No apareció popup.");

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

        new WebDriverWait(
                DriverContext.getDriver(),
                Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(
                        By.cssSelector(".vtex-product-summary-2-x-container")));
    }

    public boolean existenProductos() {

        productos = DriverContext.getDriver().findElements(
                By.cssSelector(".vtex-product-summary-2-x-container"));

        System.out.println("Cantidad de productos encontrados: " + productos.size());

        if (productos.isEmpty()) {
            return false;
        }

        visualizarElemento(productos.get(0), 10);

        return true;
    }

    public void seleccionarPrimerProducto() {

        productos = DriverContext.getDriver().findElements(
                By.cssSelector(".vtex-product-summary-2-x-container"));

        visualizarElemento(productos.get(0), 10);

        ((JavascriptExecutor) DriverContext.getDriver())
                .executeScript("arguments[0].scrollIntoView({block:'center'});", productos.get(0));

        new WebDriverWait(
                DriverContext.getDriver(),
                Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(productos.get(0)));

        Actions actions = new Actions(DriverContext.getDriver());
        actions.moveToElement(productos.get(0)).click().perform();
    }
    public void irAlCarrito() {

        WebElement btnIrAlCarro = obtenerBtnIrAlCarro();

        visualizarElemento(btnIrAlCarro, 10);

        System.out.println("Botón visible");

        ((JavascriptExecutor) DriverContext.getDriver())
                .executeScript("arguments[0].click();", btnIrAlCarro);

        System.out.println("Hice click");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("URL ACTUAL: " + DriverContext.getDriver().getCurrentUrl());
    }

    public boolean validarSubtotal() {

        WebDriverWait wait = new WebDriverWait(
                DriverContext.getDriver(),
                Duration.ofSeconds(10));

        WebElement total = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//*[contains(text(),'39.980')]")));

        return total.isDisplayed();
    }

    public void agregarAlCarrito() {

        visualizarElemento(btnAgregarCarrito, 10);

        System.out.println("Antes del click");

        ((JavascriptExecutor) DriverContext.getDriver())
                .executeScript("arguments[0].click();", btnAgregarCarrito);

        System.out.println("Después del click");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("URL: " + DriverContext.getDriver().getCurrentUrl());
    }

    public boolean validarCarritoVacio() {

        try {

            WebDriverWait wait = new WebDriverWait(
                    DriverContext.getDriver(),
                    Duration.ofSeconds(10));

            WebElement mensaje = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(
                            By.cssSelector("h2.empty-cart-title")));

            System.out.println(mensaje.getText());

            return true;

        } catch (Exception e) {
            return false;
        }
    }
    public boolean validarCarrito(String producto) {

        WebElement productoCarrito = DriverContext.getDriver().findElement(
                By.xpath("//*[contains(text(),'" + producto + "')]"));

        visualizarElemento(productoCarrito,20);

        return productoCarrito.isDisplayed();

    }
    //Productonoexiste
    public boolean noExistenProductos() {

        visualizarElemento(lblSinResultados,10);

        return lblSinResultados.isDisplayed();

    }
    //productoalcarrocantidad
    public boolean validarProductoEnCarrito() {

        WebElement btnIrAlCarro = obtenerBtnIrAlCarro();

        visualizarElemento(btnIrAlCarro, 10);

        return btnIrAlCarro.isDisplayed();
    }
    public void aumentarCantidad() {

        WebElement btnMasCantidad = obtenerBtnMasCantidad();

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

        WebElement btnEliminar = obtenerBtnEliminar();

        visualizarElemento(btnEliminar, 10);

        btnEliminar.click();
    }

    //refrech
    public void refrescarPagina() {

        DriverContext.getDriver().navigate().refresh();

    }

    public boolean validarProductoPermanece() {

        WebElement productoCarrito = obtenerProductoCarrito();

        visualizarElemento(productoCarrito, 20);

        return productoCarrito.isDisplayed();
    }
    public void escribirCorreo(String correo) {

        WebDriverWait wait = new WebDriverWait(
                DriverContext.getDriver(),
                Duration.ofSeconds(20));

        WebElement txtCorreo = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.id("client-email")));

        ((JavascriptExecutor) DriverContext.getDriver())
                .executeScript("arguments[0].scrollIntoView({block:'center'});", txtCorreo);

        txtCorreo.click();
        txtCorreo.clear();
        txtCorreo.sendKeys(correo);

        System.out.println("Valor escrito: " + txtCorreo.getAttribute("value"));

    }
    public void escribirPassword(String password) {

        visualizarElemento(txtPassword, 20);

        ((JavascriptExecutor) DriverContext.getDriver())
                .executeScript("arguments[0].scrollIntoView({block:'center'});", txtPassword);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ((JavascriptExecutor) DriverContext.getDriver())
                .executeScript("arguments[0].click();", txtPassword);

        txtPassword.clear();
        txtPassword.sendKeys(password);
    }
    public void hacerClickEntrar(){
        visualizarElemento(btnEntrar,10);
        btnEntrar.click();

    }
    public boolean validarCorreoInvalido() {

        WebElement txtCorreo = DriverContext.getDriver().findElement(
                By.id("client-email"));

        visualizarElemento(txtCorreo, 10);

        String mensaje = txtCorreo.getAttribute("validationMessage");

        System.out.println("==============================");
        System.out.println("Mensaje navegador: " + mensaje);
        System.out.println("==============================");

        return mensaje != null &&
                (mensaje.contains("Ingresa texto")
                        || mensaje.contains("correo@")
                        || mensaje.contains("incompleta"));
    }
    public boolean validarMensajeError() {

        visualizarElemento(lblErrorLogin,10);

        return lblErrorLogin.getText()
                .contains("Usuario y/o contraseña equivocada");
    }
    public void completarCompra() {

        System.out.println("* ENTRE A COMPLETAR COMPRA *");

        visualizarElemento(btnCompletarCompra,10);

        JavascriptExecutor js = (JavascriptExecutor) DriverContext.getDriver();

        js.executeScript("arguments[0].scrollIntoView({block:'center'});", btnCompletarCompra);
        js.executeScript("arguments[0].click();", btnCompletarCompra);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("URL: " + DriverContext.getDriver().getCurrentUrl());
    }
    public boolean validarIngresoCheckout() {
        visualizarElemento(txtIdentificacion,10);
        return txtIdentificacion.isDisplayed();

    }
    //ContinuarCheckout
    public void presionarContinuarCheckout() {

        visualizarElemento(btnContinuarCheckout, 10);

        JavascriptExecutor js = (JavascriptExecutor) DriverContext.getDriver();

        js.executeScript(
                "arguments[0].scrollIntoView({block:'center'});",
                btnContinuarCheckout);

        js.executeScript(
                "arguments[0].click();",
                btnContinuarCheckout);
    }
    public boolean validarMensajeCampoObligatorio() {

        System.out.println("Cantidad de mensajes: "
                + mensajesCampoObligatorio.size());

        return mensajesCampoObligatorio.size() >= 4;
    }
    public void ingresarAlLogin() {

        cerrarPopup();

        visualizarElemento(btnMiCuenta, 10);

        JavascriptExecutor js = (JavascriptExecutor) DriverContext.getDriver();
        js.executeScript("arguments[0].click();", btnMiCuenta);

        WebDriverWait wait = new WebDriverWait(
                DriverContext.getDriver(),
                Duration.ofSeconds(20));

        WebElement txtCorreo = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//input[@placeholder='Ej.: ejemplo@mail.com']")));
    }
    public boolean validarLoginExitoso() {

        visualizarElemento(btnMiCuenta,10);

        return btnMiCuenta.isDisplayed();
    }

    public boolean validarCategoria() {

        return DriverContext.getDriver()
                .getCurrentUrl()
                .contains("guitarras");

    }
    public void seleccionarCategoria() {

        visualizarElemento(btnGuitarras,10);

        btnGuitarras.click();

    }

}



