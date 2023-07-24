package GlueCode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;



public class Stepdefiniton {
	
@Given("I want to write a step with precondition")
public void pre()
{
	System.out.println("Hi");
}
@When("Login to the flipkart")
public void login() throws Throwable{
	WebDriverManager.chromedriver().setup();
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.amazon.in/");
	String title = driver.getTitle();
	//report_log(title);
}

}
