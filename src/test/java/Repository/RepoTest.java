package Repository;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RepoTest {
  @Test
  public void testobj() throws IOException {
	  
	  File src=new File("C:\\Users\\aganpatr\\eclipse-workspace\\snapdealapp\\src\\test\\java\\Repository\\swagRepo.properties");
	  FileInputStream fis=new FileInputStream(src);
	  Properties pro=new Properties();
	  pro.load(fis);
	    WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();

	  driver.findElement(By.xpath(pro.getProperty("swag.log.uname.xpath"))).sendKeys("standard_user");
	  driver.findElement(By.xpath(pro.getProperty("swag.log.pwd.xpath"))).sendKeys("secret_sauce");
	  driver.findElement(By.xpath(pro.getProperty("swag.log.logbtn.xpath"))).click();
  }
  
}
