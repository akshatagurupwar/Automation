package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToCart {
	
	WebDriver driver;
	
	public AddToCart(WebDriver driver) {
		this.driver=driver;
	}
	
	By add=By.id("add-to-cart-test.allthethings()-t-shirt-(red)");
	By cart=By.xpath("//*[@id=\"shopping_cart_container\"]/a");
	
	public void addToCart() {
		driver.findElement(add).click();
		driver.findElement(cart).click();
	}

}
