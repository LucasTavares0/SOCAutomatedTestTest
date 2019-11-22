package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SOC_homePage {
	
	WebDriver driver;
	WebDriverWait wait;
	
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
		wait.until(ExpectedConditions.visibilityOf(FAPLink));
		FAPLink.click();
	}
	public void clickOnSubmenuHear() {
		subMenuHeader.click();
	}
	
	//Constructor
	public SOC_homePage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 10000);
		PageFactory.initElements(driver, this);
	}
}
