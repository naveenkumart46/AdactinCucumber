package com.StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class AdactinHook {
	
	public static WebDriver driver;
	@Before 
	public void beforescenario(){
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Adactin_Cucumber\\Driver_Latest\\chromedriver.exe");
		driver=new ChromeDriver();
		
		
	}
	@After
	public void afterscenario(){
		driver.quit();
	}

}
