package mavenselenium.ExtendR;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtendReportTest {
	
	ExtentReports ext;

	@BeforeTest
	public void extendconfig() {
		
	
		String path=System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Extent Report");
		reporter.config().setDocumentTitle("Automation");
		
		
		ext = new ExtentReports();
		ext.attachReporter(reporter);
		ext.setSystemInfo("Tester", "Abhi");
		
	}
	
	@Test
	public void Testi() throws InterruptedException {
		ExtentTest test=ext.createTest("Test Report");
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver92\\chromedriver_win32 (5)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(5000);
		test.log(Status.PASS, "Passed");
		//Assert.assertTrue(false);
		driver.quit();
		ext.flush();
	}
		
		
		
	
	
}
