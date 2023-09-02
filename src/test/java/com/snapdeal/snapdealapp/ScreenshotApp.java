package com.snapdeal.snapdealapp;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotApp {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        
        Utils.captureScreen(driver, "log1");
        driver.findElement(By.id("login-button")).click();
        Utils.captureScreen(driver, "after log");
        
        driver.close();
	}

}
