package stepDefs;

import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class TaggedStepDef {
	@Before(value="@SmokeTest" ,order=2)
//	@Before("@SmokeTest")
	//@Before(order=2)
	public static void initEdge() {
		System.out.println("edge before each scenario...........");
	}
	//@Before(order=3)
	@Before(value="@RegressionTest" ,order=3)
	//@Before("@RegressionTest")
	public static void initChrome() {
		System.out.println("Chrome before each scenario...........");
	}
	@Before(value="@RegressionTest" ,order=1)
	//@Before(order=1)
	public void readPropertyReg() {
		System.out.println("reading from property file regression");
	}
@Before(value="@SmokeTest" ,order=1)
	public void readPropertySmoke() {
		System.out.println("reading from property file smoke test");
	}
	
	//At testng if we need to run any class as befpore and after all scenarios or tests then it needs to be declared as static method
@BeforeAll
public static void setUp() {
	System.out.println("Before all the scenarios...........");
}

//before each scenario
@Before
public static void eachScenario() {
	System.out.println("Before each scenario...........");
}

//before each scenario
@BeforeStep
public static void eachStep() {
	System.out.println("Before each step...........");
}
@AfterAll
public static void tearDown() {
	System.out.println("After all the scenarios...........");
}
@Given("User is logged in")
public void user_is_logged_in() {
   System.out.println("User is logged in");
}
@When("User create a task")
public void user_create_a_task() {
	   System.out.println("User create a task");
}

@When("User delete a deals")
public void user_delete_a_deals() {
	   System.out.println("User delete a deals");
}

@When("User delete a contacts")
public void user_delete_a_contacts() {
	   System.out.println("User delete a contacts");
}

@When("User update a task")
public void user_update_a_task() {
	System.out.println("User update a task");
}


@When("User delete a task")
public void user_delete_a_task() {
	System.out.println("User delete a task");
}


@When("User update a deals")
public void user_update_a_deals() {
	System.out.println("User update a deals");
}

@When("User create a contacts")
public void user_create_a_contacts() {
	System.out.println("User create a contacts");
}
@When("User update a contacts")
public void user_update_a_contacts() {
	System.out.println("User update a contacts");
}
@When("User create a deals")
public void user_create_a_deals() {
	System.out.println("User create a deals");
}
}
