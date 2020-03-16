package com.resource;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.StepDefinition.AdactinHook;

public class AdactinBase {
	public static void launch(String url){
		AdactinHook.driver.get(url);
	}
	public static void type(WebElement e, String s){
		e.sendKeys(s);
		
	}
	public static void click(WebElement w){
		w.click();
	}
	public static void screenshot(String path) throws IOException{
		TakesScreenshot t= (TakesScreenshot) AdactinHook.driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		File des = new File(path);
		FileUtils.copyFile(src,des);
	}
	public static void selectText(WebElement we, String st){
		Select s= new Select(we);
		s.selectByVisibleText(st);
	}
	public static ArrayList<HashMap<String,String>> readValueFromExcel() throws IOException{
		File f=new File("C:\\Selenium\\Adactin_Cucumber\\Excel\\mavenexcel.xlsx");
		FileInputStream stream = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(stream);
		Sheet s= w.getSheet("Sheet1");
		Row headrow = s.getRow(0);
		ArrayList<HashMap<String,String>> datalist = new ArrayList<HashMap<String,String>>();
		for(int i=1;i<s.getPhysicalNumberOfRows();i++){
			Row eachrow = s.getRow(i);
			HashMap<String,String> hm= new HashMap<String,String>();
			for(int j=1;j<eachrow.getPhysicalNumberOfCells();j++)
			{
				Cell eachcell = eachrow.getCell(j);
				int type = eachcell.getCellType();
				String headcell = headrow.getCell(j).getStringCellValue();
				if(type==1){
					String email = eachcell.getStringCellValue();
					hm.put(headcell, email);
					
					
				}
				else{
					double number = eachcell.getNumericCellValue();
					long longnumber = (long) number;
					String name=String.valueOf(longnumber);
					hm.put(headcell, name);
				}
				datalist.add(hm);
	
			
			}
		}
		return datalist;
		
		
		
	}
	

}
