package org.pageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.UtilityClass;

public class SearchPage extends UtilityClass {

	public SearchPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@id='search-content']")
	private WebElement serachIcon;

	@FindBy(xpath = "//button[@id='search-button']")
	private WebElement serachButton;

	@FindBy(id = "search-text")
	private WebElement searchBox;

	@FindBy(xpath = "//div[@class='ajax_search_title']")
	private List<WebElement> searchResults;

	@FindBy(xpath = "//div[@class='entry-content']//strong[contains(text(),'Mikael')]")
	private WebElement mikaelContact;

	// -----------------------Getters----------------------------//
	public WebElement getSerachIcon() {
		return serachIcon;
	}

	public WebElement getSearchBox() {
		return searchBox;
	}

	public List<WebElement> getSearchResults() {
		return searchResults;
	}

	public WebElement getMikaelContact() {
		return mikaelContact;
	}

	public WebElement getSerachButton() {
		return serachButton;
	}

	// ==============================================================//
	public void clickandSearchText(String val) {
		click(getSerachIcon());
		sendKeys(getSearchBox(), val);
		click(getSerachButton());
	}

	public boolean verifyTheSearchResults(int expectsize) {
		List<WebElement> res = getSearchResults();
		int size = res.size();
		if (expectsize == size) {
			return true;
		} else {
			return false;
		}

	}
	
	public void clickLTIPostRubustLink(String val) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		List<WebElement> ser = getSearchResults();
		for (WebElement da : ser) {
			if(da.getText().contains(val)) {
				da.click();
			}
		}

	}
	

	public String getContactDetails() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		scrollDown(getMikaelContact());
		String text = getMikaelContact().getText();
		System.out.println(text);
		return text;

	}
	
	public boolean verifyContactDetails(String name,String des) {
		String[] sp = getContactDetails().split(",");
		if(sp[0].trim().equals(name) && sp[1].trim().equals(des)) {
			return true;
		}
		else {
			return false;
		}
	

	}
}
