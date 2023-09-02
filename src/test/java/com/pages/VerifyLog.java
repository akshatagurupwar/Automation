package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyLog {
  
  WebDriver driver=null;

  LogPage lp;

@Test

public void testLog() throws InterruptedException {

    WebDriverManager.edgedriver().setup();

    WebDriver driver = new EdgeDriver();

    driver.get("http://www.saucedemo.com/");

    driver.manage().window().maximize();

    lp=new LogPage(driver);
    HomePage hp = new HomePage(driver);

    AddToCart adt = new AddToCart(driver);
    LogoutPage lop=new LogoutPage(driver);


    //lp.typelog("problem_user","secret_sauce");

    

    lp.typeuser();

    lp.typepass();

    lp.clickbtn();
    
    Thread.sleep(1000);
    
    
    hp.filterProduct();

    adt.addToCart();

    lop.btnClick();
}
}
