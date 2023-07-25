package stepDefs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleStepDef {
	WebDriver driver;
	@Given("User launch google page")
	public void user_launch_google_page() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.com/");
	}
	@When("search Java Tutorial")
	public void search_java_tutorial() {
		WebElement schBox=driver.findElement(By.name("q"));
		schBox.sendKeys("Java Tutorial");
		schBox.submit();
	
	}
	@Then("Should display Java result page")
	public void should_display_java_result_page() {
		Assert.assertEquals(driver.getTitle(), "Java Tutorial - Google Search");
		//driver.close();
	}
	@When("search Selenium Tutorial")
	public void search_selenium_tutorial() {
		WebElement schBox=driver.findElement(By.name("q"));
		schBox.sendKeys("Selenium Tutorial");
		schBox.submit();
	
	}
	@Then("Should display Selenium result page")
	public void should_display_selenium_result_page() {
		//TakesScreenshot screen=(TakesScreenshot)driver;
		//byte[] imgByte=screen.getScreenshotAs(OutputType.BYTES);
		Assert.assertEquals(driver.getTitle(), "Selenium Tutorial - Google Search");
		//driver.close();
	}
@After
public void attachScreenshot(Scenario scenario) {
	if(scenario.isFailed()) {
		TakesScreenshot screen=(TakesScreenshot)driver;
		byte[] imgByte=screen.getScreenshotAs(OutputType.BYTES);  //we can attach this bytes directly to scenario in html doc. We cannot atttach the output typ as file to html
		//we need to specify the content type in the html file, hence specifying its type ie, png
		scenario.attach(imgByte, "image/png", "imageOne");
		
	}
}


}
