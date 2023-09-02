package StepDef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.pagefactory.RediffFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RediffTest {
	
	WebDriver driver;
	RediffFactory red;
	
	@Given("user is on home page")
	public void user_is_on_home_page() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
	    
	}
	@When("^user gives (.*) in search field$")
	public void user_gives_in_search_field(String keyword) {
		red=new RediffFactory(driver);
		red.stext(keyword);
	    
	}
	@When("user clicks on search icon")
	public void user_clicks_on_search_icon() {
		red.sbtn();
	    
	}
	@Then("search data should be displayed")
	public void search_data_should_be_displayed() {
	   
	}

}
