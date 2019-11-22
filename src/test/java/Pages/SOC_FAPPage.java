package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SOC_FAPPage {
	
	WebDriver driver;
	WebDriverWait wait;
	
	//WebElements Declaration
	@FindBy(id = "nomeEmpresa")
	WebElement nomeEmpresaTextBox;
	
	@FindBy(id = "fap")
	WebElement fapTextBox;
	
	@FindBy(xpath = "//*[@id=\"frmcalculadora\"]/div[2]/div[3]/span/div/div[2]/b")
	WebElement  ratButton;
	
	@FindBy(css = "li[data-index = '1']")
	WebElement ratOption1;
	
	@FindBy(css = "li[data-index = '2']")
	WebElement ratOption2;
	
	@FindBy(css = "li[data-index = '3']")
	WebElement ratOption3;
	
	@FindBy(id = "projecao")
	WebElement projecaoSalarialTextBox;
	
	@FindBy(id = "estimar")
	WebElement estimarFapButton;
	

	//Action Methods
	public void sendCompanyName(String companyName) {
		nomeEmpresaTextBox.sendKeys(companyName);
	}
	public void sendFap(String fapValue) {
		fapTextBox.sendKeys(fapValue);
	}
	public void clickRatButton() {
		ratButton.click();
	}
	public void clickRatOption1() {
		wait.until(ExpectedConditions.visibilityOf(ratOption1));
		ratOption1.click();
	}
	public void clickRatOption2() {
		wait.until(ExpectedConditions.visibilityOf(ratOption2));
		ratOption2.click();
	}
	public void clickRatOption3() {
		wait.until(ExpectedConditions.visibilityOf(ratOption3));
		ratOption3.click();
	}
	public void sendSalaryProjection(String salaryProjection) {
		projecaoSalarialTextBox.sendKeys(salaryProjection);
	}
	public void clickEstimarFapButton() {
		estimarFapButton.click();
	}
	
	//Group Actions
	public void estimarFapCompleto(String nomeEmpresa, String valorFap, int ratOption, String projecaoSalarial) {
		nomeEmpresaTextBox.sendKeys(nomeEmpresa);
		fapTextBox.sendKeys(valorFap);
		ratButton.click();

		switch(ratOption){
			case 1: wait.until(ExpectedConditions.visibilityOf(ratOption1)); ratOption1.click(); break;
			case 2: wait.until(ExpectedConditions.visibilityOf(ratOption2)); ratOption2.click(); break;
			case 3: wait.until(ExpectedConditions.visibilityOf(ratOption3)); ratOption3.click(); break;
			default: wait.until(ExpectedConditions.visibilityOf(ratOption1)); ratOption1.click(); break;
		}
		estimarFapButton.click();
	}
	
	//Constructor
	public SOC_FAPPage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 10000);
		PageFactory.initElements(driver, this);
	}
}
