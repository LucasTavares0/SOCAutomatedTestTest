package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SOC_PostDetailsPage {
	
	WebDriver driver;
	
	//WebElements Declaration
	@FindBy(xpath = "//*[@id=\"content\"]/article[1]/h1")
	WebElement tituloPost;
	
	@FindBy(xpath = "//*[@id=\"content\"]/article[1]")
	WebElement corpoArtigo;
	
	//Action Methods
	public String getPostTitle() {
		return tituloPost.getText();
	}
	public String getArticleContentText() {
		return corpoArtigo.getText();
	}
	//Constructor
	public SOC_PostDetailsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
