package Control;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Constant.Constant;

public class BaseController {
    private final WebDriver driver;

    public BaseController() {
        this.driver = DriverContext.getDriver();
        if (this.driver != null) {
            initPage();
        } else {
            System.out.println("Advertencia: WebDriver no está inicializado. Se inicializará cuando sea disponible.");
        }
    }

    protected void initPage() {
        if (this.driver != null) {
            PageFactory.initElements(new AjaxElementLocatorFactory(this.driver, Constant.TIME_RESPONSE), this);
            System.out.println("Elementos de página inicializados correctamente.");
        } else {
            System.out.println("No se pueden inicializar los elementos: WebDriver es null.");
        }
    }

    public boolean visualizarElemento(WebElement elementoWeb, int tiempoEspera) {

        try {

            WebDriverWait wait = new WebDriverWait(
                    DriverContext.getDriver(),
                    Duration.ofSeconds(tiempoEspera));

            wait.until(ExpectedConditions.visibilityOf(elementoWeb));

            System.out.println("Es visible el elemento web: "
                    + elementoWeb.getText());

            return true;

        } catch (Exception e) {

            System.out.println("No es visible el elemento web.");
            e.printStackTrace();

            throw new RuntimeException(e);
        }
    }
}
