package stepsDefinations;

import java.util.Map;

import org.junit.Assert;
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

//data table with maps : for parameterization of test cases

public class DealsMapStepDefination {
	
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
			
			for (Map<String, String> data : credentials.asMaps(String.class, String.class)) {
			
			driver.findElement(By.name("username")).sendKeys(data.get("username"));
			driver.findElement(By.name("password")).sendKeys(data.get("password"));
		}
		
		
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
	
	@Then("^user mouse hover to Deals and open New Deals page$")
	public void user_mouse_hover_to_Deals_and_open_New_Deals_page() {
	    
		//switch to frame
		driver.switchTo().frame("mainpanel");
		
		//move to new deals page
		Actions action = new Actions(driver);
		     //a[@title='New Deal']
		WebElement newContactBtn = driver.findElement(By.xpath("//a[contains(text(),'Deals')]"));
		action.moveToElement(newContactBtn).build().perform();
		driver.findElement(By.cssSelector("a[title='New Deal']")).click();
	}
	
	@Then("^user create New Deal and submit$")
	public void user_create_New_Deal_and_submit(DataTable dealsData) {
		
		for (Map<String, String> data : dealsData.asMaps(String.class, String.class)) {
			
					driver.findElement(By.id("title")).sendKeys(data.get("title"));
					driver.findElement(By.id("amount")).sendKeys(data.get("amount"));
					driver.findElement(By.id("probability")).sendKeys(data.get("probability"));
					driver.findElement(By.id("commission")).sendKeys(data.get("commission"));
					
					driver.findElement(By.xpath("//input[@type='submit' and @value='Save']")).click(); //save button
						
						//move to new deal page:
					Actions action = new Actions(driver);
					action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Deals')]"))).build().perform();
					driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();
	}
}
		
	@Then("^close the browser$")
	public void close_the_browser() {
	    
		driver.quit();
	}

}
