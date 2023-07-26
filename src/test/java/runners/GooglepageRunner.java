package runners;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src\\test\\resources\\features\\SendEmail.feature",     //relative path for the feature file, if there are multiple fiels, when we can give upto only package name
		glue= "stepDefs",														//package name:stepDefs 
		monochrome=true,														//if we want more readable console output we will give as monochrome=true
		dryRun=false,
		plugin = {"pretty",                                          //pretty is for giving verbose output in console
//		"usage:target/reports/usageReport",
		"html:target/reports/HTMLReport.html",
//		"json:target/reports/JSONReport.json",
//		"testng:target/reports/TestngReport.xml",
//		"rerun:target/reports/failedScenarios.txt",
		//.html,.json,.xml,usage
//		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		//https://cucumber.io/docs/cucumber/ite for more plugin options and cucumber options
		}
		)
public class GooglepageRunner extends AbstractTestNGCucumberTests {
	}
