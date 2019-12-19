package com.repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.StepDefinition.AdactinHook;

public class BookHotel {
	public BookHotel(){
		PageFactory.initElements(AdactinHook.driver, this);
	}
	@FindBy(id="first_name")
	private WebElement txtFirstName;
	
	@FindBy(id="last_name")
	private WebElement txtLastname;
	
	@FindBy(id="address")
	private WebElement txtAddress;
	
	@FindBy(id="cc_num")
	private WebElement txtCreditCardno;
	
	@FindBy(id="cc_type")
	private WebElement dropCCType;
	
	@FindBy(id="cc_exp_month")
	private WebElement dropCCMonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement dropCCYear;
	
	@FindBy(id="cc_cvv")
	private WebElement txtCVV;
	
	@FindBy(id="book_now")
	private WebElement btnBookNow;

	public WebElement getTxtFirstName() {
		return txtFirstName;
	}

	public WebElement getTxtLastname() {
		return txtLastname;
	}

	public WebElement getTxtAddress() {
		return txtAddress;
	}

	public WebElement getTxtCreditCardno() {
		return txtCreditCardno;
	}

	public WebElement getDropCCType() {
		return dropCCType;
	}

	public WebElement getDropCCMonth() {
		return dropCCMonth;
	}

	public WebElement getDropCCYear() {
		return dropCCYear;
	}

	public WebElement getTxtCVV() {
		return txtCVV;
	}

	public WebElement getBtnBookNow() {
		return btnBookNow;
	}

}
