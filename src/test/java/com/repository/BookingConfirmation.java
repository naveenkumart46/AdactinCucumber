package com.repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.StepDefinition.AdactinHook;

public class BookingConfirmation {
	public BookingConfirmation(){
		PageFactory.initElements(AdactinHook.driver, this);
	}
	@FindBy(id="my_itinerary")
	private WebElement btnMyItinerary;
	public WebElement getBtnMyItinerary() {
		return btnMyItinerary;
	} 
	

}
