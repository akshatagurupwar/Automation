package com.snapdeal.snapdealapp;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utils {
	
	public static void captureScreen(WebDriver driver, String filename) throws IOException {
		TakesScreenshot ts=(TakesScreenshot)driver;
        File file = ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file,new File("./Screenshot/"+filename+".png"));
	}

}
