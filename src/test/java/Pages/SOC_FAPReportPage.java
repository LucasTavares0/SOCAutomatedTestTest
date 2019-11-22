package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SOC_FAPReportPage {
	
	WebDriver driver;
	
	//WebElements Declaration
	
	
	
	
	//Action Methods
	
	
	
	//Constructor
	public SOC_FAPReportPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
