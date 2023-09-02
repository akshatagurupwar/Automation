package com.snapdeal.snapdealapp;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataTable1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        File file= new File("C:\\Users\\aganpatr\\eclipse-workspace\\snapdealapp\\ExcelData\\data2.xlsx");

        

        //write the data into excel sheet
        FileOutputStream fos = new FileOutputStream(file);

        

        Workbook w =  new XSSFWorkbook();

        

        Sheet s = w.createSheet();

        

        s.createRow(0);

        s.getRow(0).createCell(0).setCellValue("Hello");

        s.getRow(0).createCell(1).setCellValue("capg");

        

        s.createRow(1);

        s.getRow(1).createCell(0).setCellValue(true);

        s.getRow(1).createCell(1).setCellValue(1234);
        

        Sheet s1=w.createSheet("Testing data");
        
        s1.createRow(0);
        s1.getRow(0).createCell(0).setCellValue("Akshata");

        s1.getRow(0).createCell(1).setCellValue("Nanded");

        

        w.write(fos);

        w.close();
        
        
        
        
        
        
        
        
        
		/*
		 * File file= new File(
		 * "C:\\Users\\aganpatr\\eclipse-workspace\\snapdealapp\\ExcelData\\data1.xls")
		 * ;
		 * 
		 * 
		 * 
		 * //write the data into excel sheet
		 * 
		 * FileOutputStream fos = new FileOutputStream(file);
		 * 
		 * 
		 * 
		 * Workbook w = new HSSFWorkbook();
		 * 
		 * 
		 * 
		 * Sheet s = w.createSheet();
		 * 
		 * 
		 * 
		 * s.createRow(0);
		 * 
		 * s.getRow(0).createCell(0).setCellValue("Hello");
		 * 
		 * s.getRow(0).createCell(1).setCellValue("capg");
		 * 
		 * 
		 * 
		 * s.createRow(1);
		 * 
		 * s.getRow(1).createCell(1).setCellValue(true);
		 * 
		 * s.getRow(1).createCell(1).setCellValue(1234);
		 * 
		 * 
		 * 
		 * w.write(fos);
		 * 
		 * w.close();
		 */

	}

}
