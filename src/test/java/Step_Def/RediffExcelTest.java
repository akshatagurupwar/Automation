package Step_Def;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.pagefactory.RediffFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RediffExcelTest {
	WebDriver driver;
	RediffFactory red;
	
	@Given("user is on home page")
	public void user_is_on_home_page() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
	    
	}
	@When("user gives keyword in search field")
	public void user_gives_keyword_in_search_field() throws IOException {
		File file = new File("C:\\Users\\aganpatr\\eclipse-workspace\\snapdealapp\\ExcelData\\data1.xlsx");

		FileInputStream fi = new FileInputStream(file);

		Workbook w = new XSSFWorkbook(fi);

		Sheet s = w.getSheetAt(0);
		Row r = s.getRow(0);
		String c = r.getCell(0).getStringCellValue();
		
		red = new RediffFactory(driver);
		red.stext(c);

	    
	}
	@When("user clicks on search icon")
	public void user_clicks_on_search_icon() {
		red.sbtn();
	    
	}
	@Then("search data should be displayed")
	public void search_data_should_be_displayed() {
	    
	}

}
