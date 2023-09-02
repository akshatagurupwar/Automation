package com.snapdeal.snapdealapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AppAmazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 14 pro max case");

		driver.findElement(By.id("nav-search-submit-button")).click();
		
		driver.findElement(By.xpath("//*[@id=\"p_89/TORRAS\"]/span/a/span")).click();
		driver.findElement(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']")).click();
	
		
		driver.findElement(By.xpath("//input[@name='submit.addToCart']")).click();
	}

}
