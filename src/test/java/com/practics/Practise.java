package com.practics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class Practise {
	@Test
	public static void main(String[] args) throws AWTException {
		int count=0;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Adactin_Cucumber\\Driver_Latest\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//input[contains(@class,'gLFy')]")).sendKeys("brokentest");
		//Action a = new Actions(driver);
		Actions a= new Actions(driver);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		WebDriverWait w =new WebDriverWait(driver,10);
		w.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class,'hdtb-mitem hdtb-msel hdtb-imb')]")));
		List<WebElement> all = driver.findElements(By.tagName("a"));
		for(int i=0;i<all.size();i++){
			String link = all.get(i).getAttribute("href");
			try{
				URL u=new URL(link);
				URLConnection con=u.openConnection();
				HttpsURLConnection ht=(HttpsURLConnection)con;
				int responseCode = ht.getResponseCode();
				if(responseCode>=400){
					count++;
					System.out.println("Invalid");
				}
				
			}
			catch(Exception e){
				System.out.println(e);
				
			}
		}
		System.out.println(count);
		
	}

}
