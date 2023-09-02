package com.snapdeal.snapdealapp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AppTest4 {
	
	public static void main(String args[]) {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		
		
		WebElement e = driver.findElement(By.cssSelector("#cars"));
	    Select s = new Select(e);
	    
	    List<WebElement> a = s.getOptions();
	    
	    for(WebElement y: a) {
	    	System.out.println(y.getText());
	    }
	    
	
	    
	    
	    s.selectByIndex(2);
	    s.selectByValue("audi");
	    s.selectByVisibleText("Saab");
	    
	    WebElement fs = s.getFirstSelectedOption();
	    System.out.println("First selected "+fs.getText());
	    
	    List<WebElement> all1 = s.getAllSelectedOptions();
	    System.out.println(all1.size());
	    
	    s.deselectAll();
	    List<WebElement> all2 = s.getAllSelectedOptions();
	    System.out.println(all2.size());
	    
	    
	    Actions act = new Actions(driver);

        WebElement i = driver.findElement(By.xpath("//*[@id=\'signin_info\']/a[2]"));

        act.moveToElement(i).click().build().perform();
	}

}
