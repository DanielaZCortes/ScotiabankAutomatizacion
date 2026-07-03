package StepDefinition;

import Constant.Navegador;
import Control.DriverContext;
import Control.NavSelector;
import io.cucumber.java.en.Given;
import org.junit.Assert;

public class NavDefinition {

    @Given("abro el navegador en la url {string}")
    public void abrirNavegador(String url) throws InterruptedException {

        String nav = System.getProperty("nav", "default");
        Navegador navegador = NavSelector.seleccionNavegador(nav);
        System.out.println("Entro al metodo abrirnavegador");
        DriverContext.setUp(navegador, url);
       System.out.println("Driver creado exitosamente");
        Thread.sleep(5000);

        String urlActual = DriverContext.getDriver().getCurrentUrl();

        System.out.println("URL Actual: " + urlActual);
        System.out.println("URL Esperada: " + url);

        //Assert.assertTrue(
                //urlActual.replace("/", "")
                        //.equals(url.replace("/", ""))
       // );

    }}

