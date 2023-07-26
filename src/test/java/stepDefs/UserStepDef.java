package stepDefs;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserStepDef {
	WebDriver driver;

@Given("User is on Login Page")
public void user_is_on_login_page() {
   driver = new ChromeDriver();
   driver.get("https://the-internet.herokuapp.com/login");
}
//@When("User enters login credential")
//public void user_enters_login_credential() {
//    driver.findElement(By.cssSelector("#username")).sendKeys("tomsmith");
//    driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
//    driver.findElement(By.cssSelector(".fa.fa-2x.fa-sign-in")).click();
//}

@When("User enters {string} and {string}")
public void user_enters_and(String strUser, String strPwd) {
	  driver.findElement(By.cssSelector("#username")).sendKeys(strUser);
	    driver.findElement(By.id("password")).sendKeys(strPwd);
	    driver.findElement(By.cssSelector(".fa.fa-2x.fa-sign-in")).click();
  
}
//
//@When("User enters login credential")
//public void user_enters_login_credential(DataTable datatable) {
//	List<List<String>> dt=datatable.asLists();
//	String strUser=dt.get(0).get(0);
//	String strPwd=dt.get(0).get(1);
//    driver.findElement(By.cssSelector("#username")).sendKeys(strUser);
//    driver.findElement(By.id("password")).sendKeys(strPwd);
//    driver.findElement(By.cssSelector(".fa.fa-2x.fa-sign-in")).click();
//}

//Datatable as list of map
@When("User enters login credential")
public void user_enters_login_credential(DataTable datatable) {
	List<Map<String, String>> dt = datatable.asMaps();
	String strUser=dt.get(0).get("username");
	String strPwd=dt.get(0).get("password");
    driver.findElement(By.cssSelector("#username")).sendKeys(strUser);
    driver.findElement(By.id("password")).sendKeys(strPwd);
    driver.findElement(By.cssSelector(".fa.fa-2x.fa-sign-in")).click();
}

@Then("Should display Home Page")
public void should_display_home_page() {
   boolean isValidUser = driver.findElement(By.cssSelector("div.flash.success")).isDisplayed();
   Assert.assertTrue(isValidUser);
   driver.close();
}

}
