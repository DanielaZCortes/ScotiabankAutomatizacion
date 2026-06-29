package ObjectPage;
import Control.BaseController;
import Control.DriverContext;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SubmenuSegurosPage extends BaseController {
    private WebDriver driver;


    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[1]/header/nav/div/div[3]/div/div/div/nav/ul/li[5]/a")
    private WebElement Seguros;

    @FindBy(xpath = "///*[@id=\"siteContent\"]/div/div/div[2]/header/nav/div/div[3]/div/div/div/nav/ul/li[6]/div/div[1]/div/div[1]/ul/li[1]/a")
    private WebElement SeguroAuto;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[2]/header/nav/div/div[3]/div/div/div/nav/ul/li[6]/div/div[1]/div/div[1]/ul/li[2]/a")
    private WebElement SOAP;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[2]/header/nav/div/div[3]/div/div/div/nav/ul/li[6]/div/div[1]/div/div[2]/ul/li[1]/a")
    private WebElement Celularseguro;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[2]/header/nav/div/div[3]/div/div/div/nav/ul/li[6]/div/div[1]/div/div[2]/ul/li[2]/a")
    private WebElement HogarHomeFlex;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[2]/header/nav/div/div[3]/div/div/div/nav/ul/li[6]/div/div[1]/div/div[2]/ul/li[3]/a")
    private WebElement Mascotas;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[2]/header/nav/div/div[3]/div/div/div/nav/ul/li[6]/div/div[1]/div/div[2]/ul/li[4]/a")
    private WebElement Robo360;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[2]/header/nav/div/div[3]/div/div/div/nav/ul/li[6]/div/div[1]/div/div[2]/ul/li[5]/a")
    private WebElement SegurodeIncendioySismoHipotecario;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[2]/header/nav/div/div[3]/div/div/div/nav/ul/li[6]/div/div[1]/div/div[3]/ul/li[1]/a")
    private WebElement ComplementariodeSalud;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[2]/header/nav/div/div[3]/div/div/div/nav/ul/li[6]/div/div[1]/div/div[3]/ul/li[2]/a")
    private WebElement OncolgicoconBonificacion;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[2]/header/nav/div/div[3]/div/div/div/nav/ul/li[6]/div/div[1]/div/div[3]/ul/li[3]/a")
    private WebElement ProteccionHospitalaria;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[2]/header/nav/div/div[3]/div/div/div/nav/ul/li[6]/div/div[1]/div/div[4]/ul/li[1]/a")
    private WebElement ScotiaTravel;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[2]/header/nav/div/div[3]/div/div/div/nav/ul/li[6]/div/div[1]/div/div[4]/ul/li[2]/a")
    private WebElement SeguroRCI;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[2]/header/nav/div/div[3]/div/div/div/nav/ul/li[6]/div/div[1]/div/div[5]/ul/li[1]/a")
    private WebElement SegurodeAccidentesPersonalesconAhorro;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[2]/header/nav/div/div[3]/div/div/div/nav/ul/li[6]/div/div[1]/div/div[5]/ul/li[2]/a")
    private WebElement AccidentesPersonalesconBonificacion;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[2]/header/nav/div/div[3]/div/div/div/nav/ul/li[6]/div/div[1]/div/div[5]/ul/li[3]/a")
    private WebElement VidaNow;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[2]/header/nav/div/div[3]/div/div/div/nav/ul/li[6]/div/div[1]/div/div[5]/ul/li[4]/a")
    private WebElement AccidentesPersonalesFull;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[2]/header/nav/div/div[3]/div/div/div/nav/ul/li[6]/div/div[1]/div/div[6]/ul[1]/li[1]/a")
    private WebElement ConsultatuSiniestro;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[2]/header/nav/div/div[3]/div/div/div/nav/ul/li[6]/div/div[1]/div/div[6]/ul[1]/li[2]/a")
    private WebElement DenunciadeSiniestrosdeCesantia;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[2]/header/nav/div/div[3]/div/div/div/nav/ul/li[6]/div/div[1]/div/div[6]/ul[1]/li[3]/a")
    private WebElement DenunciaSiniestrosdeotrosseguros;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[2]/header/nav/div/div[3]/div/div/div/nav/ul/li[6]/div/div[1]/div/div[6]/ul[2]/li/a")
    private WebElement ContratosdeSegurosaudibles;

    // METODOS (EVENTOS)

    public void seleccionarSeguros() {
        Seguros.click();
    }

    public void seleccionarSeguroAuto() {
        SeguroAuto.click();
    }

    public void seleccionarSOAP() {
        SOAP.click();
    }

    public void seleccionarCelularseguro() {
        Celularseguro.click();
    }

    public void seleccionarHogarHomeFlex() {
        HogarHomeFlex.click();
    }

    public void seleccionarMascotas() {
        Mascotas.click();
    }

    public void seleccionarRobo360() {
        Robo360.click();
    }


    public void seleccionarSegurodeIncendioySismoHipotecario() {
        SegurodeIncendioySismoHipotecario.click();
    }

    public void seleccionarComplementariodeSalud() {
        ComplementariodeSalud.click();
    }

    public void seleccionarOncolgicoconBonificacion() {
        OncolgicoconBonificacion.click();
    }

    public void seleccionarProteccionHospitalaria() {
        ProteccionHospitalaria.click();
    }

    public void SeleccionarScotiaTravel() {
        ScotiaTravel.click();
    }

    public void seleccionarSeguroRCI() {
        SeguroRCI.click();
    }

    public void seleccionarSegurodeAccidentesPersonalesconAhorro() {
        SegurodeAccidentesPersonalesconAhorro.click();
    }

    public void SeleccionarAccidentesPersonalesconBonificacion() {
        AccidentesPersonalesconBonificacion.click();
    }

    public void seleccionarVidaNow() {
        VidaNow.click();
    }

    public void seleccionarAccidentesPersonalesFull() {
        AccidentesPersonalesFull.click();
    }

    public void seleccionarConsultatuSiniestro() {
        ConsultatuSiniestro.click();
    }

    public void seleccionarDenunciadeSiniestrosdeCesantia() {
        DenunciadeSiniestrosdeCesantia.click();
    }

    public void seleccionarDenunciaSiniestrosdeotrosseguros() {
        DenunciaSiniestrosdeotrosseguros.click();
    }

    public void seleccionarContratosdeSegurosaudibles() {
        ContratosdeSegurosaudibles.click();
    }
}

















