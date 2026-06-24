package ObjectPage;
import Control.BaseController;
import Control.DriverContext;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SubmenuCreditosPage extends BaseController {
    private WebDriver driver;
    //contructor
    public SubmenuCreditosPage(){
        driver =
                DriverContext.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[1]/header/nav/div/div[3]/div/div/div/nav/ul/li[4]/a")
    private WebElement Creditos;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[1]/header/nav/div/div[3]/div/div/div/nav/ul/li[1]/div/div[1]/div/div[1]/ul[1]/ul/li[1]/a")
    private WebElement CreditodeConsumo;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[1]/header/nav/div/div[3]/div/div/div/nav/ul/li[4]/div/div[1]/div/div[1]/ul[1]/li[2]/a")
    private WebElement CreditodeConsumoTesla;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[1]/header/nav/div/div[3]/div/div/div/nav/ul/li[4]/div/div[1]/div/div[1]/ul[1]/li[3]/a")
    private WebElement CreditoHipotecario;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[1]/header/nav/div/div[3]/div/div/div/nav/ul/li[4]/div/div[1]/div/div[1]/ul[1]/li[4]/a")
    private WebElement CreditosUniversales;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[1]/header/nav/div/div[3]/div/div/div/nav/ul/li[4]/div/div[1]/div/div[1]/ul[1]/li[5]/a")
    private WebElement VentaactivosinmobiliariosScotia;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[1]/header/nav/div/div[3]/div/div/div/nav/ul/li[4]/div/div[1]/div/div[1]/ul[1]/li[6]/a")
    private WebElement ComopagarenlineatuCreditoAutomotriz;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[1]/header/nav/div/div[3]/div/div/div/nav/ul/li[4]/div/div[1]/div/div[1]/ul[1]/li[7]/a")
    private WebElement SimuladordeCreditodeConsumo;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[1]/header/nav/div/div[3]/div/div/div/nav/ul/li[4]/div/div[1]/div/div[1]/ul[1]/li[8]/a")
    private WebElement ContratosdeCreditosdeConsumoaudibles;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[1]/header/nav/div/div[3]/div/div/div/nav/ul/li[4]/div/div[1]/div/div[1]/ul[2]/li[1]/a")
    private WebElement ProyectosenConvenio;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[1]/header/nav/div/div[3]/div/div/div/nav/ul/li[4]/div/div[1]/div/div[1]/ul[2]/li[2]/a")
    private WebElement ConocelosProyectosSustentables;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[1]/header/nav/div/div[3]/div/div/div/nav/ul/li[4]/div/div[1]/div/div[1]/ul[2]/li[2]/a")
    private WebElement ConocelosVentaactivosinmobiliarios;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[1]/header/nav/div/div[3]/div/div/div/nav/ul/li[4]/div/div[1]/div/div[2]/ul/li[1]/a")
    private WebElement PagatuCreditodeconsumoyCreditoAutomotriz;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[1]/header/nav/div/div[3]/div/div/div/nav/ul/li[4]/div/div[1]/div/div[2]/ul/li[2]/a")
    private WebElement PagatuCAE;

    @FindBy(xpath = "///*[@id=\"siteContent\"]/div/div/div[1]/header/nav/div/div[3]/div/div/div/nav/ul/li[4]/div/div[1]/div/div[2]/ul/li[3]/a")
    private WebElement ConocelosavancesdetuCreditoHipotecario;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[1]/header/nav/div/div[3]/div/div/div/nav/ul/li[4]/div/div[1]/div/div[2]/ul/li[4]/a")
    private WebElement MasinformaciondetusplazosCAE;

    // METODOS (EVENTOS)

    public void seleccionarCreditos() {
        Creditos.click();
    }

    public void seleccionarCreditodeConsumo() {
        CreditodeConsumo.click();
    }

    public void seleccionarCreditodeConsumoTesla() {
        CreditodeConsumoTesla.click();
    }

    public void seleccionarCreditoHipotecario() {
        CreditoHipotecario.click();
    }

    public void seleccionarCreditosUniversales() {
        CreditosUniversales.click();
    }

    public void seleccionarVentaactivosinmobiliariosScotia() {
        VentaactivosinmobiliariosScotia.click();
    }

    public void seleccionarComopagarenlineatuCreditoAutomotriz() {
        ComopagarenlineatuCreditoAutomotriz.click();
    }


    public void seleccionarSimuladordeCreditodeConsumo() {
        SimuladordeCreditodeConsumo.click();
    }

    public void seleccionarContratosdeCreditosdeConsumoaudibles() {
        ContratosdeCreditosdeConsumoaudibles.click();
    }

    public void seleccionarProyectosenConvenio() {
        ProyectosenConvenio.click();
    }

    public void seleccionarConocelosProyectosSustentables() {
        ConocelosProyectosSustentables.click();
    }

    public void ConocelosVentaactivosinmobiliarios() {
        ConocelosVentaactivosinmobiliarios.click();
    }

    public void seleccionarPagatuCreditodeconsumoyCreditoAutomotriz() {
        PagatuCreditodeconsumoyCreditoAutomotriz.click();
    }

    public void seleccionarPagatuCAE() {
        PagatuCAE.click();
    }

    public void ConocelosavancesdetuCreditoHipotecario() {
        ConocelosavancesdetuCreditoHipotecario.click();
    }

    public void seleccionarMasinformaciondetusplazosCAE() {
        MasinformaciondetusplazosCAE.click();
    }
}






















