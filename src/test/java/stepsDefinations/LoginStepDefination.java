/*
 * package stepsDefinations;
 * 
 * import org.openqa.selenium.By; import
 * org.openqa.selenium.JavascriptException; import
 * org.openqa.selenium.JavascriptExecutor; import org.openqa.selenium.WebDriver;
 * import org.openqa.selenium.WebElement; import
 * org.openqa.selenium.chrome.ChromeDriver;
 * 
 * import cucumber.api.java.en.Given; import cucumber.api.java.en.Then; import
 * cucumber.api.java.en.When; import junit.framework.Assert;
 * 
 * public class LoginStepDefination {
 * 
 * WebDriver driver;
 * 
 * @Given("^user is already on login page$") public void
 * user_is_already_on_login_page() {
 * 
 * System.setProperty("webdriver.chrome.driver",
 * "C:\\Users\\shilp\\eclipse-workspace\\DataDrivenProject\\Driver\\chromedriver.exe"
 * ); driver = new ChromeDriver(); driver.get("https://classic.freecrm.com/");
 * driver.manage().window().maximize(); }
 * 
 * @When("^title of the Login page is Free CRM$") public void
 * title_of_the_Login_page_is_Free_CRM() {
 * 
 * String title = driver.getTitle();
 * System.out.println("Title of the login page: " + title); //Assert.
 * assertEquals("#1 Free CRM for Any Business: Online Customer Relationship Software"
 * , title); }
 * 
 * // 1. \"([^\"]*)\" and 2. \"(.*)\" both keyword are used, this is called
 * regular expression
 * 
 * @Then("^user enters \"(.*)\" and \"(.*)\"$") public void
 * user_enters_username_and_password(String username, String password) {
 * 
 * driver.findElement(By.name("username")).sendKeys(username);
 * driver.findElement(By.name("password")).sendKeys(password);
 * 
 * }
 * 
 * @Then("^user clicks on login button$") public void
 * user_clicks_on_login_button() {
 * 
 * WebElement loginBtn =
 * driver.findElement(By.xpath("//input[@value='Login']")); JavascriptExecutor
 * js = (JavascriptExecutor)driver; js.executeScript("arguments[0].click();",
 * loginBtn);
 * 
 * }
 * 
 * @Then("^user is on home page$") public void user_is_on_home_page() { String
 * title = driver.getTitle(); System.out.println("Home Page title ::"+ title);
 * Assert.assertEquals("CRMPRO", title); }
 * 
 * }
 */