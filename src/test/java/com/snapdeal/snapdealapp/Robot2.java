package com.snapdeal.snapdealapp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Robot2 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stuby
		
		
		

	        WebDriverManager.edgedriver().setup();
	        WebDriver driver = new EdgeDriver();
	        driver.get("https://www.saucedemo.com/");

	 

	        driver.manage().window().maximize();

	        

	 

	        Robot robot = new Robot();

	 

	        Thread.sleep(1000);

	 

	        robot.keyPress(KeyEvent.VK_DOWN);

	        

	        driver.findElement(By.id("user-name")).sendKeys("standard_user");

	        //select username

	        robot.keyPress(KeyEvent.VK_CONTROL);

	        robot.keyPress(KeyEvent.VK_A);

	        robot.keyRelease(KeyEvent.VK_CONTROL);

	        robot.keyRelease(KeyEvent.VK_A);

	        

	        //copy the username

	        robot.keyPress(KeyEvent.VK_CONTROL);

	        robot.keyPress(KeyEvent.VK_C);

	        robot.keyRelease(KeyEvent.VK_CONTROL);

	        robot.keyRelease(KeyEvent.VK_C);

	        

	        //go to the field

	        robot.keyPress(KeyEvent.VK_TAB);

	        

	        //paste the username

	        robot.keyPress(KeyEvent.VK_CONTROL);

	        robot.keyPress(KeyEvent.VK_V);

	        robot.keyRelease(KeyEvent.VK_CONTROL);

	        robot.keyRelease(KeyEvent.VK_V);

	        

	        robot.keyPress(KeyEvent.VK_TAB);

	        robot.keyPress(KeyEvent.VK_ENTER);

	        

	 

	    }

	}


