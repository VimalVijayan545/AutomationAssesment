package stepdefinition;

import static org.junit.Assert.*;

import org.pageObjects.SearchPage;

import io.cucumber.java.en.*;
import utility.UtilityClass;

public class SerachSteps extends UtilityClass{
	SearchPage search;
	@When("The user enter the desired text {string}  in the serach box")
	public void the_user_enter_the_desired_text_in_the_serach_box(String val) {
		 search = new SearchPage();
		 search.clickandSearchText(val);
	}

	@Then("The serach results should show atlest {int} in the results")
	public void the_serach_results_should_show_atlest_in_the_results(int expectedsize) {
		System.out.println(search.getSearchResults().size());
		boolean verifyTheSearchResults = search.verifyTheSearchResults(expectedsize);
		assertEquals("Verify the total search results",true, verifyTheSearchResults);
	}

	@When("The user click the {string}")
	public void the_user_click_the(String val) {
		search.clickLTIPostRubustLink(val);
		windowHandles(1);
		
	}

	@Then("To verify the {string} is the contact at Nordea works and He works as {string}")
	public void to_verify_the_is_the_contact_at_Nordea_works_and_He_works_as(String name, String des) {
		assertTrue("Verify the contact details",search.verifyContactDetails(name, des));
	}


}
