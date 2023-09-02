package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderTest {
  @Test(dataProvider="loginData")
  public void testlog(String user,String pwd) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();

		System.out.println("Thread is: "+Thread.currentThread().getId());
	    driver.findElement(By.id("user-name")).sendKeys(user);
	    Thread.sleep(1000);
	    driver.findElement(By.id("password")).sendKeys(pwd);
	    Thread.sleep(1000);
	    driver.findElement(By.id("login-button")).click();
	    
		/*
		 * String expectedTitle = "Swag Labs"; String actualTitle = driver.getTitle();
		 * Assert.assertEquals(expectedTitle,actualTitle,"Title mismatched");
		 */
	    Assert.assertTrue(driver.findElement(By.xpath("//div[@class='app_logo']")).isDisplayed());
  }
  
  @DataProvider
  public Object[][] loginData(){
	  Object[][] data = new Object[3][2];
	  
	  data[0][0] = "standard_user";
	  data[0][1] = "secret_sauce";
	  
	  data[1][0] = "performance_glitch_user";
	  data[1][1] = "secret_sauce";
	  
	  data[2][0] = "problem_user";
	  data[2][1] = "secret_sauce";
	  
	  return data;
  }
}
