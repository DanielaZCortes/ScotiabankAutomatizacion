package StepDefinition;
import Control.NavSelector;
import Constant.Navegador;
import Control.DriverContext;
import ObjectPage.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class HomeDefinition {

    private final HomePage homePage = new HomePage();

    @And("ingreso el nombre {string}")
    public void ingresarElNombre(String nombre) {
        homePage.ingresarNombre(nombre);
    }

    @And("ingreso el correo {string}")
    public void ingresarElCorreo(String correo) {
        homePage.ingresarCorreo(correo);
    }

    @And("presiono el boton {string}")
    public void presionarElBoton(String boton) {
        homePage.presionarBoton();
    }

    @And("ingreso {string} en el campo CAPTCHA")
    public void ingresarCaptcha(String captcha) {
        homePage.ingresarCaptcha(captcha);
    }

    @Then("se valida el mensaje home {string}")
    public void validarMensaje(String mensaje) {
        homePage.validarMensaje(mensaje);
    }




}



