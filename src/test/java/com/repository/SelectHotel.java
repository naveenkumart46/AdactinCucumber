package com.repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.StepDefinition.AdactinHook;

public class SelectHotel {
	public SelectHotel(){
		PageFactory.initElements(AdactinHook.driver, this);
	}
	@FindBy(id="radiobutton_0")
	private WebElement btnRadio;
	@FindBy(id="continue")
	private WebElement btnContinue;
	public WebElement getBtnContinue() {
		return btnContinue;
	}
	public WebElement getBtnRadio() {
		return btnRadio;
	}

}
