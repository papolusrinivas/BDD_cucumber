package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Homepagestepdep {
	WebDriver driver;

	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\BDD-Cucumber\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.freecrm.com/");
		driver.manage().window().maximize();
		
	}
	@Then("user enter username and password")
	public void user_enter_username_and_password()
	{
		driver.findElement(By.xpath("//span[contains(text(),\"Log In\")]")).click();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("papolusrinivasu66@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Test@2929");
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
	}
	@Given("some other precondition")
	public void some_other_precondition() {
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("https://ui.cogmento.com/", title);

	}

	@Then("check more outcomes")
	public void check_more_outcomes() throws Throwable {
		Thread.sleep(5000);
		driver.close();

	}


}
