package com.snapdeal.snapdealapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AppFinds2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_attributes_link");
		driver.manage().window().maximize();
		
		//Actions act = new Actions(driver);
		
		/*
		 * driver.findElement(By.tagName("a")).click();
		 * //act.click(a).build().perform(); driver.navigate().back();
		 * driver.findElement(By.
		 * xpath("//button[@class='w3-button w3-bar-item w3-hover-white w3-hover-text-green ga-tryit']"
		 * )).click();
		 */	
		
         //driver.switchTo().frame(0);
	     //driver.findElement(By.xpath("//a[@href='https://www.w3schools.com']")).click();
	     //Thread.sleep(1000);
	     //driver.switchTo().parentFrame();
	     //driver.findElement(By.id("runbtn")).click();
    
	     
			/*
			 * driver.switchTo().frame("iframeResult");
			 * driver.findElement(By.xpath("//a[@href='https://www.w3schools.com']")).click(
			 * );
			 */
		
		WebElement iframe123 = driver.findElement(By.id("iframeResult"));
		driver.switchTo().frame(iframe123);
		driver.findElement(By.xpath("//a[@href='https://www.w3schools.com']")).click();
		
	
		
	
	}
	
	

}
