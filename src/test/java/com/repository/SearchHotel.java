package com.repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.StepDefinition.AdactinHook;

public class SearchHotel {
	public SearchHotel(){
		PageFactory.initElements(AdactinHook.driver, this);
	}
	@FindBy(id="location")
	private WebElement dropLocation;
	
	@FindBy(id="hotels")
	private WebElement dropHotels;
	
	@FindBy(id="room_type")
	private WebElement dropRoomtype;
	
	@FindBy(id="room_nos")
	private WebElement dropRoomnos;
	
	@FindBy(id="datepick_in")
	private WebElement txtInDatepick;
	
	@FindBy(id="datepick_out")
	private WebElement txtOutDatepick;
	
	@FindBy(id="adult_room")
	private WebElement dropAdultRoom;
	

	@FindBy(id="child_room")
	private WebElement dropChildRoom;
	
	@FindBy(id="Submit")
	private WebElement SearchHotelBtn;

	public WebElement getDropLocation() {
		return dropLocation;
	}

	public WebElement getDropHotels() {
		return dropHotels;
	}

	public WebElement getDropRoomtype() {
		return dropRoomtype;
	}

	public WebElement getDropRoomnos() {
		return dropRoomnos;
	}

	public WebElement getTxtInDatepick() {
		return txtInDatepick;
	}

	public WebElement getTxtOutDatepick() {
		return txtOutDatepick;
	}

	public WebElement getDropAdultRoom() {
		return dropAdultRoom;
	}

	public WebElement getDropChildRoom() {
		return dropChildRoom;
	}

	public WebElement getSearchHotelBtn() {
		return SearchHotelBtn;
	}
	

}
