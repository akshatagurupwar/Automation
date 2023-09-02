package com.snapdeal.snapdealapp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AppWindowHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.magicbricks.com/");
		driver.manage().window().maximize();
		Actions act =new Actions(driver);
		
		String parentHandle = driver.getWindowHandle();
		System.out.println(parentHandle);
		WebElement buy=driver.findElement(By.id("buyheading"));
		act.moveToElement(buy).build().perform();
		driver.findElement(By.xpath("//a[@href='https://www.magicbricks.com/ready-to-move-flats-in-mumbai-pppfs']")).click();
		Thread.sleep(2000);
		driver.switchTo().window(parentHandle);
		driver.switchTo().newWindow(WindowType.TAB);
		
		Set<String> handles = driver.getWindowHandles();
		for(String h:handles) {
			System.out.println(h);
		}
	
	}

}
