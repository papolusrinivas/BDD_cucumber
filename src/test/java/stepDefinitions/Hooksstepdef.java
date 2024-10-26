package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Hooksstepdef {
	
	//global hooks
	@Before("@First")
	public void setup()
	{
		System.out.println("launch ff");
	}
@After()
public void tearDown()
{
	System.out.println("close the browser");
}



	
	@Given("this is the first step")
	public void this_is_the_first_step() {
		System.out.println("1st setp");
	   
	}
	@When("this is the second step")
	public void this_is_the_second_step() {
		System.out.println("2nd setp");
	}
	@Then("this is the third step")
	public void this_is_the_third_step() {
		System.out.println("3rd setp");
	}

	
}
