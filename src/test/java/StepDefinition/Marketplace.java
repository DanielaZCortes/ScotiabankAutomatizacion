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

    }
    @And("aumento la cantidad del producto")
    public void aumentoLaCantidadDelProducto() {

    }
    @Then("valido que la cantidad sea 2")
    public void validoQueLaCantidadSea2() {

    }
    @Then("valido que el subtotal se actualice")
    public void validoQueElSubtotalSeActualice() {

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
    public void escriboElCorreo(String correo){

        marketplacePage.escribirCorreo(correo);

    }
    @When("escribo la contraseña {string}")
    public void escriboLaContrasena(String password){

        marketplacePage.escribirPassword(password);

    }
    @When("presiono el botón Entrar")
    public void presionoElBotonEntrar(){

        marketplacePage.hacerClickEntrar();

    }
    //invalid
    @Then("valido que aparece el mensaje de error")
    public void validoQueApareceElMensajeDeError(){
        Assert.assertTrue(
                marketplacePage.validarMensajeError());

    }
    //Checkout
    @When("presiono completar la compra")
    public void presionoCompletarLaCompra() {
        marketplacePage.completarCompra();

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











}