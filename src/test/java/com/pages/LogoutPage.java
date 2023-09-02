package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogoutPage {
	
	WebDriver driver;
	By btn=By.id("react-burger-menu-btn");
	By logout=By.xpath("//*[@id=\"logout_sidebar_link\"]");
	
	public LogoutPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void btnClick() {
		driver.findElement(btn).click();
		driver.findElement(logout).click();
	}
	
	

}
