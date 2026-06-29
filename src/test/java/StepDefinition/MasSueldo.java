package StepDefinition;
import ObjectPage.MasSueldoPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MasSueldo {

    MasSueldoPage masSueldoPage = new MasSueldoPage();

    //aca van los @given,@When,@Then@And

    @Given("abro el navegador en la url {string}")
    public void abrirNavegadorEnLaUrl(String url) throws InterruptedException {
        NavDefinition navDefinition = new NavDefinition();
        navDefinition.abrirNavegador(url);

    }

    @When("ingreso al menú Mas Sueldo")
    public void ingresoAlMenuMasSueldo() {
        masSueldoPage.seleccionarUneteaScotia();
    }

    @And("hago clic en el botón {string}")
    public void hagoClickEnElBoton(String boton) {
        if (boton.equals("unete a scotia")) {
            masSueldoPage.seleccionarUneteaScotia();
        }
        if (boton.equals("Autorizar y Continuar")) {
            masSueldoPage.seleccionarAutorizaryContinuar();
        }
    }

    @Then("verifico que se muestre el Formulario de Ingreso")
    public void VerificarFormularioIngreso() {
        masSueldoPage.VerificarFormularioIngreso();

    }

    @And("ingreso un RUT {string}")
    public void ingresoRut(String rut) {
        masSueldoPage.seleccionarIngresaRUT(rut);

    }

    @And("ingreso el numero de serie {string}")
    public void ingresoNumeroSerie(String Numerodeserie) {
        masSueldoPage.seleccionarIngresaNumerodeserie(Numerodeserie);

    }

    @And("ingreso la renta liquida {string}")
    public void ingresoRentaLiquida(String Rentaliquida) {
        masSueldoPage.seleccionarIngresaRentaliquida(Rentaliquida);

    }

    @And("selecciono la nacionalidad")
    public void seleccionoNacionalidad() {
        masSueldoPage.seleccionarIngresaNacionalidad();

    }

    @And("selecciono la situacion laboral")
    public void seleccionoSituacionLaboral() {
        masSueldoPage.seleccionarIngresaSituacionlaboral();

    }

    @And("selecciono la ocupacion")
    public void seleccionoOcupacion() {
        masSueldoPage.seleccionarIngresaOcupacion();

    }

    @And("ingreso un referido opcional")
    public void ingresoReferido(String referido) {
        masSueldoPage.seleccionarIngresaReferidoopcional(referido);
    }

    @Then("verifico que se muestre el mensaje {string}")
    public void verificoMensaje(String mensaje) {
        masSueldoPage.verificarMensaje(mensaje);
    }

    @When("hago click en el enlace Acuerdo de Privacidad")
    public void hagoclickAcuerdodePrivacidad() {
        masSueldoPage.seleccionarAcuerdodePrivacidad();
    }

    @Then("verifico que se muestre el acuerdo de privacidad")
    public void verificaracuerdodeprivacidad() {
        masSueldoPage.verificarAcuerdodePrivacidad();

    }
    //losbeneficios
    @Then("verifico que se muestre el beneficio {string}")
    public void verificoquesemuesteelbeneficio(String beneficio){
        if (beneficio.equals("Hasta 50.000 ScotiaPesos ")){
            masSueldoPage.verificarHasta50000ScotiaPesos();
        }
        if (beneficio.equals("18 Cuotas Sin Interes")) {
            masSueldoPage.verificarCuotasSinInteres();
        }

        if (beneficio.equals("50% extra en la acumulacion")) {
            masSueldoPage.verificarextraenlaacumulacion();
        }

        if (beneficio.equals("Beneficios en Inversiones")) {
            masSueldoPage.verificarBeneficiosenInversiones();
        }

        if (beneficio.equals("Tasas Preferenciales:")) {
            masSueldoPage.verificarTasasPreferenciales();
        }

        if (beneficio.equals("Seguro de Cesantia:")) {
            masSueldoPage.verificarSegurodeCesantia();
        }

        if (beneficio.equals("Misiones ScotiaRewards:")) {
            masSueldoPage.verificarMisionesScotiaRewards();
        }

    }
    @Then("visualizo la tabla de beneficios")
    public void visualizoLaTablaDeBeneficios() {
        masSueldoPage.visualizarTablaBeneficios();
    }

    @Then("verifico que se muestren los beneficios para clientes con tarjeta de credito")
    public void verificoLosBeneficiosConTarjeta() {
        masSueldoPage.verificarBeneficiosConTarjeta();
    }

    @Then("verifico que se muestren los beneficios para clientes sin tarjeta de credito")
    public void verificoLosBeneficiosSinTarjeta() {
        masSueldoPage.verificarBeneficiosSinTarjeta();
    }
    @Then("verifico que se muestre la pagina de planes")
    public void verificoQueSeMuestreLaPaginaDePlanes() {
        masSueldoPage.verificarPaginaPlanes();
    }

    @Then("verifico el titulo {string}")
    public void verificoElTitulo(String titulo) {
        masSueldoPage.verificarTituloPlanes();
    }

    @Then("verifico el texto informativo de los planes")
    public void verificoElTextoInformativoDeLosPlanes() {
        masSueldoPage.verificarTextoInformativoPlanes();
    }
    @Then("reviso la informacion del Plan Futuro")
    public void revisoLaInformacionDelPlanFuturo() {
        masSueldoPage.seleccionarPlanFuturo();
        masSueldoPage.validarInformacionPlanFuturo();
    }

    @Then("reviso la informacion del Plan Scotiabank")
    public void revisoLaInformacionDelPlanScotiabank() {
        masSueldoPage.seleccionarPlanScotiabank();
        masSueldoPage.validarInformacionPlanScotiabank();
    }

    @Then("reviso la informacion del Plan Scotiabank Plus")
    public void revisoLaInformacionDelPlanScotiabankPlus() {
        masSueldoPage.seleccionarPlanScotiabankPlus();
        masSueldoPage.validarInformacionPlanScotiabankPlus();
    }
    @Then("verifico que se muestre el boton {string}")
    public void verificoQueSeMuestreElBoton(String boton) {
        masSueldoPage.verificarBotonHazteCliente();
    }

    @Then("verifico el mensaje informativo al final de la pagina")
    public void verificoElMensajeInformativoAlFinalDeLaPagina() {
        masSueldoPage.verificarMensajeFinal();
    }

    }




