package com.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginFactory {
	
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"user-name\"]")
	WebElement uname;
	
	@FindBy(id="password")
	WebElement pass;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"login-button\"]")
	WebElement logbtn;
	
	public LoginFactory(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void swaglogin() {
		uname.sendKeys("standard_user");
		pass.sendKeys("secret_sauce");
	}

	
	public void swaglog(String uid,String pwd) {
		uname.sendKeys(uid);
		pass.sendKeys(pwd);
	}
	
	public void clickbtn() {
		logbtn.click();
	}

}
