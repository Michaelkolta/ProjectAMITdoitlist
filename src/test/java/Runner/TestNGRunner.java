package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"StepDef", "hooks"},
        plugin = {
                "pretty",
                "io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm"
        },
        monochrome = true,
        tags = "@OfflineFunctionality"        // Add your tag here (@Login, @Smoke...)
)
public class TestNGRunner extends AbstractTestNGCucumberTests {

}

