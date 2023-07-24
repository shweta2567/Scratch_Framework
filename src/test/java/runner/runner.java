package runner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.FeatureWrapper;
import io.cucumber.testng.PickleWrapper;
import io.cucumber.testng.TestNGCucumberRunner;

@CucumberOptions(
		features = "src/test/java/features", 
		glue = "GlueCode",
		tags="@Test",
		monochrome = true,
		plugin = {"pretty",
				
				"json:Results/cucumberjson/cucumber.json"}
)

public class runner extends AbstractTestNGCucumberTests {

//	plugin = {"pretty",
//			"html:Results/cucumber-reports/cucumber.html",
//			"json:Results/cucumber-reports/cucumber.json"}
	

}
 
