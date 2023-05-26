package runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import utility.Cucumber_AllureReport;
import utility.JVMReport;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources", glue = "stepdefinition",
                 monochrome=true, dryRun=false, 
                 tags="@all",
                 plugin = { "pretty",
		"html:src\\test\\resources\\Reports\\Htmlreport",
		"json:src\\test\\resources\\Reports\\JsonReport\\report.json" })
public class TestRunner {
	
	@BeforeClass
	public static void reportStart() {
		Cucumber_AllureReport.startReport();

	}
	@AfterClass
	public static void report() {
		JVMReport.generateJvmReport("src\\test\\resources\\Reports\\JsonReport\\report.json");
		Cucumber_AllureReport.endReport();
		System.out.println("Report generated");
	}
}
