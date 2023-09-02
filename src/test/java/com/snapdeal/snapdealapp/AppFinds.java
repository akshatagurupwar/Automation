package com.snapdeal.snapdealapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AppFinds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);

        WebElement i = driver.findElement(By.xpath("//*[@id=\'signin_info\']/a[2]"));
        
        //For double click

        //act.moveToElement(i).doubleClick().build().perform();
        
        //act.doubleClick(i).build().perform();
        
        
        //For right click
        act.moveToElement(i).contextClick().build().perform();
        //act.contextClick(i).build().perform();

	}

}
