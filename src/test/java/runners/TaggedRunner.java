package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		features="src\\test\\resources\\taggedFeatures",
		glue= "stepDefs",
		monochrome=true,
		tags="@SmokeTest"
		//tags="@SmokeTest"
		//tags="@RegressionTest"
		//tags="@SmokeTest or @RegressionTest"
		//tags="@SmokeTest and @RegressionTest"
		//tags="@SmokeTest and not @RegressionTest"
		//tags="@Phase2 and not @SmokeTest "
		//tags="@Phase1 or @Phase2 and @RegressionTest "  //scripts which has phase2 and regression test as tag will execute and also phase1 scripts all will execute 
		
		)
public class TaggedRunner extends AbstractTestNGCucumberTests{

}
