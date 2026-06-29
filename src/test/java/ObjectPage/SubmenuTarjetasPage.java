package ObjectPage;
import Control.BaseController;
import Control.DriverContext;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SubmenuTarjetasPage extends BaseController {
    private WebDriver driver;


    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[1]/header/nav/div/div[3]/div/div/div/nav/ul/li[5]/a")
    private WebElement Tarjeta;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[1]/header/nav/div/div[3]/div/div/div/nav/ul/li[5]/div/div[1]/div/div[1]/ul[1]/ul/li[1]/a")
    private WebElement Credito;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[1]/header/nav/div/div[3]/div/div/div/nav/ul/li[5]/div/div[1]/div/div[1]/ul[1]/ul/li[2]/a")
    private WebElement Debito;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[1]/header/nav/div/div[3]/div/div/div/nav/ul/li[5]/div/div[1]/div/div[1]/ul[1]/ul/li[1]/a")
    private WebElement BeneficioscontunuevaTarjetadeCredito;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[1]/header/nav/div/div[3]/div/div/div/nav/ul/li[5]/div/div[1]/div/div[1]/ul[2]/li[2]/a")
    private WebElement CuotassinInteres;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[1]/header/nav/div/div[3]/div/div/div/nav/ul/li[5]/div/div[1]/div/div[1]/ul[2]/li[3]/a")
    private WebElement Salonesvip;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[1]/header/nav/div/div[3]/div/div/div/nav/ul/li[5]/div/div[1]/div/div[1]/ul[2]/li[4]/a")
    private WebElement PagoAutomaticodeTarjetadeCredito;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[1]/header/nav/div/div[3]/div/div/div/nav/ul/li[5]/div/div[1]/div/div[1]/ul[2]/li[5]/a")
    private WebElement ScotiaRewards;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[1]/header/nav/div/div[3]/div/div/div/nav/ul/li[5]/div/div[1]/div/div[1]/ul[2]/li[6]/a")
    private WebElement PagoFlexible;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[1]/header/nav/div/div[3]/div/div/div/nav/ul/li[5]/div/div[1]/div/div[1]/ul[2]/li[7]/a")
    private WebElement ScotiaDigital;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[1]/header/nav/div/div[3]/div/div/div/nav/ul/li[5]/div/div[1]/div/div[2]/ul[1]/li/a")
    private WebElement SolicitatuAvance;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[1]/header/nav/div/div[3]/div/div/div/nav/ul/li[5]/div/div[1]/div/div[2]/ul[2]/li[1]/a")
    private WebElement Emergencias;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[1]/header/nav/div/div[3]/div/div/div/nav/ul/li[5]/div/div[1]/div/div[2]/ul[2]/li[2]/a")
    private WebElement Bloqueo;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[1]/header/nav/div/div[3]/div/div/div/nav/ul/li[5]/div/div[1]/div/div[2]/ul[2]/li[3]/a")
    private WebElement ActivatuTarjetadeviaje;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[1]/header/nav/div/div[3]/div/div/div/nav/ul/li[5]/div/div[1]/div/div[2]/ul[2]/li[4]/a")
    private WebElement Pagatutarjeta;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[1]/header/nav/div/div[3]/div/div/div/nav/ul/li[5]/div/div[1]/div/div[2]/ul[2]/li[5]/a")
    private WebElement Estadodecuenta;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[1]/header/nav/div/div[3]/div/div/div/nav/ul/li[5]/div/div[1]/div/div[2]/ul[2]/li[6]/a")
    private WebElement ContratosdeTarjetadeCreditoaudibles;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[2]/header/nav/div/div[3]/div/div/div/nav/ul/li[5]/div/div[1]/div/div[2]/ul[2]/li[7]/a")
    private WebElement TarifasyComisionesTarjetas;

    // METODOS (EVENTOS)

    public void seleccionarTarjeta() {
        Tarjeta.click();
    }

    public void seleccionarCredito() {
        Credito.click();
    }

    public void seleccionarDebito() {
        Debito.click();
    }

    public void seleccionarBeneficioscontunuevaTarjetadeCredito() {
        BeneficioscontunuevaTarjetadeCredito.click();
    }

    public void seleccionarCuotassinInteres() {
        CuotassinInteres.click();
    }

    public void seleccionarSalonesvip() {
        Salonesvip.click();
    }

    public void seleccionarPagoAutomaticodeTarjetadeCredito() {
        PagoAutomaticodeTarjetadeCredito.click();
    }


    public void seleccionarScotiaRewards() {
        ScotiaRewards.click();
    }

    public void seleccionarPagoFlexible() {
        PagoFlexible.click();
    }

    public void seleccionarScotiaDigital() {
        ScotiaDigital.click();
    }

    public void seleccionarSolicitatuAvance() {
        SolicitatuAvance.click();
    }

    public void SeleccionarEmergencias() {
        Emergencias.click();
    }

    public void seleccionarBloqueo() {
        Bloqueo.click();
    }

    public void seleccionarActivatuTarjetadeviaje() {
        ActivatuTarjetadeviaje.click();
    }

    public void SeleccionarPagatutarjeta() {
        Pagatutarjeta.click();
    }

    public void seleccionarEstadodecuenta() {
        Estadodecuenta.click();
    }

    public void seleccionarContratosdeTarjetadeCreditoaudibles() {
        ContratosdeTarjetadeCreditoaudibles.click();
    }

    public void seleccionarTarifasyComisionesTarjetas() {
        TarifasyComisionesTarjetas.click();
    }
}
























