package ObjectPage;

import Control.BaseController;
import Control.DriverContext;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import Control.BaseController;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SubMenuScotiaRewardsPage extends BaseController {
    private WebDriver driver;


    @FindBy(xpath="//*[@id=\"siteContent\"]/div/div/div[2]/header/nav/div/div[3]/div/div/div/nav/ul/li[2]/a")
    private WebElement ScotiaRewards ;

    @FindBy(xpath="//*[@id=\"siteContent\"]/div/div/div[2]/header/nav/div/div[3]/div/div/div/nav/ul/li[2]/div/div[1]/div/div[1]/ul/li[1]/a")
    private WebElement ScotiaMarketplace;

    @FindBy(xpath="//*[@id=\"siteContent\"]/div/div/div[1]/header/nav/div/div[3]/div/div/div/nav/ul/li[2]/div/div[1]/div/div[1]/ul/li[2]/a")
    private WebElement Descuentos;

    @FindBy(xpath="//*[@id=\"siteContent\"]/div/div/div[1]/header/nav/div/div[3]/div/div/div/nav/ul/li[2]/div/div[1]/div/div[1]/ul/li[3]/a")
    private WebElement CuotassinInteres;

    @FindBy(xpath="//*[@id=\"siteContent\"]/div/div/div[1]/header/nav/div/div[3]/div/div/div/nav/ul/li[2]/div/div[1]/div/div[1]/ul/li[4]/a")
    private WebElement RutaGourmet;

    @FindBy(xpath="//*[@id=\"siteContent\"]/div/div/div[1]/header/nav/div/div[3]/div/div/div/nav/ul/li[2]/div/div[1]/div/div[1]/ul/li[5]/a")
    private WebElement MisionesyNiveles;

    @FindBy(xpath="//*[@id=\"siteContent\"]/div/div/div[1]/header/nav/div/div[3]/div/div/div/nav/ul/li[2]/div/div[1]/div/div[1]/ul/li[6]/a")
    private WebElement ScotiaPesos;

    @FindBy(xpath="//*[@id=\"siteContent\"]/div/div/div[1]/header/nav/div/div[3]/div/div/div/nav/ul/li[2]/div/div[1]/div/div[1]/ul/li[7]/a")
    private WebElement SorteosScotia;

    @FindBy(xpath="//*[@id=\"siteContent\"]/div/div/div[1]/header/nav/div/div[3]/div/div/div/nav/ul/li[2]/div/div[1]/div/div[1]/ul/li[8]/a")
    private WebElement MundoScotia;

    // METODOS (EVENTOS)

    public void seleccionarScotiaRewards() {
        ScotiaRewards.click();
    }

    public void seleccionarScotiaMarketplace() {
        ScotiaMarketplace.click();
    }

    public void seleccionarDescuentos() {
        Descuentos.click();
    }

    public void seleccionarCuotassinInteres() {
        CuotassinInteres.click();
    }

    public void seleccionarRutaGourmet() {
        RutaGourmet.click();
    }

    public void seleccionarMisionesyNiveles() {
        MisionesyNiveles.click();
    }
    public void seleccionarScotiaPesos() {
        ScotiaPesos.click();
    }
    public void seleccionarSSorteosScotia() {
        SorteosScotia.click();
    }
    public void seleccionarMundoScotia() {
        MundoScotia.click();
    }





}
