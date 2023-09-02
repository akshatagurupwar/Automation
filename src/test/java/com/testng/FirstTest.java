package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTest {
	
	
WebDriver driver;

    

    @BeforeTest

    public void initializeBrowser() {

    WebDriverManager.edgedriver().setup();

 

       driver = new EdgeDriver();

 

    driver.get("https://saucedemo.com");

 

    driver.manage().window().maximize();

    }

  @Test
@Parameters({"username","password"})
  public void test2(@Optional("problem_user")String username,@Optional("secret_sauce")String password) {

      driver.findElement(By.id("user-name")).sendKeys(username);

      driver.findElement(By.id("password")).sendKeys(password);

      driver.findElement(By.id("login-button")).click();

  }

	/*
	 * public void test3() {
	 * driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
	 * driver.findElement(By.xpath("//span[@class='shopping_cart_badge']")).click();
	 * }
	 */
  @AfterTest

  public void teardown() {

	  //driver.close();

  }
}
