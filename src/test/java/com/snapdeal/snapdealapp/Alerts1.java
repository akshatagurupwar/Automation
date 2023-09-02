package com.snapdeal.snapdealapp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();

		/*
		 * driver.findElement(By.id("alertButton")).click(); String msg1 =
		 * driver.switchTo().alert().getText(); System.out.println(msg1);
		 * driver.switchTo().alert().accept(); Thread.sleep(5000);
		 * 
		 * 
		 * driver.findElement(By.id("timerAlertButton")).click(); Thread.sleep(5000);
		 * String msg2 = driver.switchTo().alert().getText(); System.out.println(msg2);
		 * driver.switchTo().alert().accept();
		 */

		
		/*
		 * driver.findElement(By.id("confirmButton")).click(); String msg3 =
		 * driver.switchTo().alert().getText(); System.out.println(msg3);
		 * driver.switchTo().alert().accept();
		 */		 

		// driver.findElement(By.id("promtButton")).click();
		// driver.switchTo().alert().sendKeys("Akshata");
		/*
		 * String msg4 = driver.switchTo().alert().getText(); System.out.println(msg4);
		 */
		// driver.switchTo().alert().accept();
		
		driver.findElement(By.id("promtButton")).click();
		String msg5= driver.switchTo().alert().getText();
		System.out.println(msg5);

		driver.switchTo().alert().sendKeys("Akshata");
		driver.switchTo().alert().accept();
		

	}

}
