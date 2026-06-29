package ObjectPage;
import Control.BaseController;
import Control.DriverContext;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MasSueldoPage extends BaseController {
    private WebDriver driver;

    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[1]/header/nav/div/div[3]/div/div/div/nav/ul/li[1]/a")
    private WebElement MasSueldo;
    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[2]/div/div[2]/div/div[2]/a[2]")
    private WebElement UneteaScotia;
    @FindBy(xpath = "//*[@id=\"dataEntry_title\"]")
    private WebElement Ingresatusdatos;
    @FindBy(xpath = "//*[@id=\"dataEntry_rut-label\"]")
    private WebElement RUT;
    @FindBy(xpath = "//*[@id=\"dataEntry_numSerie-label\"]")
    private WebElement Numerodeserie;
    @FindBy(xpath = "//*[@id=\"dataEntry_salary-label\"]")
    private WebElement Rentaliquida;
    @FindBy(xpath = "//*[@id=\"dataEntry_inputs_container\"]/div[4]/div/div/label")
    private WebElement Nacionalidad;
    @FindBy(xpath = "//*[@id=\"dataEntry_inputs_container\"]/div[5]/div/div/label")
    private WebElement Situacionlaboral;
    @FindBy(xpath = "//*[@id=\"dataEntry_inputs_container\"]/div[6]/div/div/label")
    private WebElement Ocupacion;
    @FindBy(xpath = "//*[@id=\"dataEntry_rutReferido-label\"]")
    private WebElement Referidoopcional;
    @FindBy(xpath = "//*[@id=\"dataEntry_checkbox_container\"]//a")
    private WebElement TituloAcuerdodePrivacidad;
    @FindBy(xpath = "//*[@id=\"dataEntry_btn_continue\"]")
    private WebElement AutorizaryContinuar;
    @FindBy(xpath = "//*[@id=\"modal-dialog-label\"]")
    private WebElement Mensaje;
    //losbeneficios
    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/section/div/div/div[1]/div/div/div[1]")
    private WebElement Conocetodoslosbeneficios;
    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/section/div/div/div[1]/div/div/div[2]/div/div[1]/p")
    private WebElement TasasPreferenciales;
    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/section/div/div/div[1]/div/div/div[2]/div/div[2]/p")
    private WebElement SegurodeCesantia;
    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/section/div/div/div[1]/div/div/div[2]/div/div[3]/p")
    private WebElement MisionesScotiaRewards;
    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/section/div/div/div[2]/div[1]/div/p")
    private WebElement Hasta50000ScotiaPesos;
    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/section/div/div/div[2]/div[2]/div/p")
    private WebElement CuotasSinInteres;
    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/section/div/div/div[2]/div[3]/div/p")
    private WebElement extraenlaacumulacion;
    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/section/div/div/div[2]/div[4]/div/p")
    private WebElement BeneficiosenInversiones;
    //benefiostarjeta
    @FindBy(xpath = "//img[contains(@src,'massueldo-tabla')]")
    private WebElement tablaBeneficios;

    //losplanes
    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/div[7]/div/div[2]/div/div/a")
    private WebElement ConocelosPlanes;
    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/section[2]/div/h2")
    private WebElement ConocenuestrosPlanes;
    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/section[2]/div/p")
    private WebElement VentajasPlanes;
    @FindBy(xpath = "//a[@data-name='mas-futuro']")
    private WebElement tarjetaPlanFuturo;
    @FindBy(xpath = "//*[contains(text(),'Resumen de Plan y requisitos')]")
    private WebElement resumenPlanFuturo;
    @FindBy(xpath = "//*[contains(text(),'Sin renta mínima')]")
    private WebElement sinRentaMinima;
    @FindBy(xpath = "//*[contains(text(),'Cuenta Corriente con limite de abono')]")
    private WebElement cuentaCorrienteLimiteAbono;
    @FindBy(xpath = "//*[contains(text(),'Tarifa Rebajada Plan')]")
    private WebElement tarifaRebajadaPlanFuturo;
    @FindBy(xpath = "//*[contains(text(),'Costo $0')]")
    private WebElement costoCeroPlanFuturo;
    @FindBy(xpath = "//*[contains(text(),'Si cumples con una o más de estas condiciones')]")
    private WebElement condicionesPlanFuturo;
    @FindBy(xpath = "//*[contains(text(),'Abono mensual')]")
    private WebElement abonoMensualPlanFuturo;
    @FindBy(xpath = "//*[contains(text(),'Inversiones en Deposito a plazo')]")
    private WebElement depositoPlazoPlanFuturo;
    @FindBy(xpath = "//*[contains(text(),'1 Pago Automatico de Cuentas con cargo')]")
    private WebElement pagoAutomaticoPlanFuturo;
    @FindBy(xpath = "//*[contains(text(),'Tarifa Plan')]")
    private WebElement tarifaPlanFuturo;
    @FindBy(xpath = "//*[contains(text(),'CONTRATACIÓN 100%')]")
    private WebElement contratacion100;

    @FindBy(xpath = "//a[@data-name='conoce-mas-plan-scotiabank']")
    private WebElement tarjetaPlanScotiabank;
    @FindBy(xpath = "//*[contains(text(),'Plan SCOTIABANK')]")
    private WebElement tituloPlanScotiabank;
    @FindBy(xpath = "//*[contains(text(),'Renta mínima')]")
    private WebElement rentaMinimaScotiabank;
    @FindBy(xpath = "//*[contains(text(),'Plan con Cuenta Corriente')]")
    private WebElement cuentaCorrienteScotiabank;
    @FindBy(xpath = "//*[contains(text(),'Tarifa Rebajada Plan')]")
    private WebElement tarifaRebajadaScotiabank;
    @FindBy(xpath = "//*[contains(text(),'Costo $0')]")
    private WebElement costoCeroScotiabank;
    @FindBy(xpath = "//*[contains(text(),'Si cumples con una o más de estas condiciones')]")
    private WebElement condicionesScotiabank;
    @FindBy(xpath = "//*[contains(text(),'Abono mensual')]")
    private WebElement abonoMensualScotiabank;
    @FindBy(xpath = "//*[contains(text(),'Inversiones en DAP')]")
    private WebElement inversionesScotiabank;
    @FindBy(xpath = "//*[contains(text(),'3 Pagos Automático')]")
    private WebElement pagosAutomaticosScotiabank;
    @FindBy(xpath = "//*[contains(text(),'Tarifa Plan')]")
    private WebElement tarifaPlanScotiabank;
    @FindBy(xpath = "//*[contains(text(),'EL PRIMER MES DE TU PLAN ES GRATIS')]")
    private WebElement primerMesGratis;

    @FindBy(xpath = "//*[contains(text(),'Plan SCOTIABANK PLUS')]")
    private WebElement tituloPlanScotiabankPlus;
    @FindBy(xpath = "//a[@data-name='conoce-mas-plan-scotiabank-plus']")
    private WebElement tarjetaPlanScotiabankPlus;
    @FindBy(xpath = "//*[contains(text(),'Renta mínima')]")
    private WebElement rentaMinimaPlus;
    @FindBy(xpath = "//*[contains(text(),'Plan con Cuenta Corriente')]")
    private WebElement cuentaCorrientePlus;
    @FindBy(xpath = "//*[contains(text(),'Tarifa Rebajada Plan')]")
    private WebElement tarifaRebajadaPlus;
    @FindBy(xpath = "//*[contains(text(),'Costo $0')]")
    private WebElement costoCeroPlus;
    @FindBy(xpath = "//*[contains(text(),'Si cumples con una o más de estas condiciones')]")
    private WebElement condicionesPlus;
    @FindBy(xpath = "//*[contains(text(),'Abono mensual')]")
    private WebElement abonoMensualPlus;
    @FindBy(xpath = "//*[contains(text(),'Inversiones en DAP')]")
    private WebElement inversionesPlus;
    @FindBy(xpath = "//*[contains(text(),'3 Pagos Automatico')]")
    private WebElement pagosAutomaticosPlus;
    @FindBy(xpath = "//*[contains(text(),'Tarifa Plan')]")
    private WebElement tarifaPlanPlus;
    @FindBy(xpath = "//*[contains(text(),'LOS PRIMEROS TRES MESES DE TU PLAN SON GRATIS')]")
    private WebElement tresMesesGratis;
    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/section[2]/div/div/div[4]/a")
    private WebElement hazteClienteAqui;
    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/section[2]/div/div/div[4]/p")
    private WebElement mensajeFinalPagina;

    // METODOS (EVENTOS)

    public void seleccionarMasSueldo() {
        MasSueldo.click();
    }

    public void seleccionarUneteaScotia() {
        UneteaScotia.click();
    }

    public void seleccionarIngresatusdatos() {
        Ingresatusdatos.click();
    }

    public void seleccionarIngresaRUT(String rut) {
        RUT.sendKeys(rut);
    }

    public void seleccionarIngresaNumerodeserie(String NumerodeSerie) {
        Numerodeserie.sendKeys(NumerodeSerie);
    }

    public void seleccionarIngresaRentaliquida(String rentaliquida) {
        Rentaliquida.sendKeys(rentaliquida);
    }

    public void seleccionarIngresaNacionalidad() {
        Nacionalidad.click();
    }

    public void seleccionarIngresaSituacionlaboral() {
        Situacionlaboral.click();
    }

    public void seleccionarIngresaOcupacion() {
        Ocupacion.click();
    }

    public void seleccionarIngresaReferidoopcional(String Referido) {
        Referidoopcional.sendKeys(Referido);
    }

    public void VerificarFormularioIngreso() {
        visualizarElemento(Ingresatusdatos, 10);
    }

    public void verificarMensaje(String mensaje) {
        visualizarElemento(Mensaje, 10);
    }

    public void seleccionarAcuerdodePrivacidad() {
        TituloAcuerdodePrivacidad.click();
    }

    public void seleccionarAutorizaryContinuar() {
        AutorizaryContinuar.click();
    }
    public void verificarAcuerdodePrivacidad(){
        visualizarElemento(TituloAcuerdodePrivacidad,10);
    }

    //metodosdebeneficios
    public void verificarConocetodoslosbeneficios(){
        visualizarElemento(Conocetodoslosbeneficios,10);

    }
    public void verificarTasasPreferenciales() {
        visualizarElemento(TasasPreferenciales, 10);
    }
    public void verificarSegurodeCesantia() {
        visualizarElemento(SegurodeCesantia, 10);
    }
    public void verificarMisionesScotiaRewards() {
        visualizarElemento(MisionesScotiaRewards, 10);
    }
    public void verificarHasta50000ScotiaPesos() {
        visualizarElemento(Hasta50000ScotiaPesos, 10);
    }
    public void verificarCuotasSinInteres() {
        visualizarElemento(CuotasSinInteres, 10);
    }
    public void verificarextraenlaacumulacion() {
        visualizarElemento(extraenlaacumulacion, 10);
    }
    public void verificarBeneficiosenInversiones() {
        visualizarElemento(BeneficiosenInversiones, 10);
    }
    //beneficiosconysin
    public void visualizarTablaBeneficios() {
        tablaBeneficios.click();
    }

    public void verificarBeneficiosConTarjeta() {
        tablaBeneficios.click();
    }

    public void verificarBeneficiosSinTarjeta() {
        tablaBeneficios.click();
    }
    public void verificarPaginaPlanes() {
        visualizarElemento(ConocelosPlanes, 10);
    }
    public void verificarTituloPlanes() {
        visualizarElemento(ConocenuestrosPlanes, 10);
    }
    public void verificarTextoInformativoPlanes() {
        visualizarElemento(VentajasPlanes, 10);
    }

    public void seleccionarPlanFuturo() {
        tarjetaPlanFuturo.click();
    }
    public void validarInformacionPlanFuturo() {
        visualizarElemento(resumenPlanFuturo, 10);
        visualizarElemento(sinRentaMinima, 10);
        visualizarElemento(cuentaCorrienteLimiteAbono, 10);
        visualizarElemento(tarifaRebajadaPlanFuturo, 10);
        visualizarElemento(costoCeroPlanFuturo, 10);
        visualizarElemento(condicionesPlanFuturo, 10);
        visualizarElemento(abonoMensualPlanFuturo, 10);
        visualizarElemento(depositoPlazoPlanFuturo, 10);
        visualizarElemento(pagoAutomaticoPlanFuturo, 10);
        visualizarElemento(tarifaPlanFuturo, 10);
        visualizarElemento(contratacion100, 10);
    }

    public void seleccionarPlanScotiabank() {
        tarjetaPlanScotiabank.click();
    }
    public void validarInformacionPlanScotiabank() {
        visualizarElemento(tituloPlanScotiabank, 10);
        visualizarElemento(rentaMinimaScotiabank, 10);
        visualizarElemento(cuentaCorrienteScotiabank, 10);
        visualizarElemento(tarifaRebajadaScotiabank, 10);
        visualizarElemento(costoCeroScotiabank, 10);
        visualizarElemento(condicionesScotiabank, 10);
        visualizarElemento(abonoMensualScotiabank, 10);
        visualizarElemento(inversionesScotiabank, 10);
        visualizarElemento(pagosAutomaticosScotiabank, 10);
        visualizarElemento(tarifaPlanScotiabank, 10);
        visualizarElemento(primerMesGratis, 10);
    }
    public void seleccionarPlanScotiabankPlus() {
        tarjetaPlanScotiabankPlus.click();
    }
    public void validarInformacionPlanScotiabankPlus() {
        visualizarElemento(tituloPlanScotiabankPlus,10);
        visualizarElemento(rentaMinimaPlus, 10);
        visualizarElemento(cuentaCorrientePlus, 10);
        visualizarElemento(tarifaRebajadaPlus, 10);
        visualizarElemento(costoCeroPlus, 10);
        visualizarElemento(condicionesPlus, 10);
        visualizarElemento(abonoMensualPlus, 10);
        visualizarElemento(inversionesPlus, 10);
        visualizarElemento(pagosAutomaticosPlus, 10);
        visualizarElemento(tarifaPlanPlus, 10);
        visualizarElemento(tresMesesGratis, 10);
    }
    public void verificarBotonHazteCliente() {
        visualizarElemento(hazteClienteAqui, 10);
    }

    public void verificarMensajeFinal() {
        visualizarElemento(mensajeFinalPagina, 10);
    }


}






















