package TestRunner;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src/test/resources/Features",
		glue = {"StepDefinitions"},
		plugin = {"pretty", "html:target/cucumber-reports.html"}
		//tags = "@LoginTest"
		 
)
public class CucumberTestRunner extends io.cucumber.testng.AbstractTestNGCucumberTests {

}
	