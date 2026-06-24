package ObjectPage;

import Control.BaseController;
import Control.DriverContext;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SubmenuScotiaDigitalPage extends BaseController {
    private WebDriver driver;
    //contructor
    public SubmenuScotiaDigitalPage(){
        driver =
                DriverContext.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[2]/header/nav/div/div[3]/div/div/div/nav/ul/li[9]/a")
    private WebElement ScotiaDigital;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[2]/header/nav/div/div[3]/div/div/div/nav/ul/li[9]/div/div[1]/div/div[1]/ul[1]/li[1]/a")
    private WebElement AppScotialaaplicacionbancariaALLINCLUSIVE;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[2]/header/nav/div/div[3]/div/div/div/nav/ul/li[9]/div/div[1]/div/div[1]/ul[1]/li[2]/a")
    private WebElement BilleterasDigitalesScotia;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[2]/header/nav/div/div[3]/div/div/div/nav/ul/li[9]/div/div[1]/div/div[1]/ul[1]/li[3]/a")
    private WebElement PagaSIMPLEconScotiaPay;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[2]/header/nav/div/div[3]/div/div/div/nav/ul/li[9]/div/div[1]/div/div[1]/ul[1]/li[4]/a")
    private WebElement PagasincontactoconlaBilleteradeGoogle;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[2]/header/nav/div/div[3]/div/div/div/nav/ul/li[9]/div/div[1]/div/div[1]/ul[2]/li/a")
    private WebElement Firmaelectronica;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[2]/header/nav/div/div[3]/div/div/div/nav/ul/li[9]/div/div[1]/div/div[2]/ul/li[1]/a")
    private WebElement ModeloDigital;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[2]/header/nav/div/div[3]/div/div/div/nav/ul/li[9]/div/div[1]/div/div[2]/ul/li[2]/a")
    private WebElement ModeloScotiaConnect;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[2]/header/nav/div/div[3]/div/div/div/nav/ul/li[9]/div/div[1]/div/div[2]/ul/li[3]/a")
    private WebElement TusAsesoresFinancieros;


    // METODOS (EVENTOS)

    public void seleccionarScotiaDigital() {
        ScotiaDigital.click();
    }

    public void seleccionarAppScotialaaplicacionbancariaALLINCLUSIVE() {
        AppScotialaaplicacionbancariaALLINCLUSIVE.click();
    }

    public void seleccionarBilleterasDigitalesScotia() {
        BilleterasDigitalesScotia.click();
    }

    public void seleccionarPagaSIMPLEconScotiaPay() {
        PagaSIMPLEconScotiaPay.click();
    }

    public void seleccionarPagasincontactoconlaBilleteradeGoogle() {
        PagasincontactoconlaBilleteradeGoogle.click();
    }

    public void SeleccionarFirmaelectronica() {
        Firmaelectronica.click();
    }

    public void seleccionarModeloDigital() {
        ModeloDigital.click();
    }

    public void SeleccionarModeloScotiaConnect() {
        ModeloScotiaConnect.click();
    }

    public void seleccionarTusAsesoresFinancieros() {
        TusAsesoresFinancieros.click();
    }
}






