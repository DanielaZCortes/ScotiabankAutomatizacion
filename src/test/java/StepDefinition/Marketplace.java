package StepDefinition;
import ObjectPage.MarketplacePage;
import ObjectPage.MasSueldoPage;
import Control.DriverContext;
import Control.NavSelector;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Marketplace {
    private MarketplacePage marketplacePage;

    @Given("ingreso a {string}")
    public void ingresoA(String url) {

        marketplacePage.ingresarPagina(url);
        marketplacePage.cerrarPopup();

    }

    @When("hago clic en el buscador")
    public void hagoClicEnElBuscador() {
        if (marketplacePage == null) {
            marketplacePage = new MarketplacePage();
        }
        marketplacePage.hacerClicBuscador();
    }

    @And("escribo {string}")
    public void escribo(String producto) {
        marketplacePage.escribirProducto(producto);
    }

    @And("presiono Enter")
    public void presionoEnter() {
        marketplacePage.presionarEnter();
    }

    @Then("valido que existan productos")
    public void validoQueExistanProductos() {
        Assert.assertTrue(marketplacePage.existenProductos());
    }

    @When("selecciono el primer producto")
    public void seleccionoElPrimerProducto() {
        marketplacePage.seleccionarPrimerProducto();
    }

    @And("agrego el producto al carrito")
    public void agregoElProductoAlCarrito() {
        marketplacePage.agregarAlCarrito();
    }

    @Then("valido que el carrito tenga el producto")
    public void validoQueElCarritoTengaElProducto() {
        Assert.assertTrue(marketplacePage.validarCarrito());
    }
}