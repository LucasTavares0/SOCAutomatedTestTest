package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SOC_homePage {
	
	WebDriver driver;
	
	//WebElements Declaration
	@FindBy(css = "input[type='text'][placeholder='Buscar']")
	WebElement BuscarTextBox;
	
	@FindBy(css = "input[type='submit'][class='lupa-form']")
	WebElement BuscarButton;
	
	@FindBy(css = "a[href='/fap']")
	WebElement FAPLink;
	
	@FindBy(className = "mostra-submenu")
	WebElement subMenuHeader;
	
	//Action Methods
	public void sendKeysBuscarTextBox(String searchFilter) {
		BuscarTextBox.sendKeys(searchFilter);
	}
	public void clickOnBuscarButton() {
		BuscarButton.click();
	}
	public void clickOnLinkFAP() {
		FAPLink.click();
	}
	public void clickOnSubmenuHear() {
		subMenuHeader.click();
	}
	
	//Constructor
	public SOC_homePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
