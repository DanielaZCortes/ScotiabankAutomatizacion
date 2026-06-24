package ObjectPage;
import Control.BaseController;
import Control.DriverContext;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuDosPage extends BaseController {
    private WebDriver driver;


    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[2]/header/nav/div/div[3]/div/div/div/nav/ul/li[1]/a")
    private WebElement MasSueldo;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[1]/header/nav/div/div[3]/div/div/div/nav/ul/li[2]/a")
    private WebElement ScotiaRewards;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[1]/header/nav/div/div[3]/div/div/div/nav/ul/li[3]/a")
    private WebElement Cuentas;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[1]/header/nav/div/div[3]/div/div/div/nav/ul/li[4]/a")
    private WebElement Creditos;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[1]/header/nav/div/div[3]/div/div/div/nav/ul/li[5]/a")
    private WebElement Tarjetas;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[1]/header/nav/div/div[3]/div/div/div/nav/ul/li[6]/a")
    private WebElement Seguros;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[1]/header/nav/div/div[3]/div/div/div/nav/ul/li[7]/a")
    private WebElement Inversiones;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[1]/header/nav/div/div[3]/div/div/div/nav/ul/li[8]/a")
    private WebElement CoachingFinanciero;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[1]/header/nav/div/div[3]/div/div/div/nav/ul/li[9]/a")
    private WebElement ScotiaDigital;

    // METODOS (EVENTOS)

    public void seleccionarMasSueldo() {
        MasSueldo.click();
    }

    public void seleccionarScotiaRewards() {
        ScotiaRewards.click();
    }

    public void seleccionarCuentas() {
        Cuentas.click();
    }

    public void seleccionarCreditos() {
        Creditos.click();
    }

    public void seleccionarTarjetas() {
        Tarjetas.click();
    }

    public void seleccionarSeguros() {
        Seguros.click();
    }

    public void seleccionarInversiones() {
        Inversiones.click();
    }

    public void seleccionarCoachingFinanciero() {
        CoachingFinanciero.click();


    }

    public void seleccionarScotiaDigital() {
        ScotiaDigital.click();
    }
}


















