package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.time.Duration;

public class LoginStepsDefinition {
	
	static WebDriver driver;

	@Given("User is on the login page")
	public void user_is_on_the_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		FirefoxOptions options = new FirefoxOptions();
		options.addArguments("-headless");
		driver = new FirefoxDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.saucedemo.com/v1");
		
		
	}

	@When ("User enters valid username and password")
	public void user_enters_valid_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
	}

	@And ("Clicks on Login Button")
	public void clicks_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver.findElement(By.id("login-button")).click();
	}

	@Then("User is navigated to the Home Page")
	public void user_is_navigated_to_the_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new io.cucumber.java.PendingException();
		String appLogoText = driver.findElement(By.xpath("//div[@class='app_logo']")).getText();
		Assert.assertTrue(appLogoText.contains("Swag Labs"), "User is not navigated to the Home Page");
	}

	@And("Close the browser")
	public void close_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver.quit();
	}



}
