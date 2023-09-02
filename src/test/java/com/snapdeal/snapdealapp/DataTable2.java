package com.snapdeal.snapdealapp;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataTable2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File file = new File("C:\\Users\\aganpatr\\eclipse-workspace\\snapdealapp\\ExcelData\\data2.xlsx");

		FileInputStream fi = new FileInputStream(file);

		Workbook w = new XSSFWorkbook(fi);

		Sheet s = w.getSheetAt(0);
		Row r = s.getRow(0);
		Cell c = r.getCell(0);
		System.out.println(c);

		String cellValue = s.getRow(0).getCell(0).getStringCellValue();
		System.out.println(cellValue);

		// Number cellValue1 = s.getRow(1).getCell(1).getNumericCellValue();
		// System.out.println(cellValue1);

		int row = s.getFirstRowNum();

		int col = s.getRow(0).getFirstCellNum();

		System.out.println(row);

		System.out.println(col);

		int row1 = s.getLastRowNum();

		int col1 = s.getRow(0).getLastCellNum();

		System.out.println(row1);

		System.out.println(col1);

		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {

			Row r1 = s.getRow(i);

			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {

				Cell c1 = r1.getCell(j);

				System.out.println(c1);

			}

		}
		
		
		
		
		
		
		
		
		
		
		
		
		int row3=s.getLastRowNum();

        int col3=s.getRow(1).getLastCellNum();

        

        for(int r1=0;r1<=row3;r1++) {

            Row ro=s.getRow(r1);

            for(int c1=0;c1<col3;c1++) {

                Cell ce=ro.getCell(c1);

                

                switch(ce.getCellType()) {

                case  STRING: System.out.print(ce.getStringCellValue());

                break;

                case NUMERIC: System.out.print(ce.getNumericCellValue());

                break;

                case BOOLEAN: System.out.print(ce.getBooleanCellValue());

                break;

                default:

                    break;

                }

                System.out.print("|");

            }

            System.out.println();

        }
		
		
		

		w.close();
		fi.close();

	}

}
