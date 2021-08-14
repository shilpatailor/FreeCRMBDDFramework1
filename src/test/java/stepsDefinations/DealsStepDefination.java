/*package stepsDefinations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class DealsStepDefination {
	
WebDriver driver;
	
	@Given("^user is already on login page$")
	public void user_is_already_on_login_page() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shilp\\eclipse-workspace\\DataDrivenProject\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://classic.freecrm.com/");	
		driver.manage().window().maximize();
	}
	
	@When("^title of the Login page is Free CRM$")
	public void title_of_the_Login_page_is_Free_CRM() {
		
		String title = driver.getTitle();
		System.out.println("Title of the login page: " + title);
		//Assert.assertEquals("#1 Free CRM for Any Business: Online Customer Relationship Software", title);
	}
	
	@Then("^user enters username and password$")
	public void user_enters_username_and_password(DataTable credentials) {
		
		List<List<String>> dataValues = credentials.raw();
		driver.findElement(By.name("username")).sendKeys(dataValues.get(0).get(0));
		driver.findElement(By.name("password")).sendKeys(dataValues.get(0).get(1));
		
	}
	
	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() {
		
		WebElement loginBtn = driver.findElement(By.xpath("//input[@value='Login']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", loginBtn);
		
	}
	
	@Then("^user is on home page$")
	public void user_is_on_home_page()
	{
		String title = driver.getTitle();
		System.out.println("Home Page title ::"+ title);
		Assert.assertEquals("CRMPRO", title);
	}
	
	@Then("^user move hover to Deals and open New Deals page$")
	public void user_move_hover_to_Deals_and_open_New_Deals_page() {
	    
		driver.switchTo().frame("mainpanel");
		Actions action = new Actions(driver);
		     //a[@title='New Deal']
		WebElement newContactBtn = driver.findElement(By.xpath("//a[contains(text(),'Deals')]"));
		action.moveToElement(newContactBtn).build().perform();
		driver.findElement(By.cssSelector("a[title='New Deal']")).click();
	}
	
	@Then("^user create New Deal and submit$")
	public void user_create_New_Deal_and_submit(DataTable dealsData) {
		
		List<List<String>> dealsValue = dealsData.raw();
	    
		//Title name
		driver.findElement(By.id("title")).sendKeys(dealsValue.get(0).get(0));
		
		//Amount
		driver.findElement(By.id("amount")).sendKeys(dealsValue.get(0).get(1));
		
		//Probability
		driver.findElement(By.id("probability")).sendKeys(dealsValue.get(0).get(2));
		
		//Commissions
		driver.findElement(By.id("probability")).sendKeys(dealsValue.get(0).get(3));
		
		//click on the Save button
		driver.findElement(By.xpath("//input[@value='Save']")).click();
	}
	
	@Then("^close the browser$")
	public void close_the_browser() {
	    
		driver.quit();
	}

}   */
