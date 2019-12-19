package com.resource;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
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
	

}
