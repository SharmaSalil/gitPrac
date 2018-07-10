package ExtentReport;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class TestCore {

	public static ExtentReports report;
	protected static ExtentTest test;
	
	public static ExtentReports extent;

	public static ExtentReports getInstance() {
		if (extent == null) {
			extent = new ExtentReports(System.getProperty("user.dir")+"/Automation_Report.html", true);
			extent.addSystemInfo("Selenium Version", "3").addSystemInfo("Environment", "QA");
		}
		return extent;
	}
	
	public static ExtentReports ExtentReporterExtent() {
		ExtentReports extent = TestCore.getInstance();
		return extent;
	}
}
