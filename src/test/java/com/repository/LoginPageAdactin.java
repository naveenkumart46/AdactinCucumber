package com.repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.StepDefinition.AdactinHook;

public class LoginPageAdactin {
	public LoginPageAdactin(){
		PageFactory.initElements(AdactinHook.driver, this);
	}
	@FindBy(id="username")
	private WebElement uname;
	@FindBy(id="password")
	private WebElement pword;
	@FindBy(id="login")
	private WebElement loginBtn;
	public WebElement getUname() {
		return uname;
	}
	public WebElement getPword() {
		return pword;
	}
	public WebElement getLoginBtn() {
		return loginBtn;
	}
	

}
