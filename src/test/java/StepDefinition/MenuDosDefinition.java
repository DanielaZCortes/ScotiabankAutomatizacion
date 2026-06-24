package StepDefinition;

import io.cucumber.java.en.Given;
import ObjectPage.MenuDosPage;

public class MenuDosDefinition {

    @Given("ingreso al menu dos")
    public void ingresoAlMenuDos() throws InterruptedException {
        MenuDosPage menuDos = new MenuDosPage();
        menuDos.seleccionarMasSueldo();
        System.out.println("Ingreso al menu dos");
    }
}