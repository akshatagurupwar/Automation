package com.snapdeal.snapdealapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AppSnap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.snapdeal.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("inputValEnter")).sendKeys("kitchen product");
		driver.findElement(By.className("searchTextSpan")).click();
		//driver.findElement(By.xpath("//a[@pogid='626805041033']")).click();
		
		//driver.findElement(By.xpath("//*[@id=\"add-cart-button-id\"]")).click();
		

	}

}
