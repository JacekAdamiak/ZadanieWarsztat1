package cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src/test/java/cucumber/features", glue = "cucumber.steps",
        plugin = {"pretty", "html:reports/out"})

public class CreateNewAddressWar1Test {
}
