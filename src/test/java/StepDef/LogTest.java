package StepDef;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.pagefactory.LoginFactory;
import com.snapdeal.snapdealapp.Utils;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LogTest {
	WebDriver driver;
	LoginFactory log;
	
	@Given("user is on the login page of swag lab")
	public void user_is_on_the_login_page_of_swag_lab() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.navigate().to("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		
	}
	@When("^user enter (.*) & (.*)$")
	public void user_enter(String username, String password) {
		 log=new LoginFactory(driver);
         log .swaglog(username, password);
		
		
	}
	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
		log.clickbtn();
		
	}
	@Then("Login should be successful")
	public void login_should_be_successful() throws IOException {
		Utils.captureScreen(driver, "logparam.png");
		
	}


}
