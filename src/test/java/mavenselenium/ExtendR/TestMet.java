package mavenselenium.ExtendR;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestMet {

	
	
	@Test
	public void testing() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver92\\chromedriver_win32 (5)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		homepage hm = new homepage(driver);
		hm.namel().sendKeys("hg");
		hm.email.sendKeys("lol");
	}
	
}