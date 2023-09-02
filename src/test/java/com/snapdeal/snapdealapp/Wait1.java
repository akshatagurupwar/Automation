package com.snapdeal.snapdealapp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Wait1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		WebElement e = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a"));
		Actions act = new Actions(driver);
		act.moveToElement(e).perform();
		
		//driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/div[2]/div[1]/nav[2]/ul/li[1]/a")).click();

		/*
		 * WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(2));
		 * wait.until(ExpectedConditions. elementToBeClickable(By.xpath(
		 * "//*[@id=\"mainContent\"]/div[1]/ul/li[3]/div[2]/div[1]/nav[2]/ul/li[1]/a")))
		 * .click();
		 */		
		
		/*
		 * Wait<WebDriver> wait=new
		 * FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(8))
		 * 
		 * .pollingEvery(Duration.ofSeconds(2)).withMessage("Fluent wait")
		 * 
		 * .ignoring(NoSuchElementException.class);
		 * 
		 * wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(
		 * "//a[@href='https://www.ebay.com/b/Apple/bn_21819543\']"))).click();
		 */	}

}
