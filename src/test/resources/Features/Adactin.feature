@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag2
  Scenario: Launch Adactin and Login
    Given Launch the adactin Site    
    When Enter Username and password
    |naveenkumart46|naveen46|
    When Search for hotel
    And Enter the details
    |Sydney|Hotel Creek|Super Deluxe|2 - Two|20/12/2019|21/12/2019|2 - Two|2 - Two|
    And Select the hotel
    And Book Now page appears
    And Enter first name and card details
    |naveen|Tippa|Moriganipalli 22-934, shanti Nilayam|4253762398763456|VISA|August|2022|123|
    And Check my itinerary
    Then Take screenshot of booking and logout
    
	@tag3
	Scenario: Login using Excel
		Given:Launch the adactin Site
		When Enter Username and Password
		Then Login into site successfully

