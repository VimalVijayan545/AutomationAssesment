package stepdefinition;

import utility.Cucumber_AllureReport;
import utility.UtilityClass;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass extends UtilityClass {
	@Before
	public void setup() {
		openBrowser(getPropertyValue("browsername"));
		openUrl(getPropertyValue("url"));
		implicitWait(20);

	}

	@After
	public void tearDown(Scenario sc) {
		Cucumber_AllureReport.createLog(sc);
		takeScreenShot(sc.getName());
		closeBrowser();

	}

}
