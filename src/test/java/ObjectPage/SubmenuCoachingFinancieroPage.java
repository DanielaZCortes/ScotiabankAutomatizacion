package ObjectPage;

import Control.BaseController;
import Control.DriverContext;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SubmenuCoachingFinancieroPage extends BaseController {
    private WebDriver driver;
    //contructor
    public SubmenuCoachingFinancieroPage(){
        driver =
                DriverContext.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[2]/header/nav/div/div[3]/div/div/div/nav/ul/li[8]/a")
    private WebElement CoachingFinanciero;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[2]/header/nav/div/div[3]/div/div/div/nav/ul/li[7]/div/div[1]/div/div[1]/ul/li[1]/a")
    private WebElement IngresaScotiaImpulsa;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[2]/header/nav/div/div[3]/div/div/div/nav/ul/li[7]/div/div[1]/div/div[1]/ul/li[2]/a")
    private WebElement ArtículosdeCoachingFinanciero;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[2]/header/nav/div/div[3]/div/div/div/nav/ul/li[7]/div/div[1]/div/div[1]/ul/li[3]/a")
    private WebElement ArtículosdeCoachingenInversiones;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[2]/header/nav/div/div[3]/div/div/div/nav/ul/li[7]/div/div[1]/div/div[1]/ul/li[4]/a")
    private WebElement ImpulsandotuPrevención;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[2]/header/nav/div/div[3]/div/div/div/nav/ul/li[7]/div/div[1]/div/div[1]/ul/li[5]/a")
    private WebElement ImpulsandotusFinanzas;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[2]/header/nav/div/div[3]/div/div/div/nav/ul/li[7]/div/div[1]/div/div[1]/ul/li[6]/a")
    private WebElement ImpulsandotuTranquilidad;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[2]/header/nav/div/div[3]/div/div/div/nav/ul/li[8]/div/div[1]/div/div[2]/ul/li[1]/a")
    private WebElement RevivelascharlasdeCoachingyEntrenamientoFinanciero;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[2]/header/nav/div/div[3]/div/div/div/nav/ul/li[7]/div/div[1]/div/div[1]/ul/li[2]/a")
    private WebElement Ponenformatupresupuesto;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[2]/header/nav/div/div[3]/div/div/div/nav/ul/li[8]/div/div[1]/div/div[2]/ul/li[3]/a")
    private WebElement ConoceyagendatusproximassesionesdeCoachingFinanciero;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[2]/header/nav/div/div[3]/div/div/div/nav/ul/li[7]/div/div[1]/div/div[1]/ul/li[4]/a")
    private WebElement EnseñademaneraentretenidaFinanzasPersonales;

    // METODOS (EVENTOS)

    public void seleccionarCoachingFinanciero() {
        CoachingFinanciero.click();
    }

    public void seleccionarIngresaScotiaImpulsa() {
        IngresaScotiaImpulsa.click();
    }

    public void seleccionarArtículosdeCoachingFinanciero() {
        ArtículosdeCoachingFinanciero.click();
    }

    public void seleccionarArtículosdeCoachingenInversiones() {
        ArtículosdeCoachingenInversiones.click();
    }

    public void seleccionarImpulsandotuPrevención() {
        ImpulsandotuPrevención.click();
    }

    public void ImpulsandotusFinanzas() {
        ImpulsandotusFinanzas.click();
    }

    public void seleccionarImpulsandotuTranquilidad() {
        ImpulsandotuTranquilidad.click();
    }

    public void RevivelascharlasdeCoachingyEntrenamientoFinanciero() {
        RevivelascharlasdeCoachingyEntrenamientoFinanciero.click();
    }

    public void seleccionarPonenformatupresupuesto() {
        Ponenformatupresupuesto.click();
    }

    public void seleccionarConoceyagendatusproximassesionesdeCoachingFinanciero() {
        ConoceyagendatusproximassesionesdeCoachingFinanciero.click();
    }

    public void EnseñademaneraentretenidaFinanzasPersonales() {
        EnseñademaneraentretenidaFinanzasPersonales.click();
    }
}









