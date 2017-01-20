package BioPay.iOS;

import cucumber.api.java.en.And;

//import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Cucumberstepdefination {

    Loginjavafile ljf = new Loginjavafile ();
    Registrationjavafile rjf = new Registrationjavafile ();

	@Given("^BioPay application gets open")
	public void User_Navigate_to_Home_Page() throws Throwable {
		System.out.println("Application is open");
	}

	@When("^Click on SKIP button$")
	public void User_click_skip() throws Throwable {
		ljf.skip();
		System.out.println("click on login");	  
	}
	@When("^Click on LOGIN button$")
	public void User_click_login() throws Throwable {
		ljf.login();
		System.out.println("User cliked on Login");	  
	}
	
    @When("^User enters Email ID \"([^\"]*)\"$")
	public void User_enters_email(String email) throws Throwable {
				ljf.email().sendKeys("ankita10@gmail.com");
				System.out.println("Email id is entred by User");	
			}
			
    @When("^User enters Password \"([^\"]*)\"$")
	public void User_enters_password(String password) throws Throwable {
		ljf.password().sendKeys("Password1@");
		System.out.println("password is entered by user");	
	}
	
	@Then("^Click on CONTINUE button$")
	public void User_click_logInButton() throws Throwable {
		ljf.button();
		System.out.println("User logged in succsessfully");	  
	}
	
	@When("^Click on CREATE ACCOUNT$")
	public void User_click_Create_account() throws Throwable {
	   rjf.Create_Account();
		System.out.println("User cliked on create account");	  
	}
	
	@When("^User enters Email ID to create account \"([^\"]*)\"$")
	public void User_enters_Create_email(String email) throws Throwable {
		rjf.email().sendKeys("ankit12@gmail.com");
				System.out.println("Email id is entred by User");	
			}
	
	@When("^User enters Confirm Email ID to create account \"([^\"]*)\"$")
	public void User_enters_Create_confirm_email(String email) throws Throwable {
		rjf.Confirm_email().sendKeys("ankit12@gmail.com");
				System.out.println("Email id is entred by User");	
			}
			
	@When("^User enters Birthdate$")
	public void User_click_Birthdate() throws Throwable {
		rjf.Birthday();
		System.out.println("User click on birthdate ");	  
	}
		
    @When("^User enters Password to create account \"([^\"]*)\"$")
	public void User_enters_Create_password(String password) throws Throwable {
    	rjf.password().sendKeys("Password1@");
		System.out.println("password is entered by user");	
	}
    
	@Then("^Click on DONE button$")
	public void User_click_DoneButton() throws Throwable {
		rjf.DONE_button();
		System.out.println("User entered birthdate ");	  
	}
	
	@Then("^Click on CONTINUE button$")
	public void User_click_ContinueButton() throws Throwable {
		rjf.CONTINUE_button();
		System.out.println("User created account succsessfully");	  
	}
	
	@And("^User navigates to COUNTRY OF RESIDENCE screen$")
	public void User_click_CountryScreen() throws Throwable {
		System.out.println("User can see country selection screen");	  
	}
	
	@Then("^Select a COUNTRY$")
	public void User_click_SelectCountry() throws Throwable {
		rjf.Select_Country();
		System.out.println("User selected country ");	  
	}
	
	@Then("^User click on CONFIRM COUNTRY button$")
	public void User_click_ConfirmCountry() throws Throwable {
		rjf.Confirm_Country();
		System.out.println("User click on confirm country button");	  
	}
	
	@And("^User navigates to Terms And Services screen$")
	public void User_click_TermsAndServices() throws Throwable {
		System.out.println("User can see Terms and services screen");	  
	}
	
	@Then("^User click on AGREE AND CONTINUE on terms and service$")
	public void User_click_AgreeAndContinueTOS() throws Throwable {
		rjf.Agree_And_Continue();
		System.out.println("User clicked on agree and continue on TOS ");	  
	}
	
	@And("^User navigates to Privacy Policy screen$")
	public void User_click_PrivacyPolicy() throws Throwable {
		System.out.println("User can see Privacy policy screen");	  
	}
	
	@Then("^User click on AGREE AND CONTINUE on Privacy policy$")
	public void User_click_AgreeAndContinuePP() throws Throwable {
		rjf.Agree_And_Continue();
		System.out.println("User clicked on agree and continue on PP ");	  
	}
	
	@And("^User navigates to Set Pin Code$")
	public void User_click_SetPinCode() throws Throwable {
		System.out.println("User can see Set Pin Code screen");	  
	}
	
	@Then("^Click on Pin and Set Pin$")
	public void User_click_SetPin() throws Throwable {
		rjf.SetPin();
		System.out.println("User can Set Pin Code");	  
	}
	
	@Then("^Click on Continue on Set Pin$")
	public void User_click_SetPinCodeCountinue() throws Throwable {
		rjf.ContinueSetPin();
		System.out.println("User has set pin successfully");	  
	}
	
	@And("^User navigates to Confirm Set Pin Code$")
	public void User_click_ConfirmSetPinCode() throws Throwable {
		System.out.println("User can see Confirm Set Pin Code screen");	  
	}
	
	@Then("^Click on Confirm Pin and Set Pin$")
	public void User_click_ConfirmSetPin() throws Throwable {
		rjf.SetPin();
		System.out.println("User can comfirm  Set Pin Code");	  
	}
	
	@Then("^Click on Continue on Confirm Set Pin$")
	public void User_click_ConfirmSetPinCodeCountinue() throws Throwable {
		rjf.ContinueSetPin();
		System.out.println("User has set pin successfully");	  
	}
	
	@And("^User navigates to Complete Profile screen$")
	public void User_click_CompleteProfileScreen() throws Throwable {
		System.out.println("User can see Complete profile screen");	  
	}
	
	@Then("^Click on SKIPFORNOW button$")
	public void User_click_SkipForNow() throws Throwable {
		rjf.SkipForNow_button();
		System.out.println("User click on SkipForNow");	  
	}
	
	@Then("^Click on OK on alert$")
	public void User_click_SkipForNowOK() throws Throwable {
		rjf.SkipForNow_OK_alert_button();
		System.out.println("User click on ok on alert");	  
	}
	
	@And("^User has Created Account successfully$")
	public void User_click_CreateAccountSuccessfully() throws Throwable {
		System.out.println("User can see daily challenges screen");	  
	}
	
	@Then("^Click on Profile tab$")
	public void User_click_ProfieTab() throws Throwable {
		ljf.ProfieTab();
		System.out.println("User Clicked on profile tab");	  
	}
	
	@Then("^User scroll down$")
	public void User_click_ScrollDown() throws Throwable {
		ljf.ScrollProfile();
		System.out.println("User scroll down");	  
	}
	
	@Then("^Click on LOGOUT button$")
	public void User_click_LogoutButton() throws Throwable {
		ljf.Logout();
		System.out.println("User Clicked on logout");	  
	}
	
}
