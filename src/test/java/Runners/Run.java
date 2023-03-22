package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/firstTest.feature",
        glue = {"StepDefinitions"},
        tags = "@functional and @regression", // support run by logic (and, or, not) ex: @functional and @regression
        plugin = {"json:target/cucumber-report.json"}
)
public class Run  extends AbstractTestNGCucumberTests {

}
