package ObjectPage;

import Control.BaseController;
import Control.DriverContext;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

public class MenuSuperiorPage extends BaseController {


    private WebDriver driver;

    //se declaran los objetos, elementos
    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[2]/header/nav/div/div[1]/div/div/div[1]/ul/li[1]/a")
    private WebElement MenuPersona;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[2]/header/nav/div/div[1]/div/div/div[1]/ul/li[2]/a")
    private WebElement SingularbyScotiabank;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[1]/header/nav/div/div[1]/div/div/div[1]/ul/li[3]/a")
    private WebElement Wealth;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[1]/header/nav/div/div[1]/div/div/div[1]/ul/li[4]/a")
    private WebElement PYME;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[1]/header/nav/div/div[1]/div/div/div[1]/ul/li[5]/a")
    private WebElement GrandesEmpresas;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[1]/header/nav/div/div[1]/div/div/div[1]/ul/li[6]/a")
    private WebElement InvestorRelations;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[2]/header/nav/div/div[1]/div/div/div[1]/ul/li[7]/a")
    private WebElement iniciativaMujeres;




    // METODOS (EVENTOS)

    public void seleccionarMenuPersona() {
        MenuPersona.click();
    }

    public void seleccionarSingularbyScotiabank() {
        SingularbyScotiabank.click();
    }

    public void seleccionarWealth() {
        Wealth.click();
    }

    public void seleccionarPYME() {
        PYME.click();
    }
    public void seleccionarGrandesEmpresas() {
        GrandesEmpresas.click();
    }

    public void seleccionarInvestorRelations() {
        InvestorRelations.click();
    }

    public void seleccionariniciativaMujeres() throws InterruptedException {
        iniciativaMujeres.click();
        }
    }












