package com.snapdeal.snapdealapp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwagLab2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		
        File file= new File("C:\\Users\\aganpatr\\eclipse-workspace\\snapdealapp\\ExcelData\\data4.xlsx");
        FileOutputStream fos = new FileOutputStream(file); 
        Workbook w = new XSSFWorkbook(); 
        Sheet s = w.createSheet(); 
        s.createRow(0);
        s.getRow(0).createCell(0).setCellValue("standard_user");
        s.getRow(0).createCell(1).setCellValue("secret_sauce");
        w.write(fos);	
        
        
        
       w.close();
       fos.close();
       
       FileInputStream fi = new FileInputStream(file);

		Workbook w1 = new XSSFWorkbook(fi);

		Sheet s1 = w.getSheetAt(0);
		
		String username = s.getRow(0).getCell(0).getStringCellValue();
       
		driver.findElement(By.id("user-name")).sendKeys(username);
       
       String password=s.getRow(0).getCell(1).getStringCellValue();
		driver.findElement(By.id("password")).sendKeys(password);

       driver.findElement(By.id("login-button")).click();
       w1.close();
       fi.close();
	}

}
