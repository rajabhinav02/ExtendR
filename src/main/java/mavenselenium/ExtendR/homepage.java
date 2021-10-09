package mavenselenium.ExtendR;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage {

	WebDriver driver;
	
	public homepage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	
	By name = By.name("name");
	//By email = By.name("email");
	
	@FindBy(name="email")
	WebElement email;
	
	
	public WebElement namel() {
		return driver.findElement(name);
	}

	
	
}
