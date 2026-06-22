package ObjectPage;

import Control.DriverContext;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import org.junit.Assert;



import java.time.Duration;
import java.util.List;

public class HomePage {

    private WebDriver driver;

    public HomePage() {
        driver = DriverContext.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"form_first_name_7\"]")
    private WebElement txtNombre;

    @FindBy(xpath = "//*[@id=\"form_email_7\"]")
    private WebElement txtCorreo;

    @FindBy(xpath = "//*[@id=\"mp_form_below_posts7\"]/form/div[3]/input")
    private WebElement btnCheatSheet;

    @FindBy(css ="input.mailpoet_text")
    private WebElement txtCaptcha;

    @FindBy(xpath = "//*[contains(text(),´Please fill in the CAPTCHA')]")
    private WebElement msgCaptcha;



    public void ingresarNombre(String nombre) {
        System.out.println("Entró a ingresarNombre");
        txtNombre.clear();
        txtNombre.sendKeys(nombre);
        System.out.println("Nombre escrito");
    }

    public void ingresarCorreo(String correo) {
        System.out.println("Entró a ingresarCorreo");
        txtCorreo.clear();
        txtCorreo.sendKeys(correo);
        System.out.println("Correo escrito");
    }
    public void ingresarCaptcha(String captcha) {
        System.out.println("Entró a ingresarCaptcha");

        txtCaptcha.click();
        txtCaptcha.clear();
        txtCaptcha.sendKeys(captcha);

        System.out.println("Captcha escrito: "
                + txtCaptcha.getAttribute("value"));
    }

    public void presionarBoton() {
        System.out.println("Entró a presionarBoton");
        btnCheatSheet.click();
    }

    public void validarMensaje(String mensaje) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOf(msgCaptcha));

        System.out.println(msgCaptcha.getText());
    }

}








