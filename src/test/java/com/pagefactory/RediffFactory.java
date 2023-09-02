package com.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffFactory {
WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"srchquery_tbox\"]")
	WebElement searchField;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/form/input[2]")
	WebElement searchIcon;
	
	public RediffFactory(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void stext(String keyword) {
		searchField.sendKeys(keyword);
	}
	
	public void sbtn() {
		searchIcon.click();
	}
	

}
