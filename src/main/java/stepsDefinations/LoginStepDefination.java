package stepsDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefination {
	
	WebDriver driver;
	
	@Given("^user is already on login page$")
	public void user_is_already_on_login_page() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shilp\\eclipse-workspace\\DataDrivenProject\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://classic.freecrm.com/");	
	}
	
	@When("^title of the Login page is Free CRM$")
	public void title_of_the_Login_page_is_Free_CRM() {
		
		String title = driver.getTitle();
		System.out.println("Title of the login page: " + title);
	}
	
	@Then("^user enters username and password$")
	public void user_enters_username_and_password() {
		
	}
	
	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() {
		
	}
	
	@Then("^user is on home page$")
	public void user_is_on_home_page()
	{
		
	}

}
