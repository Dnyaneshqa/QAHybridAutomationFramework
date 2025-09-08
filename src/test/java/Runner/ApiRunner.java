package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        features = "./src/test/java/Features/API/api.feature",
        glue = {"StepDef.apiStepDef"},
        plugin = {"pretty", "html:target/cucumber-report.html", "json:target/cucumber.json"},
        monochrome = true
)
public class ApiRunner extends AbstractTestNGCucumberTests {
    @AfterSuite
    public static void setup() throws Exception{
    }

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
