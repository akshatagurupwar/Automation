package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage { 
	WebDriver driver;
	
	By filter=By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select");
	By name=By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[2]");
	By add=By.id("add-to-cart-test.allthethings()-t-shirt-(red)");
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public void filterProduct() {
		driver.findElement(filter).click();
		driver.findElement(name).click();
	}
	


}