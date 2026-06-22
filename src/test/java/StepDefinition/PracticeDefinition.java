package StepDefinition;
import ObjectPage.PracticePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class PracticeDefinition {
    private PracticePage practicePage;


    public PracticeDefinition() {
        practicePage = new PracticePage();
    }

    @When("ingresar el test exceptions")
    public void ingresarElTestExceptions() {
        practicePage.clickTestExceptions();
    }

    @And("presionar el boton Add")
    public void presionarElBotonAdd() throws InterruptedException {
        practicePage.presionarAdd();
        Thread.sleep(3000); // espera 3 segundos
    }
    @When("presionar el boton Save")
    public void presionarElBotonSave() {
        practicePage.presionarSave();
    }

    @And("ingresar captcha {string}")
    public void ingresarCaptcha(String captcha) throws InterruptedException {
        practicePage.escribirCaptcha(captcha);
        Thread.sleep(5000);
    }
}
