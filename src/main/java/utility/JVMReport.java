package utility;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {
	
	public static void generateJvmReport(String json) {
		File f= new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Reports\\JVMReports");
		Configuration con= new Configuration(f, "Myntra");
		con.addClassifications("BrowserName", "Chrome");
		
		List<String> jsonfiles=new LinkedList<String>();
		jsonfiles.add(json);
		ReportBuilder r= new  ReportBuilder(jsonfiles, con);
		r.generateReports();
	}

}
