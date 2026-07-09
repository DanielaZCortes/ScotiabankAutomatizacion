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


    @When("hago clic en el buscador")
    public void hagoClicEnElBuscador() {

        try {

            if (marketplacePage == null) {
                marketplacePage = new MarketplacePage();
            }

            marketplacePage.hacerClicBuscador();

        } catch (Exception e) {

            Assert.fail("Error al hacer clic en el buscador: " + e.getMessage());

        }
    }

    @And("escribo {string}")
    public void escribo(String producto) {
        marketplacePage.escribirProducto(producto);
    }

    @And("presiono Enter")
    public void presionoEnter() throws InterruptedException {
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

    //productonoexiste
    @Then("valido que no existan productos")
    public void validoQueNoExistanProductos() {
        Assert.assertTrue(marketplacePage.noExistenProductos());

    }

    //productoalcarro
    @Then("valido que el producto esté en el carrito")
    public void validoQueElProductoEsteEnElCarrito() {

        Assert.assertTrue(marketplacePage.validarProductoEnCarrito());

    }

    //cantidaddeproductos
    @And("ingreso al carrito")
    public void ingresoAlCarrito() {
        marketplacePage.irAlCarrito();
    }

    @And("aumento la cantidad del producto")
    public void aumentoLaCantidadDelProducto() {
        marketplacePage.aumentarCantidad();
    }

    @Then("valido que la cantidad sea 2")
    public void validoQueLaCantidadSea2() {
        Assert.assertTrue(marketplacePage.validarCantidad());
    }

    @Then("valido que el subtotal se actualice")
    public void validoQueElSubtotalSeActualice() {
        Assert.assertTrue(marketplacePage.validarSubtotal());
    }

    //vaciarcarro
    @When("elimino el producto")
    public void eliminoElProducto() {

        marketplacePage.eliminarProducto();

    }

    @Then("valido que el carrito quede vacío")
    public void validoQueElCarritoQuedeVacio() {

        Assert.assertTrue(marketplacePage.validarCarritoVacio());

    }

    //refrech
    @When("refresco la página")
    public void refrescoLaPagina() {
        marketplacePage.refrescarPagina();

    }

    @Then("valido que el producto permanezca en el carrito")
    public void validoQueElProductoPermanezcaEnElCarrito() {
        Assert.assertTrue(marketplacePage.validarProductoPermanece());

    }

    //validar
    @When("escribo el correo {string}")
    public void escriboElCorreo(String correo) {

        if (marketplacePage == null) {
            marketplacePage = new MarketplacePage();
        }

        marketplacePage.escribirCorreo(correo);
    }

    @When("escribo la contraseña {string}")
    public void escriboLaContrasena(String password) {

        marketplacePage.escribirPassword(password);

    }

    @When("presiono el botón Entrar")
    public void presionoElBotonEntrar() {

        marketplacePage.hacerClickEntrar();

    }

    //invalid
    @Then("valido que aparece el mensaje de error")
    public void validoQueApareceElMensajeDeError() {
        Assert.assertTrue(
                marketplacePage.validarMensajeError());

    }

    //Checkout
    @When("presiono completar la compra")
    public void presionoCompletarLaCompra() {
        marketplacePage.completarCompra();

    }

    @When("presiono proceder al pago")
    public void presionoProcederAlPago() {

        marketplacePage.irAlCarrito();
        marketplacePage.completarCompra();

    }
    @When("presiono continuar")
    public void presionoContinuar() {

        if (marketplacePage == null) {
            marketplacePage = new MarketplacePage();
        }
        marketplacePage.presionarContinuarCheckout();
    }
    @When("ingreso al login")
    public void ingresoAlLogin() {

        if (marketplacePage == null) {
            marketplacePage = new MarketplacePage();
        }

        marketplacePage.ingresarAlLogin();
    }
    @Then("valido que el usuario inició sesión")
    public void validoQueElUsuarioInicioSesion() {

        Assert.assertTrue(marketplacePage.validarLoginExitoso());

    }
    @Then("valido que el usuario permanezca sin sesión")
    public void validoQueElUsuarioPermanezcaSinSesion() {
        Assert.assertTrue(marketplacePage.validarCorreoInvalido());
    }

    @Then("valido que ingreso al checkout")
    public void validoQueIngresoAlCheckout() {
        Assert.assertTrue(marketplacePage.validarIngresoCheckout());

    }
    @When("presiono continuar sin completar los datos")
    public void presionoContinuarSinCompletarLosDatos() {

        marketplacePage.presionarContinuarCheckout();

    }
    @Then("valido mensaje de campos obligatorios")
    public void validoMensajeDeCamposObligatorios() {

        Assert.assertTrue(marketplacePage.validarMensajeCampoObligatorio());

    }
    //validacampocorreo
    @Then("valido mensaje de correo invalido")
    public void validoMensajeDeCorreoInvalido() {

        Assert.assertTrue(marketplacePage.validarCorreoInvalido());

    }
    @When("selecciono la categoría {string}")
    public void seleccionoLaCategoria(String categoria) {

        if (marketplacePage == null) {
            marketplacePage = new MarketplacePage();
        }

        marketplacePage.cerrarPopup();
        marketplacePage.seleccionarCategoria();

    }

    @Then("valido que estoy en la categoría")
    public void validoQueEstoyEnLaCategoria() {

        Assert.assertTrue(marketplacePage.validarCategoria());

    }
}