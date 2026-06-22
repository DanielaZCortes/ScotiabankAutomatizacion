package ObjectPage;

import Control.BaseController;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.junit.jupiter.api.Assertions.fail;

public class LoginPage extends BaseController {
    public LoginPage() {
        initPage();
    }

        //aca capture los objetos

        @FindBy(id = "username")
        private WebElement txtuser;
        @FindBy(id = "password")
        private WebElement txtpassword;
        @FindBy(id = "submit")
        private WebElement btnsubmit;
    @FindBy(xpath = "//*[contains(text(),'invalid!')]")
    private WebElement lblLogin;
        //metodos
        public void Escribirusuario (String Usuario){
            this.txtuser.clear();
            this.txtuser.sendKeys(Usuario);

        }
        public void Escribirpassword (String Password){
            this.txtpassword.clear();
            this.txtpassword.sendKeys(Password);
        }

        public void ClickBtnSubmit () {
            this.btnsubmit.click();
        }

    public void validarMensaje(String mensaje) {
        visualizarElemento(lblLogin, 5);
        System.out.println(lblLogin.getText());
    }
    }




