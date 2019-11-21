package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SOC_ResultadosBuscaPage {
	
	WebDriver driver;
	
	//WebElements Declaration
	@FindBy(css = "h2[class='pagetitle search']")
	WebElement resultadoDaBuscaLabel;
	
	@FindBy(xpath = "//*[@id=\"blog\"]/div/div[2]/div/div/div/p")
	WebElement mensagemDeErroLabel;
	
	@FindBy(xpath = "//*[@id=\"blog\"]/div/div[2]/div/div/div/div/article[1]/div/h2/a")
	WebElement firstArticleLink;
	
	//Action Methods
	public String getResultadoDaBuscaText() {
		return resultadoDaBuscaLabel.getText();
	}
	public String getMensagemDeErroText() {
		return mensagemDeErroLabel.getText();
	}
	public void clickOnFirstArticleLink() {
		firstArticleLink.click();
	}
	public String getFirstArticleText() {
		return firstArticleLink.getText();
	}
	//Constructor
	public SOC_ResultadosBuscaPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
