package ObjectPage;
import Control.BaseController;
import Control.DriverContext;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SubmenuInversionesPage extends BaseController {
    private WebDriver driver;
    //contructor
    public SubmenuInversionesPage(){
        driver =
                DriverContext.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[2]/header/nav/div/div[3]/div/div/div/nav/ul/li[7]/a")
    private WebElement Inversiones;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[2]/header/nav/div/div[3]/div/div/div/nav/ul/li[7]/div/div[1]/div/div[1]/ul/li[1]/a")
    private WebElement QueesScotiaGlobalAssetManagement;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[2]/header/nav/div/div[3]/div/div/div/nav/ul/li[7]/div/div[1]/div/div[1]/ul/li[2]/a")
    private WebElement ConocenuestrosFondosMutuos;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[2]/header/nav/div/div[3]/div/div/div/nav/ul/li[7]/div/div[1]/div/div[1]/ul/li[3]/a")
    private WebElement VisionEstrategiadeInversion;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[2]/header/nav/div/div[3]/div/div/div/nav/ul/li[7]/div/div[1]/div/div[1]/ul/li[4]/a")
    private WebElement InformacionNormativaSociedadAdministradora;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[2]/header/nav/div/div[3]/div/div/div/nav/ul/li[7]/div/div[1]/div/div[1]/ul/li[5]/a")
    private WebElement ComunicadosImportantesaParticipes;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[2]/header/nav/div/div[3]/div/div/div/nav/ul/li[7]/div/div[1]/div/div[1]/ul/li[6]/a")
    private WebElement Premios;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[2]/header/nav/div/div[3]/div/div/div/nav/ul/li[7]/div/div[1]/div/div[2]/ul/li[1]/a")
    private WebElement AhorraSmart;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[2]/header/nav/div/div[3]/div/div/div/nav/ul/li[7]/div/div[1]/div/div[2]/ul/li[2]/a")
    private WebElement DepositoaPlazo;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[2]/header/nav/div/div[3]/div/div/div/nav/ul/li[7]/div/div[1]/div/div[2]/ul/li[3]/a")
    private WebElement FondosMutuos;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[2]/header/nav/div/div[3]/div/div/div/nav/ul/li[7]/div/div[1]/div/div[2]/ul/li[4]/a")
    private WebElement AhorroPrevisionalVoluntario;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[2]/header/nav/div/div[3]/div/div/div/nav/ul/li[7]/div/div[1]/div/div[2]/ul/li[5]/a")
    private WebElement CompraVentadeDivisas;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[2]/header/nav/div/div[3]/div/div/div/nav/ul/li[7]/div/div[1]/div/div[2]/ul/li[6]/a")
    private WebElement AccesoparaInversionistassinCuentaCorriente;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[2]/header/nav/div/div[3]/div/div/div/nav/ul/li[7]/div/div[1]/div/div[3]/ul/li[1]/a")
    private WebElement CorredoradeBolsaChile;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[2]/header/nav/div/div[3]/div/div/div/nav/ul/li[7]/div/div[1]/div/div[2]/ul/li[2]/a")
    private WebElement ProductosyServicios;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[2]/header/nav/div/div[3]/div/div/div/nav/ul/li[7]/div/div[1]/div/div[2]/ul/li[3]/a")
    private WebElement InversionesenLinea;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[2]/header/nav/div/div[3]/div/div/div/nav/ul/li[7]/div/div[1]/div/div[2]/ul/li[4]/a")
    private WebElement InformaciondeMercado;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[2]/header/nav/div/div[3]/div/div/div/nav/ul/li[7]/div/div[1]/div/div[4]/ul/li[1]/a")
    private WebElement AsesoresFinancieros;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[2]/header/nav/div/div[3]/div/div/div/nav/ul/li[7]/div/div[1]/div/div[2]/ul/li[2]/a")
    private WebElement Ciberseguridad;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[2]/header/nav/div/div[3]/div/div/div/nav/ul/li[7]/div/div[1]/div/div[2]/ul/li[3]/a")
    private WebElement AhorroyCredito;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[2]/header/nav/div/div[3]/div/div/div/nav/ul/li[7]/div/div[1]/div/div[2]/ul/li[4]/a")
    private WebElement FinanzaseInversiones;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[2]/header/nav/div/div[3]/div/div/div/nav/ul/li[7]/div/div[1]/div/div[2]/ul/li[5]/a")
    private WebElement ViajesyEntretenimiento;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[2]/header/nav/div/div[3]/div/div/div/nav/ul/li[7]/div/div[1]/div/div[2]/ul/li[6]/a")
    private WebElement InformesFinancieros;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[2]/header/nav/div/div[3]/div/div/div/nav/ul/li[7]/div/div[1]/div/div[5]/ul/li[1]/a")
    private WebElement PortalEducativodeInversiones;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[2]/header/nav/div/div[3]/div/div/div/nav/ul/li[7]/div/div[1]/div/div[2]/ul/li[2]/a")
    private WebElement EducacionFondosMutuos;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[2]/header/nav/div/div[3]/div/div/div/nav/ul/li[7]/div/div[1]/div/div[2]/ul/li[3]/a")
    private WebElement EducacionDepositoaPlazo;

    // METODOS (EVENTOS)

    public void seleccionarInversiones() {
        Inversiones.click();
    }

    public void seleccionarQueesScotiaGlobalAssetManagement() {
        QueesScotiaGlobalAssetManagement.click();
    }

    public void seleccionarConocenuestrosFondosMutuos() {
        ConocenuestrosFondosMutuos.click();
    }

    public void seleccionarVisionEstrategiadeInversion() {
        VisionEstrategiadeInversion.click();
    }

    public void seleccionarInformacionNormativaSociedadAdministradora() {
        InformacionNormativaSociedadAdministradora.click();
    }

    public void seleccionarComunicadosImportantesaParticipes() {
        ComunicadosImportantesaParticipes.click();
    }

    public void seleccionarPremios() {
        Premios.click();
    }


    public void seleccionarAhorraSmart() {
        AhorraSmart.click();
    }

    public void seleccionarDepositoaPlazo() {
        DepositoaPlazo.click();
    }

    public void seleccionarFondosMutuos() {
        FondosMutuos.click();
    }

    public void seleccionarAhorroPrevisionalVoluntario() {
        AhorroPrevisionalVoluntario.click();
    }

    public void seleccionarCompraVentadeDivisas() {
        CompraVentadeDivisas.click();
    }

    public void seleccionarAccesoparaInversionistassinCuentaCorriente() {
        AccesoparaInversionistassinCuentaCorriente.click();
    }

    public void seleccionarCorredoradeBolsaChile() {
        CorredoradeBolsaChile.click();
    }

    public void SeleccionarProductosyServicios() {
        ProductosyServicios.click();
    }

    public void SeleccionarInversionesenLinea() {
        InversionesenLinea.click();
    }

    public void SeleccionarInformaciondeMercado() {
        InformaciondeMercado.click();
    }

    public void SeleccionarAsesoresFinancieros() {
        AsesoresFinancieros.click();
    }

    public void SeleccionarCiberseguridad() {
        Ciberseguridad.click();
    }

    public void SeleccionarAhorroyCredito() {
        AhorroyCredito.click();
    }

    public void SeleccionarFinanzaseInversiones() {
        FinanzaseInversiones.click();
    }

    public void SeleccionarViajesyEntretenimiento() {
        ViajesyEntretenimiento.click();
    }

    public void SeleccionarInformesFinancieros() {
        InformesFinancieros.click();
    }

    public void SeleccionarPortalEducativodeInversiones() {
        PortalEducativodeInversiones.click();
    }

    public void SeleccionarEducacionFondosMutuos() {
        EducacionFondosMutuos.click();
    }

    public void SeleccionarEducacionDepositoaPlazo() {
        EducacionDepositoaPlazo.click();
    }
}






















