package com.repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.StepDefinition.AdactinHook;

public class BookedItinerary {
	public BookedItinerary(){
		PageFactory.initElements(AdactinHook.driver, this);
	}
	@FindBy(xpath="(//input[@name='ids[]'])[1]")
	private WebElement radioBookingId;
	@FindBy(xpath="//input[@value='Cancel Selected']")
	private WebElement btnCancelSelected;
	@FindBy(id="logout")
	private WebElement btnLogout;
	public WebElement getBtnLogout() {
		return btnLogout;
	}
	public WebElement getBtnCancelSelected() {
		return btnCancelSelected;
	}
	public WebElement getRadioBookingId() {
		return radioBookingId;
	}

}
