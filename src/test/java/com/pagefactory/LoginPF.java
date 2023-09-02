package com.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPF {
	WebDriver driver;
	LoginFactory log=null;
	
  @Test
  public void verifyswag() {
	  
	  WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("http://www.saucedemo.com/");
		driver.manage().window().maximize();
		log=new LoginFactory(driver);
		log.swaglog("standard_user", "secret_sauce");
		log.clickbtn();
  }
}
