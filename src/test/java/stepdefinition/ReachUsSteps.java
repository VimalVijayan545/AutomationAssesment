package stepdefinition;

import io.cucumber.java.en.*;
import utility.UtilityClass;
import static org.junit.Assert.*;

import org.pageObjects.ReachUSPage;

public class ReachUsSteps extends UtilityClass {
	ReachUSPage reach;

	@Given("To user navigate to {string} page")
	public void to_user_navigate_to_page(String url) {
		assertTrue("Verify the Page url", getUrl().contains(url));

	}

	@When("To select the option {string} in menu item and click on Life Science")
	public void to_select_the_option_in_menu_item_and_click_on_Life_Science(String expected) {
		reach = new ReachUSPage();
		reach.mouseOvertoIndistries();
		assertTrue("Verify the Industries Option", reach.verifyIndustriesOption(expected));
		reach.clickLifeSciencesOption();
	}

	@When("To click on Submit button without entering any form details")
	public void to_click_on_Submit_button_without_entering_any_form_details() {
		reach.clickSubmitButton();

	}

	@Then("To check the all mandatory fields should show error messages")
	public void to_check_the_all_mandatory_fields_should_show_error_messages() {
		assertTrue("Verify all mandatory fields and messages", reach.verifyMandatoryFileds());
	}

	@Then("To check the all the messages in the text box in non Mandatory fields")
	public void to_check_the_all_the_messages_in_the_text_box_in_non_Mandatory_fields() {
		assertTrue("Verify all not mandatory fields and messages", reach.verifyNonMandatoryFiled());
	}

	@When("The user enter the correct information in the Reach form text fields")
	public void the_user_enter_the_correct_information_in_the_Reach_form_text_fields() {
		reach.entertheAllFiledDetails(getPropertyValue("firstname"), getPropertyValue("lastname"), getPropertyValue("email"), getPropertyValue("companyname"), getPropertyValue("msg"));
	}

	@When("To check the list of countries in the list box and check there {int} countries in the list")
	public void to_check_the_list_of_countries_in_the_list_box_and_check_there_countries_in_the_list(int expectedCountryCount) {
		assertEquals("verify the total countries list out in dropdown",expectedCountryCount, reach.toGetCountriesCount());
	}

	@When("The user should select the {string} country in the list of countries")
	public void the_user_should_select_the_country_in_the_list_of_countries(String countryname) {
		reach.selectCountry(countryname);
	}

	@When("The user should accept the terms and Conditions")
	public void the_user_should_accept_the_terms_and_Conditions() {
		reach.acceptTermsandConditions();
	}

	@When("The user Submit the form")
	public void the_user_Submit_the_form() {
		
	}

}
