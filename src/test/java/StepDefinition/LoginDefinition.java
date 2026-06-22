package StepDefinition;

import ObjectPage.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginDefinition {

    private final LoginPage loginPage = new LoginPage();

    //aca llamo los metodos de loginpage
    @And("ingresar el usuario {string}")

    public void ingresarUsuario(String usuario) throws InterruptedException {
        loginPage.Escribirusuario(usuario);
        Thread.sleep(4000);
    }

    @And("ingresar la pass {string}")
    public void ingresarLaPass(String password) throws InterruptedException {

        loginPage.Escribirpassword(password);
        Thread.sleep(4000);

    }

    @When("presiono el boton Submit")
    public void presionarElBotonSubmit() throws InterruptedException {
        loginPage.ClickBtnSubmit();
        Thread.sleep(4000);

    }

    @Then("se valida el mensaje de login exitoso {string}")
    public void validarMensajeDeLoginExitoso(String mensaje) {
        loginPage.validarMensaje(mensaje);
    }


}