package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SOC_FAPPage {
	
	WebDriver driver;
	
	//WebElements Declaration
	@FindBy(id = "nomeEmpresa")
	WebElement companyNameTextBox;
	
	@FindBy(id = "fap")
	WebElement fapTextBox;
	
	@FindBy(xpath = "//*[@id=\"frmcalculadora\"]/div[2]/div[3]/span/div/div[2]/b")
	WebElement  ratButton;
	
	@FindBy(xpath = "//*[@id=\"frmcalculadora\"]/div[2]/div[3]/span/div/div[3]/div/ul/li[2]")
	WebElement ratOption1;
	
	@FindBy(xpath = "//*[@id=\"frmcalculadora\"]/div[2]/div[3]/span/div/div[3]/div/ul/li[2]")
	WebElement ratOption2;
	
	@FindBy(xpath = "//*[@id=\"frmcalculadora\"]/div[2]/div[3]/span/div/div[3]/div/ul/li[2]")
	WebElement ratOption3;
	
	@FindBy(id = "projecao")
	WebElement salaryProjectionTextBox;
	
	@FindBy(id = "estimar")
	WebElement estimarFapButton;
	

	//Action Methods
	public void sendCompanyName(String companyName) {
		companyNameTextBox.sendKeys(companyName);
	}
	public void sendFap(String fapValue) {
		fapTextBox.sendKeys(fapValue);
	}
	public void clickRatButton() {
		ratButton.click();
	}
	public void clickRatOption1() {
		ratOption1.click();
	}
	public void clickRatOption2() {
		ratOption2.click();
	}
	public void clickRatOption3() {
		ratOption3.click();
	}
	public void sendSalaryProjection(String salaryProjection) {
		salaryProjectionTextBox.sendKeys(salaryProjection);
	}
	public void clickEstimarFapButton() {
		estimarFapButton.click();
	}
	
	//Group Actions
	public void estimarFapCompleto(String companyName, String fapValue, int ratOption, String salaryProjection) {
		companyNameTextBox.sendKeys(companyName);
		fapTextBox.sendKeys(fapValue);
		ratButton.click();

		switch(ratOption){
			case 1: ratOption1.click(); break;
			case 2: ratOption2.click(); break;
			case 3: ratOption3.click(); break;
			default: ratOption1.click(); break;
		}
		estimarFapButton.click();
	}
	
	//Constructor
	public SOC_FAPPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
