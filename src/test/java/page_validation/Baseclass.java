package page_validation;

import java.util.HashMap;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;

import io.cucumber.java.Scenario;

public class Baseclass {
	
	public WebDriver driver = null;
	public WebDriverWait wait = null;
	public Actions actions = null;
	public String scenarioKeyword = null;
	public HashMap<String, Object> excel_map = new HashMap<String, Object>();
	
	public Scenario scenario;
	

	@BeforeTest
	public void initialize_scenario(Scenario scenario) {
		
		this.scenario = scenario;
	}
	
	public void capture_screenshot() {
		byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		scenario.attach(screenshot, "image/png", "screenshot");
	}
	
	public void report_log(String log_entry) {
		scenario.log(log_entry);
	}

}