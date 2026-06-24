package StepDefinition;

import io.cucumber.java.en.Given;
import ObjectPage.MenuSuperiorPage;

public class MenuSuperiorDefinition {

    @Given("ingreso al menu superior")
    public void ingresoAlMenuSuperior()throws InterruptedException {
        //objeto que me crea la intancia
        MenuSuperiorPage menuSuperior = new MenuSuperiorPage();
        menuSuperior.seleccionariniciativaMujeres();


        System.out.println("Ingreso al menu superior");
    }


}
