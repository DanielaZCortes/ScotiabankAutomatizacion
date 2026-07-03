package ObjectPage;
import Control.BaseController;
import Control.DriverContext;
import io.cucumber.java.sl.In;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

public class MasSueldoPage extends BaseController {
    private WebDriver driver;

    public MasSueldoPage() {
        super();
        initPage();
    }

    @FindBy(css = "a[data-ide='mas-sueldo']")
    private WebElement MasSueldo;
    @FindBy(xpath = "//a[contains(text(),'Únete a Scotia')]")
    private WebElement UneteaScotia;
    @FindBy(xpath = "//*[@id=\"dataEntry_title\"]")
    private WebElement Ingresatusdatos;
    @FindBy(css = "input[data-testid='dataEntry_rut']")
    private WebElement RUT;
    @FindBy(xpath = "//*[@id=\"dataEntry_numSerie-input\"]")
    private WebElement Numerodeserie;
    @FindBy(xpath = "//*[@id=\"dataEntry_salary-input\"]")
    private WebElement RentaLiquida;
    @FindBy(css = "select[data-testid='data_entry_nationality']")
    private WebElement Nacionalidad;
    @FindBy(id = "data_entry_occupationStatus")
    private WebElement SituacionLaboral;
    @FindBy(id = "data_entry_occupation")
    private WebElement Ocupacion;
    @FindBy(xpath = "//*[@id=\"dataEntry_rutReferido-input\"]")
    private WebElement Referidoopcional;
    @FindBy(xpath = "//div[@id='dataEntry_checkbox_container']//a")
    private WebElement TituloAcuerdodePrivacidad;
    @FindBy(xpath = "//*[@id=\"dataEntry_btn_continue\"]")
    private WebElement AutorizaryContinuar;
    @FindBy(xpath = "//*[@id='modal-dialog-label']")
    private WebElement Mensaje;
    //losbeneficios
    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/section/div/div/div[1]/div/div/div[1]")
    private WebElement Conocetodoslosbeneficios;
    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/section/div/div/div[1]/div/div/div[2]/div/div[1]/p")
    private WebElement TasasPreferenciales;
    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/section/div/div/div[1]/div/div/div[2]/div/div[2]/p")
    private WebElement SegurodeCesantia;
    @FindBy(xpath = "//*[contains(text(),'Misiones ScotiaRewards')]")
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
    @FindBy(xpath = "//*[contains(text(),'Para acceder a la totalidad de beneficios')]")
    private WebElement tituloTablaBeneficios;
    @FindBy(xpath = "//img[contains(@src,'massueldo-tabla')]")
    private WebElement tablaBeneficios;
    @FindBy(xpath = "//*[contains(text(),'Conoce todos los beneficios')]")
    private WebElement conoceTodosLosBeneficios;
    @FindBy(xpath = "//*[contains(text(),'CON TARJETA DE CRÉDITO')]")
    private WebElement beneficiosConTarjeta;
    @FindBy(xpath = "//*[contains(text(),'SIN TARJETA DE CRÉDITO')]")
    private WebElement beneficiosSinTarjeta;

    //losplanes
    @FindBy(css = "a[data-name='conoce-los-planes']")
    private WebElement ConoceLosPlanes;
    @FindBy(xpath = "//h2[contains(normalize-space(),'Conoce nuestros Planes')]")
    private WebElement ConocenuestrosPlanes;
    @FindBy(xpath = "//h2[contains(.,'Conoce nuestros Planes')]/following::p[1]")
    private WebElement VentajasPlanes;
    @FindBy(xpath = "//a[@data-name='conoce-mas-futuro']")
    private WebElement tarjetaPlanFuturo;
    @FindBy(xpath = "//li[contains(.,'Abono mensual')]/parent::ul")
    private WebElement condicionesPlanFuturo;
    @FindBy(xpath = "//a[@data-name='conoce-mas-plan-scotiabank']")
    private WebElement tarjetaPlanScotiabank;
    @FindBy(xpath = "//li[contains(.,'Abono mensual') and contains(.,'$400.000')]/parent::ul")
    private WebElement condicionesPlanScotiabank;
    @FindBy(xpath = "//a[@data-name='conoce-mas-plan-scotiabank-plus']")
    private WebElement tarjetaPlanScotiabankPlus;
    @FindBy(xpath = "//li[contains(.,'Abono mensual') and contains(.,'$1.200.000')]/parent::ul")
    private WebElement condicionesPlanScotiabankPlus;
    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/section[2]/div/div/div[4]/a")
    private WebElement hazteClienteAqui;
    @FindBy(xpath = "//*[@id=\"siteContent\"]/div/div/section[2]/div/div/div[4]/p")
    private WebElement mensajeFinalPagina;

    // METODOS (EVENTOS)

    public void seleccionarMasSueldo() {
        try {

            visualizarElemento(MasSueldo, 20);
            MasSueldo.click();

            System.out.println("Se hizo clic en Más Sueldo.");

            //visualizarElemento(UneteaScotia, 20);

            System.out.println("Página Más Sueldo cargada correctamente.");

        } catch (Exception e) {
            System.out.println("Error al ingresar a Más Sueldo: " + e.getMessage());
            throw e;
        }
    }

    public void seleccionarUneteaScotia() {

        JavascriptExecutor js = (JavascriptExecutor) DriverContext.getDriver();

        js.executeScript("arguments[0].scrollIntoView({block:'center'});", UneteaScotia);

        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        js.executeScript("arguments[0].click();", UneteaScotia);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (String ventana : DriverContext.getDriver().getWindowHandles()) {
            DriverContext.getDriver().switchTo().window(ventana);
        }
    }

    public void VerificarFormularioIngreso() {

        visualizarElemento(Ingresatusdatos, 30);

        System.out.println("Formulario de ingreso visible.");
    }

    public void seleccionarIngresaRUT(String rut) {

        visualizarElemento(RUT, 10);

        JavascriptExecutor js = (JavascriptExecutor) DriverContext.getDriver();
        js.executeScript("arguments[0].scrollIntoView({block:'center'});", RUT);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        RUT.click();
        RUT.clear();
        RUT.sendKeys(rut);

        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void seleccionarIngresaNumerodeserie(String numeroSerie) {
        try {

            if (Numerodeserie == null) {
                throw new NullPointerException("El elemento Numerodeserie es null.");
            }

            visualizarElemento(Numerodeserie, 10);

            JavascriptExecutor js = (JavascriptExecutor) DriverContext.getDriver();
            js.executeScript("arguments[0].scrollIntoView({block:'center'});", Numerodeserie);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (Numerodeserie.isDisplayed() && Numerodeserie.isEnabled()) {
                Numerodeserie.click();
                Numerodeserie.clear();
                Numerodeserie.sendKeys(numeroSerie);

                System.out.println("Se ingresó el número de serie.");
            } else {
                throw new RuntimeException("El campo Número de Serie no está habilitado.");
            }

        } catch (NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
            throw e;
        } catch (Exception e) {
            System.out.println("Error al ingresar número de serie: " + e.getMessage());
            throw e;
        }
    }

    public void seleccionarIngresaRentaLiquida(String rentaLiquida) {
        visualizarElemento(RentaLiquida, 10);
        RentaLiquida.click();
        RentaLiquida.clear();
        RentaLiquida.sendKeys(rentaLiquida);

        System.out.println("Se ingresó la renta líquida.");
    }
    public void seleccionarIngresaNacionalidad(String nacionalidad) {

        visualizarElemento(Nacionalidad, 10);

        Select select = new Select(Nacionalidad);
        select.selectByVisibleText(nacionalidad);

        System.out.println("Nacionalidad seleccionada: " + nacionalidad);
    }

    public void seleccionarIngresaSituacionlaboral(String situacion) {

        visualizarElemento(SituacionLaboral, 10);

        Select select = new Select(SituacionLaboral);
        select.selectByVisibleText(situacion);

        System.out.println("Situación laboral seleccionada: " + situacion);
    }

    public void seleccionarIngresaOcupacion(String ocupacion) {

        visualizarElemento(Ocupacion, 10);

        Select select = new Select(Ocupacion);
        select.selectByVisibleText(ocupacion);

        System.out.println("Ocupación seleccionada: " + ocupacion);
    }

    public void seleccionarIngresaReferidoopcional(String referido) {
        try {
            if (Referidoopcional != null) {
                visualizarElemento(Referidoopcional, 10);
                Thread.sleep(1000);
                Referidoopcional.click();
                Referidoopcional.clear();
                Referidoopcional.sendKeys(referido);
                System.out.println("Se ingresó el referido.");
            } else {
                throw new NullPointerException("El elemento Referidoopcional es null.");
            }
        } catch (Exception e) {
            System.out.println("Error al ingresar referido: " + e.getMessage());
            throw new RuntimeException(e);
        }
    }


    public void verificarMensaje(String mensaje) {

        visualizarElemento(Mensaje, 10);

        Assert.assertTrue(Mensaje.getText().contains(mensaje));
    }

    public void seleccionarAcuerdodePrivacidad() {
        visualizarElemento(TituloAcuerdodePrivacidad, 10);
        TituloAcuerdodePrivacidad.click();
    }

    public void seleccionarAutorizaryContinuar() {
        try {
            if (AutorizaryContinuar != null) {
                visualizarElemento(AutorizaryContinuar, 10);
                AutorizaryContinuar.click();
                System.out.println("Se hizo clic en AutorizaryContinuar exitosamente.");
            } else {
                throw new NullPointerException("El elemento AutorizaryContinuar es null. Asegúrate de que la página fue inicializada después de que el driver fue creado.");
            }
        } catch (NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
            throw e;
        } catch (Exception e) {
            System.out.println("Error al seleccionar AutorizaryContinuar: " + e.getMessage());
            throw e;
        }
    }

    public void verificarAcuerdodePrivacidad() {
        visualizarElemento(TituloAcuerdodePrivacidad, 10);
    }

    public void scrollHastaBeneficios() {

        JavascriptExecutor js = (JavascriptExecutor) DriverContext.getDriver();

        js.executeScript(
                "arguments[0].scrollIntoView({behavior:'instant', block:'center'});",
                conoceTodosLosBeneficios
        );
        try {
            Thread.sleep(800);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void visualizarTablaBeneficios() {
        scrollHastaBeneficios();
        visualizarElemento(tituloTablaBeneficios, 10);
    }
   //conoce nuestros planes
   public void seleccionarConoceLosPlanes() {
        try {
            String ventanaPrincipal = DriverContext.getDriver().getWindowHandle();
            JavascriptExecutor js = (JavascriptExecutor) DriverContext.getDriver();
            js.executeScript("arguments[0].scrollIntoView({block:'center'});", ConoceLosPlanes);
            Thread.sleep(1000);
            js.executeScript("arguments[0].click();", ConoceLosPlanes);
            Thread.sleep(800);
            for (String ventana : DriverContext.getDriver().getWindowHandles()) {
                if (!ventana.equals(ventanaPrincipal)) {
                    DriverContext.getDriver().switchTo().window(ventana);
                   break;
                }
           }
            Thread.sleep(800);
            initPage();
        } catch (Exception e) {
            e.printStackTrace();
           throw new RuntimeException(e);
        }
   }
    //verifico pagina planes
    public void verificarPaginaPlanes() {
        try {
            Thread.sleep(1000);
            visualizarElemento(ConocenuestrosPlanes, 20);
            System.out.println("Página de planes cargada correctamente.");
        } catch (Exception e) {
            System.out.println("Error al verificar la página de planes.");
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
    public void verificarTextoPlanes() {
        try {
            Thread.sleep(1000);
            JavascriptExecutor js = (JavascriptExecutor) DriverContext.getDriver();
            System.out.println("Realizando scroll hasta la sección de ventajas.");
            // Hace scroll hasta el botón
            js.executeScript("arguments[0].scrollIntoView({block:'center'});", VentajasPlanes);
            Thread.sleep(800);
            visualizarElemento(VentajasPlanes, 20);
            System.out.println("Elemento VentajasPlanes encontrado.");
            System.out.println("Texto descriptivo visualizado correctamente.");
        } catch (Exception e) {
            System.out.println("Error al verificar el texto descriptivo.");
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
    //abro plan futuro
    public void verificarPlanFuturo() {
        try {
            Thread.sleep(1000);
            JavascriptExecutor js = (JavascriptExecutor) DriverContext.getDriver();
            js.executeScript("arguments[0].scrollIntoView({block:'center'});",
                    tarjetaPlanFuturo);
            Thread.sleep(800);
            visualizarElemento(tarjetaPlanFuturo, 20);
            System.out.println("Tarjeta Plan Futuro visualizada correctamente.");
        } catch (Exception e) {
            System.out.println("Error al verificar el Plan Futuro.");
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
    public void verificarPlanScotiabank() {
        try {
            Thread.sleep(1000);
            JavascriptExecutor js = (JavascriptExecutor) DriverContext.getDriver();
            js.executeScript("arguments[0].scrollIntoView({block:'center'});",
                    tarjetaPlanScotiabank);
            Thread.sleep(800);
            visualizarElemento(tarjetaPlanScotiabank, 20);
            System.out.println("Tarjeta Plan Scotiabank visualizada correctamente.");
        } catch (Exception e) {
            System.out.println("Error al verificar el Plan Scotiabank.");
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
    public void verificarPlanScotiabankPlus() {
        try {
            Thread.sleep(1000);
            JavascriptExecutor js = (JavascriptExecutor) DriverContext.getDriver();
            js.executeScript("arguments[0].scrollIntoView({block:'center'});",
                    tarjetaPlanScotiabankPlus);
            Thread.sleep(800);
            visualizarElemento(tarjetaPlanScotiabankPlus, 20);
            System.out.println("Tarjeta Plan Scotiabank Plus visualizada correctamente.");
        } catch (Exception e) {
            System.out.println("Error al verificar el Plan Scotiabank Plus.");
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
    public void scrollHastaCondicionesPlanFuturo() {
        JavascriptExecutor js = (JavascriptExecutor) DriverContext.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", condicionesPlanFuturo);
    }
    public String obtenerCondicionesPlanFuturo() {
        try {
            Thread.sleep(1000);
            scrollHastaCondicionesPlanFuturo();
            Thread.sleep(800);
            visualizarElemento(condicionesPlanFuturo, 20);
            JavascriptExecutor js =
                    (JavascriptExecutor) DriverContext.getDriver();
            String texto = (String) js.executeScript(
                    "return arguments[0].textContent;",
                    condicionesPlanFuturo);
            System.out.println("PLAN FUTURO:");
            System.out.println(texto);
            return texto.trim();
        } catch (Exception e) {
            System.out.println("Error al obtener las condiciones del Plan Futuro.");
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
    public String obtenerCondicionesPlanScotiabank() {
        visualizarElemento(condicionesPlanScotiabank, 10);
        JavascriptExecutor js =
                (JavascriptExecutor) DriverContext.getDriver();String texto = (String) js.executeScript(
                "return arguments[0].textContent;",
                condicionesPlanScotiabank);
                System.out.println("SCOTIABANK:");
        System.out.println(texto);
        return texto.trim();
    }

    public String obtenerCondicionesPlanScotiabankPlus() {
    visualizarElemento(condicionesPlanScotiabankPlus, 10);
    JavascriptExecutor js =
            (JavascriptExecutor) DriverContext.getDriver();

    String texto = (String) js.executeScript(
            "return arguments[0].textContent;",
            condicionesPlanScotiabankPlus);
    System.out.println("SCOTIABANK PLUS:");
    System.out.println(texto);
    return texto.trim();
}
    public void desplegarBeneficios() {
        visualizarElemento(Conocetodoslosbeneficios, 10);
        Conocetodoslosbeneficios.click();
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

    public void verificarTasasPreferenciales() {
        visualizarElemento(TasasPreferenciales, 20);
    }

    public void verificarSegurodeCesantia() {
        visualizarElemento(SegurodeCesantia, 20);
    }
    public void verificarMisionesScotiaRewards() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        visualizarElemento(MisionesScotiaRewards, 20);
    }
}



































