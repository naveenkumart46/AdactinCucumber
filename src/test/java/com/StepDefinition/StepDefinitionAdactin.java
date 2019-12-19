package com.StepDefinition;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;

import com.repository.BookHotel;
import com.repository.BookedItinerary;
import com.repository.BookingConfirmation;
import com.repository.LoginPageAdactin;
import com.repository.SearchHotel;
import com.repository.SelectHotel;
import com.resource.AdactinBase;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionAdactin extends AdactinBase {
	LoginPageAdactin l = new LoginPageAdactin();
	SearchHotel s = new SearchHotel();
	SelectHotel sh=  new SelectHotel();
	BookHotel bk= new BookHotel();
	BookedItinerary bi=new BookedItinerary();
	BookingConfirmation bc = new BookingConfirmation();
	@Given("Launch the adactin Site")
	public void launch_the_adactin_Site() {
		launch("https://adactin.com/HotelApp/index.php");
		AdactinHook.driver.manage().window().maximize();
		
	    
	}

	@When("Enter Username and password")
	public void enter_Username_and_password(io.cucumber.datatable.DataTable dataTable) {
		List<String> lst = dataTable.asList();
		type(l.getUname(),lst.get(0));
		type(l.getPword(),lst.get(1));
		click(l.getLoginBtn());
	    
	}

	@Then("Verify Successful Login")
	public void verify_Successful_Login() throws IOException {
		screenshot("C:\\Users\\PIGGU\\Desktop\\Assignments_Naveen\\Cucumber_Adactin\\loginAdactin.jpg");
		System.out.println("Login Success");
	    
	}
	@When("Search for hotel")
	public void search_for_hotel() {
		System.out.println("search Hotel");
	   
	}
	@When("Enter the details")
	public void enter_the_details(io.cucumber.datatable.DataTable dataTable) throws IOException {
		List<String> as = dataTable.asList();
		selectText(s.getDropLocation(),as.get(0));
		selectText(s.getDropHotels(),as.get(1));
		selectText(s.getDropRoomtype(),as.get(2));
		selectText(s.getDropRoomnos(),as.get(3));
		type(s.getTxtInDatepick(),as.get(4));
		type(s.getTxtOutDatepick(),as.get(5));
		selectText(s.getDropAdultRoom(),as.get(6));
		selectText(s.getDropChildRoom(),as.get(7));
		screenshot("C:\\Users\\PIGGU\\Desktop\\Assignments_Naveen\\Cucumber_Adactin\\SearchHotel.jpg");
		click(s.getSearchHotelBtn());
		
	   
	}


	@When("Select the hotel")
	public void select_the_hotel() throws IOException {
		System.out.println("Select the hotel");
		click(sh.getBtnRadio());
		screenshot("C:\\Users\\PIGGU\\Desktop\\Assignments_Naveen\\Cucumber_Adactin\\SelectHotel.jpg");
		click(sh.getBtnContinue());
		
		
	    
	}

	@When("Book Now page appears")
	public void book_Now_page_appears() {
		System.out.println("Book now details");
	    
	}

	@When("Enter first name and card details")
	public void enter_first_name_and_card_details(io.cucumber.datatable.DataTable dataTable) {
		List<String> al = dataTable.asList();
		type(bk.getTxtFirstName(),al.get(0));
		type(bk.getTxtLastname(),al.get(1));
		type(bk.getTxtAddress(),al.get(2));
		type(bk.getTxtCreditCardno(),al.get(3));
		selectText(bk.getDropCCType(),al.get(4));
		selectText(bk.getDropCCMonth(),al.get(5));
		selectText(bk.getDropCCYear(),al.get(6));
		type(bk.getTxtCVV(),al.get(7));
		click(bk.getBtnBookNow());
	    
	}


	@When("Check my itinerary")
	public void check_my_itinerary() {
		AdactinHook.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("itinerary");
		click(bc.getBtnMyItinerary());
	    
	}

	@Then("Take screenshot of booking and logout")
	public void take_screenshot_of_booking_and_logout() {
		AdactinHook.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		System.out.println("last page");
		click(bi.getRadioBookingId());
		click(bi.getBtnCancelSelected());
		Alert a = AdactinHook.driver.switchTo().alert();
		a.accept();
		click(bi.getBtnLogout());
	    
	}

}
