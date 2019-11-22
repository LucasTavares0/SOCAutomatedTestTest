package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SOC_FAPReportPage {
	
	WebDriver driver;
	
	//WebElements Declaration
	@FindBy(xpath = "//*[@id=\"page\"]/section/div/header/h1")
	WebElement tituloRelatorioLabel;
	
	@FindBy(xpath = "//*[@id=\"page\"]/section/div/article[1]/table/tbody/tr/td[1]")
	WebElement nomeEmpresaLabel;
	
	@FindBy(xpath = "//*[@id=\"page\"]/section/div/article[1]/table/tbody/tr/td[2]")
	WebElement projecaoSalarialLabel;
	
	@FindBy(xpath = "//*[@id=\"page\"]/section/div/article[1]/table/tbody/tr/td[3]")
	WebElement ratLabel;
	
	@FindBy(xpath = "//*[@id=\"page\"]/section/div/article[1]/table/tbody/tr/td[4]")
	WebElement fapLabel;
	
	@FindBy(xpath = "//*[@id=\"page\"]/section/div/article[2]/table/tbody/tr[1]/td[3]")
	WebElement recolhimentoRatProjetadoLabel;
	
	@FindBy(xpath = "//*[@id=\"page\"]/section/div/article[2]/table/tbody/tr[2]/td[3]")
	WebElement recolhimentRatAjustadoProjetadoLabel;
	
	@FindBy(xpath = "//*[@id=\"page\"]/section/div/article[2]/table/tbody/tr[3]/td[2]")
	WebElement impactoAnualProjetadoLabel;
	
	@FindBy(xpath = "//*[@id=\"page\"]/section/div/article[3]/table/tbody/tr[1]/td[3]")
	WebElement recolhimentoRatAlcancarLabel;
	
	@FindBy(xpath = "//*[@id=\"page\"]/section/div/article[3]/table/tbody/tr[2]/td[3]")
	WebElement recolhimentRatAjustadoAlcancarLabel;
	
	@FindBy(xpath = "//*[@id=\"page\"]/section/div/article[3]/table/tbody/tr[3]/td[2]")
	WebElement impactoAnualAlcancarLabel;
	
	@FindBy(xpath = "//*[@id=\"page\"]/section/div/article[4]/table/tbody/tr/td[1]")
	WebElement recolhimentoMinimoLabel;
	
	@FindBy(xpath = "//*[@id=\"page\"]/section/div/article[4]/table/tbody/tr/td[2]")
	WebElement recolhimentoMaximoLabel;
	
	@FindBy(xpath = "//*[@id=\"page\"]/section/div/article[4]/table/tbody/tr/td[3]")
	WebElement recolhimentoPassivelEconomiaLabel;
	
	
	//Action Methods
	public String getTituloRelatorioText() {
		return tituloRelatorioLabel.getText();
	}
	public String getNomeEmpresaText() {
		return nomeEmpresaLabel.getText();
	}
	public String getProjecaoSalariaText() {
		return projecaoSalarialLabel.getText();
	}
	public String getRatText() {
		return ratLabel.getText();
	}
	public String getFapText() {
		return fapLabel.getText();
	}
	public String getRecolhimentoRatProjetadoText() {
		return recolhimentoRatProjetadoLabel.getText();
	}
	public String getRecolhimentoRatAjustadoProjetadoText() {
		return recolhimentRatAjustadoProjetadoLabel.getText();
	}
	public String getImpactoAnualProjetadoText() {
		return impactoAnualProjetadoLabel.getText();
	}
	public String getRecolhimentoRatAlcancarText() {
		return recolhimentoRatAlcancarLabel.getText();
	}
	public String getRecolhimentoRatAjustadoAlcancarText() {
		return recolhimentRatAjustadoAlcancarLabel.getText();
	}
	public String getImpactoAnualAlcancarText() {
		return impactoAnualAlcancarLabel.getText();
	}
	public String getRecolhimentoMinimoText() {
		return recolhimentoMinimoLabel.getText();
	}
	public String getRecolhimentoMaximoText() {
		return recolhimentoMaximoLabel.getText();
	}
	public String getRecolhimentoPassivelEconomiaText() {
		return recolhimentoPassivelEconomiaLabel.getText();
	}
	
	//Constructor
	public SOC_FAPReportPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
