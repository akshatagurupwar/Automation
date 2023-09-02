package com.snapdeal.snapdealapp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AppTest1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/*
		 * System.setProperty("webdriver.edge.driver", "C:\\drivers\\msedgedriver.exe");
		 * WebDriver driver = new EdgeDriver(); driver.get("https://www.saucedemo.com");
		 * driver.manage().window().maximize();
		 */

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();

		
		
		List<WebElement> n = driver.findElements(By.tagName("input"));
		System.out.println("No of elements: "+n.size());
		
		for(WebElement w : n) {
			System.out.println(w.getText());
		}
		
		/*
		 * driver.findElement(By.xpath("//input[@type='text']")).sendKeys(
		 * "standard_user");
		 * driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(
		 * "secret_sauce");
		 * driver.findElement(By.xpath("//input[@id='login-button']")).click();
		 */	

		
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String current = driver.getCurrentUrl();
		System.out.println(current);
		
		WebElement a= driver.findElement(By.id("user-name"));

        System.out.println(a.getAttribute("class"));

        System.out.println(a.getTagName());

        System.out.println(a.getCssValue("font-family"));

        System.out.println(a.getCssValue("width"));
		
		/*
		 * System.out.println(driver.getCurrentUrl());
		 * System.out.println(driver.getTitle());
		 */		
		
		
        String text= driver.findElement(By.xpath("//div[@class='login_password']/h4")).getText();

        System.out.println(text);
        
        
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * WebElement a = driver.findElement(By.id("user-name"));
		 * a.sendKeys("standard_user"); Thread.sleep(2000);
		 * 
		 * WebElement b = driver.findElement(By.name("password"));
		 * b.sendKeys("secret_sauce"); Thread.sleep(2000);
		 * 
		 * WebElement c =driver.findElement(By.id("login-button")); c.click();
		 */
		 

		/*
		 * driver.findElement(By.id("user-name")).sendKeys("standard_user");
		 * driver.findElement(By.name("password")).sendKeys("secret_sauce");
		 * driver.findElement(By.id("login-button")).click();
		 */

	}
}
