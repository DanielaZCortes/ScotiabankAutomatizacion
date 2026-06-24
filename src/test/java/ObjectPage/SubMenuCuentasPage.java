package ObjectPage;
import Control.BaseController;
import Control.DriverContext;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SubMenuCuentasPage extends BaseController {
    private WebDriver driver;
    //contructor
    public SubMenuCuentasPage(){
        driver =
                DriverContext.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[2]/header/nav/div/div[3]/div/div/div/nav/ul/li[3]/a")
    private WebElement Cuentas;

    @FindBy(xpath = "///*[@id=\"siteContent\"]/div/div/div[2]/header/nav/div/div[3]/div/div/div/nav/ul/li[3]/div/div/div[1]/div[1]/ul[1]/li[1]/a")
    private WebElement PlanSingularbyScotiabankUltimate;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[2]/header/nav/div/div[3]/div/div/div/nav/ul/li[3]/div/div/div[1]/div[1]/ul[1]/li[2]/a")
    private WebElement PlanSingularbyScotiabank;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[1]/header/nav/div/div[3]/div/div/div/nav/ul/li[3]/div/div/div[1]/div[1]/ul[1]/li[3]/a")
    private WebElement PlanSCotiabankplus;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[1]/header/nav/div/div[3]/div/div/div/nav/ul/li[3]/div/div/div[1]/div[1]/ul[1]/li[4]/a")
    private WebElement PlanScotiabank;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[1]/header/nav/div/div[3]/div/div/div/nav/ul/li[3]/div/div/div[1]/div[1]/ul[1]/li[5]/a")
    private WebElement PlanFuturo;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[2]/header/nav/div/div[3]/div/div/div/nav/ul/li[3]/div/div/div[1]/div[1]/ul[1]/li[6]/a")
    private WebElement Conocetodoslosplanes;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[2]/header/nav/div/div[3]/div/div/div/nav/ul/li[3]/div/div/div[1]/div[1]/ul[2]/li[1]/a")
    private WebElement PlanJovenProfesional;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[1]/header/nav/div/div[3]/div/div/div/nav/ul/li[3]/div/div/div[1]/div[1]/ul[2]/li[2]/a")
    private WebElement CuentaCorrienteStartRightProgram;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[1]/header/nav/div/div[3]/div/div/div/nav/ul/li[3]/div/div/div[1]/div[1]/ul[2]/li[3]/a")
    private WebElement CuentadeAhorroScotiaKids;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[1]/header/nav/div/div[3]/div/div/div/nav/ul/li[3]/div/div/div[1]/div[1]/ul[2]/li[4]/a")
    private WebElement CuentaDigitalScotiaTeens;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[1]/header/nav/div/div[3]/div/div/div/nav/ul/li[3]/div/div/div[1]/div[1]/ul[2]/li[5]/a")
    private WebElement SegurosparatuFamiliayMascotas;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[1]/header/nav/div/div[3]/div/div/div/nav/ul/li[3]/div/div/div[1]/div[2]/ul/li[1]/a")
    private WebElement Refiereygana;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[1]/header/nav/div/div[3]/div/div/div/nav/ul/li[3]/div/div/div[1]/div[2]/ul/li[2]/a")
    private WebElement CuentaRentaPlus;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[1]/header/nav/div/div[3]/div/div/div/nav/ul/li[3]/div/div/div[1]/div[2]/ul/li[3]/a")
    private WebElement CuentaCorrienteenDolares;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[1]/header/nav/div/div[3]/div/div/div/nav/ul/li[3]/div/div/div[1]/div[2]/ul/li[4]/a")
    private WebElement TransferenciadeUSDalExtranjero;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[1]/header/nav/div/div[3]/div/div/div/nav/ul/li[3]/div/div/div[1]/div[2]/ul/li[5]/a")
    private WebElement AbonodeRemuneraciones;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[1]/header/nav/div/div[3]/div/div/div/nav/ul/li[3]/div/div/div[1]/div[2]/ul/li[6]/a")
    private WebElement LineadeCredito;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[1]/header/nav/div/div[3]/div/div/div/nav/ul/li[3]/div/div/div[1]/div[2]/ul/li[7]/a")
    private WebElement PagoAutomaticodeCuentas;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[1]/header/nav/div/div[3]/div/div/div/nav/ul/li[3]/div/div/div[1]/div[2]/ul/li[8]/a")
    private WebElement Solicitudespendientes;

    // METODOS (EVENTOS)

    public void seleccionarCuentas() {
        Cuentas.click();
    }

    public void seleccionarPlanSingularbyScotiabankUltimate() {
        PlanSingularbyScotiabankUltimate.click();
    }

    public void seleccionarPlanSingularbyScotiabank() {
        PlanSingularbyScotiabank.click();
    }

    public void seleccionarPlanSCotiabankplus() {
        PlanSCotiabankplus.click();
    }

    public void seleccionarPlanScotiabank() {
        PlanScotiabank.click();
    }

    public void seleccionarPlanFuturo() {
        PlanFuturo.click();
    }

    public void seleccionarConocetodoslosplanes() {
        Conocetodoslosplanes.click();
    }


    public void seleccionarCuentaCorrienteStartRightProgram() {
        CuentaCorrienteStartRightProgram.click();
    }

    public void seleccionarCuentadeAhorroScotiaKids() {
        CuentadeAhorroScotiaKids.click();
    }

    public void seleccionarCuentaDigitalScotiaTeens() {
        CuentaDigitalScotiaTeens.click();
    }

    public void seleccionarSegurosparatuFamiliayMascotas() {
        SegurosparatuFamiliayMascotas.click();
    }

    public void SeleccionarRefiereygana() {
        Refiereygana.click();
    }

    public void seleccionarCuentaRentaPlus() {
        CuentaRentaPlus.click();
    }

    public void seleccionarCuentaCorrienteenDolares() {
        CuentaCorrienteenDolares.click();
    }

    public void SeleccionarTransferenciadeUSDalExtranjero() {
        TransferenciadeUSDalExtranjero.click();
    }

    public void seleccionarAbonodeRemuneraciones() {
        AbonodeRemuneraciones.click();
    }

    public void seleccionarLineadeCredito() {
        LineadeCredito.click();
    }

    public void seleccionarPagoAutomaticodeCuentas() {
        PagoAutomaticodeCuentas.click();
    }

    public void seleccionarSolicitudespendientes() {
        Solicitudespendientes.click();
    }
}
















