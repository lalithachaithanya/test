package RunnerClass;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import static BaseMethod.Baseclass.*;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/FeatureFile",
        glue = "StepDefination",
        dryRun = true,
        tags = "@Test1",
        plugin = {"pretty", "html:target/cucumber-reports.html"}
)
public class runnerclass {

    @BeforeClass
    public static void start(){
        initializeBrowser();
        dismissAlert();
    }
    @AfterClass
    public static void teardown() {

        if (driver != null) {
            driver.quit();
            driver = null;
        }
        System.out.println("Browser closed successfully");
    }
}
