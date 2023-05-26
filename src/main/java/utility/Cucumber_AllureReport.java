package utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.cucumber.core.api.Scenario;
import io.cucumber.core.event.Status;

public class Cucumber_AllureReport {
	public static ExtentReports report;
	public static void startReport() {
		// File location where want to store report
		ExtentHtmlReporter html = new ExtentHtmlReporter(
				System.getProperty("user.dir") + "\\src\\test\\resources\\Reports\\ExtentReport\\extent_report.html");
		html.config().setDocumentTitle("Cucumber Extent Report");
		html.config().setReportName("Facebook");
		html.config().setTheme(Theme.DARK);

		report = new ExtentReports();
		report.attachReporter(html);
		report.setSystemInfo("BrowserName", "Chrome");
		report.setSystemInfo("OS", "Windows 11");
		report.setSystemInfo("Environment", "QA");
	}
	public static void createLog(Scenario sc) {
		String name = sc.getName();
		Status status = sc.getStatus();
		switch (status) {
		case PASSED:
			report.createTest(name).pass("Test Case Passed");
			break;

		case FAILED:
			report.createTest(name).fail("Test Case Failed");
			break;
		default:
			report.createTest(name).skip("Test Case Skipped");

			break;
		}
	}
	public static void endReport() {
		report.flush();
	}

}
