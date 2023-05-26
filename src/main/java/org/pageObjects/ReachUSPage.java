package org.pageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utility.UtilityClass;

public class ReachUSPage extends UtilityClass {
	public ReachUSPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//ul[@id='avia-menu']//a[@title='Industries']")
	private WebElement industries;

	@FindBy(xpath = "//ul[@id='avia-menu']//a[@title='Life Sciences']")
	private WebElement lifeSciences;

	@FindBy(xpath = "//input[@name='text-350']")
	private WebElement firstName;

	@FindBy(xpath = "//input[@name='text-352']")
	private WebElement lastName;

	@FindBy(xpath = "//input[@name='text-354']")
	private WebElement email;

	@FindBy(xpath = "//input[@name='text-356']")
	private WebElement companyName;

	@FindBy(xpath = "//input[@name='leadDescription1']")
	private WebElement message;

	@FindBy(xpath = "//div[@id='blog-contact']//select[@name='country']")
	private WebElement countryDropdown;

	@FindBy(xpath = "//div[@id='blog-contact']//input[@name='subscribed[]']")
	private WebElement termsAndConditions;

	@FindBy(xpath = "//div[@id='blog-contact']//input[@type='button']")
	private WebElement submitButton;

	@FindBy(xpath = "//div[@id='blog-contact']//span[text()='*']")
	private List<WebElement> requiredFields;

	@FindBy(xpath = "//span[@role='alert']")
	private List<WebElement> requiredFieldsMessage;

	// -----------------------------------getters-----------------//

	public WebElement getIndustries() {
		return industries;
	}

	public WebElement getLifeSciences() {
		return lifeSciences;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getCompanyName() {
		return companyName;
	}

	public WebElement getMessage() {
		return message;
	}

	public WebElement getCountryDropdown() {
		return countryDropdown;
	}

	public WebElement getTermsAndConditions() {
		return termsAndConditions;
	}

	public WebElement getSubmitButton() {
		return submitButton;
	}

	public List<WebElement> getRequiredFields() {
		return requiredFields;
	}

	public List<WebElement> getRequiredFieldsMessage() {
		return requiredFieldsMessage;
	}

	// ------------------------------------------------//
	public void clickSubmitButton() {
		click(getSubmitButton());
	}
	
	public void acceptTermsandConditions() {
		click(getTermsAndConditions());

	}

	public void entertheAllFiledDetails(String firstname, String lastname, String email, String companyname,
			String msg) {
		sendKeys(getFirstName(), firstname);
		sendKeys(getLastName(), lastname);
		sendKeys(getEmail(), email);
		sendKeys(getCompanyName(), companyname);
		sendKeys(getMessage(), msg);

	}

	public int toGetCountriesCount() {
		Select s = new Select(getCountryDropdown());
		List<WebElement> options = s.getOptions();
		return options.size()-1;

	}

	public void selectCountry(String countryname) {
		selectDropDownByValue(getCountryDropdown(), countryname);
	}

	public void mouseOvertoIndistries() {
		moveToElement(getIndustries());

	}
	public boolean verifyIndustriesOption(String val) {
		return getIndustries().getText().equals(val);

	}

	public void clickLifeSciencesOption() {
		click(getLifeSciences());
	}

	public boolean verifyMandatoryFileds() {
		boolean res = false;
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		List<WebElement> mandatoryFields = getRequiredFields();
		List<WebElement> fieldMessages = getRequiredFieldsMessage();
		int mand = mandatoryFields.size();
		mand=mand+1;
		int msgSize = fieldMessages.size();
//		for (WebElement e : fieldMessages) {
//			System.out.println(e.getText());
//		}
//		System.out.println(mand);
//		System.out.println(msgSize);
		if (mand == msgSize) {
			res = true;
		} else {
			res = false;
		}

		return res;
	}
	
	public boolean verifyNonMandatoryFiled() {
		String text = getMessage().getAttribute("value");
		System.out.println(text);
		if (text.isEmpty()) {
			return true;
		}
		else {
			return false;
		}

	}
}
