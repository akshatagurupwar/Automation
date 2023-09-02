package com.snapdeal.snapdealapp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AppFinds1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		/*
		 * WebElement uname = driver.findElement(By.id("user-name")); uname.click();
		 * act.moveToElement(uname).sendKeys("standard_user").build().perform();
		 * 
		 * 
		 * WebElement pass = driver.findElement(By.id("password")); pass.click();
		 * act.moveToElement(pass).sendKeys("secret_sauce").build().perform();
		 * 
		 * WebElement log = driver.findElement(By.id("login-button"));
		 * 
		 * 
		 * act.moveToElement(log).click().build().perform();
		 */
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		act.sendKeys(Keys.TAB).build().perform();
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		act.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();


	}

}
