package com.snapdeal.snapdealapp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Javascript2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(2000);
		
		WebElement a = driver.findElement(By.id("user-name"));
		js.executeScript("arguments[0].setAttribute('value','standard_user')", a);
		
		//WebElement b = driver.findElement(By.id("password"));
		//js.executeScript("arguments[0].setAttribute('value','secret_sauce')", b);
		
		Object obj=js.executeScript("return arguments[0].getAttribute('value')", a);
        String s = (String)obj;
        System.out.println(s);
	}

}
