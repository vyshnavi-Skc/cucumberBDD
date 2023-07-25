package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "@target/reports/failedScenarios.txt",
		glue = "stepDefs",
		monochrome=true
		
		)
public class ReRunRunner extends AbstractTestNGCucumberTests {

}
