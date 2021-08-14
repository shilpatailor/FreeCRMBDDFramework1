package Runner;

import org.junit.runner.RunWith; 
import cucumber.api.junit.Cucumber; 
import cucumber.api.CucumberOptions; 


@RunWith(Cucumber.class)
@CucumberOptions(
		 //the path of the feature files
		features="src\\test\\java\\Feature\\tagging.feature", //the path of the feature files
		glue="stepsDefinations", //the path of the step definition files
		dryRun=false,  //to check the mapping is proper between feature file and step def file
		monochrome=true, //display the console output in a proper readable format
		plugin= {"pretty","html:target/test-output/cucumber.html", "json:target/json_ouput/cucumber.json", "junit:junit_xml/cucumber.xml"}, //to generate different types of reporting
		strict = true  //it will check if any step is not defined in step definition file
		//,tags = {"~@SmokeTest", "~@RegressionTest", "~@End2End"}
		)
 
public class TestRunner {
 
}

    //ORed : tags = {"@SmokeTest , @RegressionTest"} -- execute all tests tagged as @SmokeTest OR @RegressionTest
	//ANDed : tags = tags = {"@SmokeTest" , "@RegressionTest"} -- execute all tests tagged as @SmokeTest AND @RegressionTest