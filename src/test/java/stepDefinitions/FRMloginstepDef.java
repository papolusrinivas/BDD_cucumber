package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FRMloginstepDef {
	WebDriver driver;
	
	
	@Given("user is alredy in home page")
	public void user_is_alredy_in_home_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\BDD-Cucumber\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.freecrm.com/");
		driver.manage().window().maximize();
		String title =driver.getCurrentUrl();
		
	    
	}
	@When("click on login button")
	public void click_on_login_button() {
		driver.findElement(By.xpath("//span[contains(text(),\"Log In\")]")).click();
	 
	}
	@Then("user is on login page")
	public void user_is_on_login_page() {
		String loginpage=driver.getTitle();
	   
	}
	@Then("me enter {string} and {string} into the login form")
	public void me_enter_and_into_the_login_form(String username, String password) {
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		
	}
	@Then("user is click login in login page")
	public void user_is_click_login_in_login_page() {
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();  
	}
	@Then("user is on mainpage")
	public void user_is_on_mainpage() {
		String loginpage=driver.getTitle();
	    
	}
	@Then("click on Tasks")
	public void click_on_Tasks() {
		driver.findElement(By.xpath("//span[contains(text(),'Tasks')]")).click();
		driver.findElement(By.xpath("//div[6]//button[1]//i[1]")).click();
	    
	}
	@Then("I  {string} and {string} into the task")
	public void i_and_into_the_task(String title, String company) {
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(title);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(company);
		
	}
	
	@Then("click on save button")
	public void click_on_save_button() {
	    
	}




}
