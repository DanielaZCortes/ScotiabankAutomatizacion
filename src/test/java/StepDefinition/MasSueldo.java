package StepDefinition;
import ObjectPage.MasSueldoPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class MasSueldo {
    private MasSueldoPage sueldoPage = new MasSueldoPage();
    private String planActual;

    @When("ingreso al menu Mas Sueldo")
    public void ingresoAlMenuMasSueldo() {

        System.out.println("Ingresando al menú Más Sueldo...");

        sueldoPage.seleccionarMasSueldo();

        System.out.println("Se ingresó correctamente al menú Más Sueldo.");

    }

    //if se reutiliza para varios botones para comparar lo que llega de feature
    @And("hago clic en el boton {string}")
    public void hagoClickEnElBoton(String boton) {
        if (boton.equals("Únete a Scotia")) {
            sueldoPage.seleccionarUneteaScotia();
        }
        if (boton.equals("Autorizar y Continuar")) {
            sueldoPage.seleccionarAutorizaryContinuar();
        }
    }

    @Then("verifico que se muestre el Formulario de Ingreso")
    public void VerificaFormularioIngreso() {

        sueldoPage.VerificarFormularioIngreso();

    }

    @And("ingreso un RUT {string}")
    public void ingresoRut(String rut) {
        sueldoPage.seleccionarIngresaRUT(rut);
    }

    @And("ingreso el numero de serie {string}")
    public void ingresoNumeroSerie(String Numerodeserie) {
        sueldoPage.seleccionarIngresaNumerodeserie(Numerodeserie);

    }

    @And("ingreso la renta liquida {string}")
    public void ingresoRentaLiquida(String Rentaliquida) {
        sueldoPage.seleccionarIngresaRentaLiquida(Rentaliquida);
    }

    @And("selecciono la nacionalidad {string}")
    public void seleccionoNacionalidad(String nacionalidad) {
        sueldoPage.seleccionarIngresaNacionalidad(nacionalidad);

    }

    @And("selecciono la situacion laboral {string}")
    public void seleccionoSituacionLaboral(String situacion) {
        sueldoPage.seleccionarIngresaSituacionlaboral(situacion);
    }

    @And("selecciono la ocupacion {string}")
    public void seleccionoOcupacion(String ocupacion) {
        sueldoPage.seleccionarIngresaOcupacion(ocupacion);
    }

    @And("ingreso un referido opcional {string}")
    public void ingresoReferido(String referido) {
        sueldoPage.seleccionarIngresaReferidoopcional(referido);
    }

    @Then("verifico que se muestre el mensaje {string}")
    public void verificoMensaje(String mensaje) {
        sueldoPage.verificarMensaje(mensaje);
    }

    @When("hago click en el enlace Acuerdo de Privacidad")
    public void hagoclickAcuerdodePrivacidad() {
        sueldoPage.seleccionarAcuerdodePrivacidad();


    }

    @Then("verifico que se muestre el acuerdo de privacidad")
    public void verificaracuerdodeprivacidad() {
        sueldoPage.verificarAcuerdodePrivacidad();
    }

    @When("hago scroll hasta beneficios")
    public void hagoScrollHastaBeneficios() {
        sueldoPage.scrollHastaBeneficios();
    }

    @And("despliego los beneficios")
    public void despliegoLosBeneficios() {
        sueldoPage.desplegarBeneficios();
    }

    @Then("verifico que se muestre el beneficio {string}")
    public void verificoBeneficio(String beneficio) {

        if (beneficio.equals("Hasta 50.000 ScotiaPesos")) {
            sueldoPage.verificarHasta50000ScotiaPesos();
        }

        if (beneficio.equals("18 Cuotas Sin Interes")) {
            sueldoPage.verificarCuotasSinInteres();
        }

        if (beneficio.equals("50% extra en la acumulacion")) {
            sueldoPage.verificarextraenlaacumulacion();
        }

        if (beneficio.equals("Beneficios en Inversiones")) {
            sueldoPage.verificarBeneficiosenInversiones();
        }

        if (beneficio.equals("Tasas Preferenciales:")) {
            sueldoPage.verificarTasasPreferenciales();
        }

        if (beneficio.equals("Seguro de Cesantia:")) {
            sueldoPage.verificarSegurodeCesantia();
        }

        if (beneficio.equals("Misiones ScotiaRewards:")) {
            sueldoPage.verificarMisionesScotiaRewards();
        }
    }


    @Then("visualizo la tabla de beneficios")
    public void visualizoLaTablaDeBeneficios() {
        sueldoPage.visualizarTablaBeneficios();
    }

    @When("hago clic en la opcion {string}")
    public void hagoClicEnLaOpcion(String opcion) {

        if (opcion.equals("Conoce los Planes")) {
            sueldoPage.seleccionarConoceLosPlanes();
        }
    }

    @Then("verifico que se cargue la pagina de planes")
    public void verificoPaginaPlanes() {
        sueldoPage.verificarPaginaPlanes();
    }

    @And("valido el titulo {string}")
    public void verificoTitulo(String titulo) {
        sueldoPage.verificarPaginaPlanes();
    }

    @And("valido el texto descriptivo de los planes")
    public void verificoTextoInformativoPlanes() {
        sueldoPage.verificarTextoPlanes();
    }

    @Then("valido el plan {string}")
    public void validoElPlan(String plan) {

        planActual = plan;

        if (plan.equals("Plan Futuro")) {
            sueldoPage.verificarPlanFuturo();

        } else if (plan.equals("Plan Scotiabank")) {
            sueldoPage.verificarPlanScotiabank();

        } else if (plan.equals("Plan Scotiabank Plus")) {
            sueldoPage.verificarPlanScotiabankPlus();
        }
    }

    @And("verifico que contenga {string}")
    public void verificoQueContenga(String condicion) {

        String texto = "";

        if (planActual.equals("Plan Futuro")) {
            texto = sueldoPage.obtenerCondicionesPlanFuturo();

        } else if (planActual.equals("Plan Scotiabank")) {
            texto = sueldoPage.obtenerCondicionesPlanScotiabank();

        } else if (planActual.equals("Plan Scotiabank Plus")) {
            texto = sueldoPage.obtenerCondicionesPlanScotiabankPlus();
        }

        texto = texto.replace("\n", " ")
                .replace("\r", " ")
                .replaceAll("\\s+", " ")
                .trim();

        condicion = condicion.replaceAll("\\s+", " ").trim();

        System.out.println("Esperado: " + condicion);
        System.out.println("Capturado: " + texto);

        Assert.assertTrue(texto.contains(condicion));
    }
}






