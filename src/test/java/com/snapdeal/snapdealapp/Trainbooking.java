package com.snapdeal.snapdealapp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Trainbooking {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.makemytrip.com/railways/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//span[@data-cy='liveTrainStatus']")).click();
		
		
		
		String stop="10101";
		driver.findElement(By.xpath("//input[@id='trainNum']")).click();
		Thread.sleep(2000);
/*		//driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/div/div[1]/div[1]/div/div/div/input")).sendKeys("kk");
*/		
		
		driver.findElement(By.xpath("//input[@aria-controls='react-autowhatever-1']")).sendKeys(stop);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@id='react-autowhatever-1-section-0-item-0']")).click();
		//driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/div/div[1]/div[1]/div/div/div/input")).sendKeys("Nanded");

		
		
		//driver.findElement(By.xpath("//span[@class='appendBottom5 downArrow']")).click();
		//Thread.sleep(2000);
		//List<WebElement> allOptions= driver.findElements(By.xpath("//span[@class='blackText appendBottom3']"));
	    
		
		/*
		 * String option="Today";
		 * 
		 * for(int i=0; i<allOptions.size(); i++) {
		 * if(allOptions.get(i).getText().contains(option)) { allOptions.get(i).click();
		 * break; } }
		 */	
		
		//driver.findElement(By.xpath("//span[@class='appendBottom5']")).click();
		//Thread.sleep(2000);
		String option2="Ratnagiri";
		List<WebElement> allOptions2= driver.findElements(By.xpath("//li[@data-cy='RailTravellingStop_347']"));
		
		
		
		for(int i=0; i<allOptions2.size(); i++) {
			if(allOptions2.get(i).getText().contains(option2)) {
				allOptions2.get(i).click();
				break;
			}
		}
	}
}
