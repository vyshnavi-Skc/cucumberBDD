package runners;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src\\test\\resources\\features\\GoogleSearchPage.feature",     //relative path for the feature file, if there are multiple fiels, when we can give upto only package name
		glue= "stepDefs",														//package name:stepDefs 
		monochrome=true															//if we want more readable console output we will give as monochrome=true
		)
public class GooglepageRunner extends AbstractTestNGCucumberTests {
	
}
