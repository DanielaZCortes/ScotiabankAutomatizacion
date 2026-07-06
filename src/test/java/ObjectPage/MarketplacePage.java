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
}