package com.snapdeal.snapdealapp;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility {

	public static void capture(WebDriver driver) throws IOException{
		// TODO Auto-generated method stub
		
		TakesScreenshot ts=(TakesScreenshot)driver;
        File file = ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file,new File("./Screenshot/"+timestamp()+".png"));

	}
	
	public static String timestamp() {

        return new SimpleDateFormat("yyyy-MM-DD hh-mm-ss").format(new Date());

    }
}
