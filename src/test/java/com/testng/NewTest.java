package com.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest {
  @Test
  public void fisrtMethod() {

      WebDriverManager.edgedriver().setup();
      WebDriver driver = new EdgeDriver();
      driver.get("https://www.google.com/");
      driver.manage().window().maximize();

      //hard assert

      String expectedtitle="Google";
      String actualtitle= driver.getTitle();
      Assert.assertEquals(actualtitle,expectedtitle,"Title Mismatched");

      

      String exurl="www.google.com";
      String actual=driver.getCurrentUrl();

      //Assert.assertEquals(exurl, actual,"URL are not same");

      

      //soft assert

      SoftAssert soft= new SoftAssert();

      soft.assertEquals(actual, exurl, "url not same");
      //soft.assertAll();


  }
}
