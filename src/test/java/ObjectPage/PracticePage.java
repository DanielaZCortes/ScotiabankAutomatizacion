package ObjectPage;

import Control.DriverContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.By;



import java.util.List;

public class PracticePage {
    private WebDriver driver;

public PracticePage() {
    driver = DriverContext.getDriver();
    PageFactory.initElements(driver, this);
}


@FindBy(linkText = "Test Exceptions")
    private WebElement linkTestExceptions;

    @FindBy(xpath = "//button[@id='add_btn']")
    private WebElement btnAdd;

    @FindBy(name = "Save")
    private List<WebElement> btnSave;

    @FindBy(xpath = "//*[contains(text(),'Row 1 was saved')]")
    private WebElement msgConfirmacion;

    @FindBy(xpath = "//input[@type='text']")
    private WebElement txtCaptcha;

    public void escribirCaptcha(String captcha) {
        txtCaptcha.clear();
        txtCaptcha.sendKeys(captcha);
    }

    //metodos
    public void clickTestExceptions(){
        linkTestExceptions.click();
    }
    public void clickPractice(){
        linkTestExceptions.click();
    }
    public void presionarAdd(){
        btnAdd.click();
    }
    public void validarMensajeConfirmacion(){
        System.out.println(msgConfirmacion.getText());
    }
    public void presionarSave(){
        driver.findElement(By.name("Save")).click();
    }

}
