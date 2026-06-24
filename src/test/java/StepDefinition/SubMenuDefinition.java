package StepDefinition;

import Control.DriverContext;
import io.cucumber.java.en.Given;
import ObjectPage.SubMenuScotiaRewardsPage;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.time.Duration;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SubMenuDefinition {

    @Given("ingreso al submenu")
    public void ingresoAlSubmenu() throws InterruptedException {

        SubMenuScotiaRewardsPage subMenu = new SubMenuScotiaRewardsPage();
        subMenu.seleccionarScotiaRewards();

        WebDriverWait wait = new WebDriverWait(
                DriverContext.getDriver(),
                Duration.ofSeconds(10));

        WebElement marketplace = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//a[contains(text(),'Scotia Marketplace')]")));

        Assert.assertTrue(marketplace.isDisplayed());
    }
}
