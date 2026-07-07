package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"StepDefinition"},
        plugin = {"pretty", "html:target/cucumber-report.html"},
        monochrome = true,
        tags = "@Marketplace or @@TC-005 or @TC-006 or @TC-007 or @TC-008 or @TC-009 or @TC-010 or  @TC-013 or @TC-014 or @TC-019 or  @TC-018"

        //or @caso2 or @caso3 or @caso4"
        // "@MenuSuperior" or @MenuDos or @SubMenu"
)
public class Runner {
}