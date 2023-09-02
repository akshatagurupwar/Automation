package Step_Def;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.pagefactory.LoginFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LogmultipleTest {
	WebDriver driver;
	LoginFactory log;

	@Given("user is on the login page of swag lab")
	public void user_is_on_the_login_page_of_swag_lab() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.navigate().to("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	    
	}
	@When("user credentials enter username & password")
	public void user_credentials_enter_username_password(DataTable data) {
		log=new LoginFactory(driver);
		List<List<String>> l= data.asLists(String.class);
		List<String> l2=l.get(0);
		log.swaglog(l2.get(0), l2.get(1));
	}
	@When("user click on login button")
	public void user_click_on_login_button() {
	    log.clickbtn();
	}
	@Then("Login should be successful")
	public void login_should_be_successful() {
	   
	}

}
