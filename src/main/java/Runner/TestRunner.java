package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "\\Users\\shilp\\eclipse-workspace\\FreeCRMBDDFramework1\\src\\main\\java\\Feature\\login.feature" //the path of the feature files
		
		)
 
public class TestRunner {
 
}