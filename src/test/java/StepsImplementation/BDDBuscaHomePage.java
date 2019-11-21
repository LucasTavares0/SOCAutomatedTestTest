package StepsImplementation;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import Pages.SOC_ResultadosBuscaPage;
import Pages.SOC_homePage;
import Utilities.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BDDBuscaHomePage {
	
	//Test input variables
	public String homePageURL = "https://ww2.soc.com.br/blog/";
	public String searchFilter;
	public String firstArticleTitle;
	public String browser = "";
	
	WebDriver driver;
	DriverFactory factory = new DriverFactory();
	SOC_homePage homepage;
	SOC_ResultadosBuscaPage resultadospage;
	
	@Given("^user is on the blog home page$")
	public void user_is_on_the_blog_home_page(){
		
		System.out.println("---- User is on the SOC Blog HomePage");		
		homepage = new SOC_homePage(driver);
	}
	
	@When("^user enters a filter value that refers to an existent post$")
	public void user_enters_a_filter_value_that_refers_to_an_existent_post() {
		
		System.out.println("---- User enters a value that refers to an existent post");
		
		searchFilter = "Oportunidades";
		System.out.println("Valor inserido = " + searchFilter);
		homepage.sendKeysBuscarTextBox(searchFilter);
	}
	
	@When("^user enters a filter value that does not refers to an existent post$")
	public void user_enters_a_filter_value_that_does_not_refers_to_an_existent_post() {
		
		System.out.println("---- User enters a filter value that does not refers to an existent post");
		
		searchFilter = "aaaaaaaaaaaaaaaahhhhhhhhhhhhhhhh";
		System.out.println("Valor inserido = " + searchFilter);
		homepage.sendKeysBuscarTextBox(searchFilter);
	}
	
	@And("^user clicks on the search button$")
	public void user_clicks_on_the_search_button() {
		
		System.out.println("---- User clicks on the search button");
		homepage.clickOnBuscarButton();
	}
	
	@And("^user select a content result$")
	public void user_select_a_content_result() {
		
		System.out.println("---- User select a content result");
		resultadospage = new SOC_ResultadosBuscaPage(driver);
		
		String messageReceived = resultadospage.getResultadoDaBuscaText();
		System.out.println("Mensagem de alerta recebida = "+ messageReceived);
		Assert.assertTrue(messageReceived.contains("RESULTADO DA SUA BUSCA NO BLOG: "+ searchFilter.toUpperCase()));
	}
	
	@And("^user clicks on the content result selected$")
	public void user_clicks_on_the_content_result_selected() {
		
		System.out.println("---- User clicks on the content result selected");
		
		firstArticleTitle = resultadospage.getFirstArticleText();	
		System.out.println("Clicando no primeiro artigo da lista: " + firstArticleTitle);
		resultadospage.clickOnFirstArticleLink();
	}
	
	@Then("^user validates that post refers to the filter used$")
	public void user_validates_that_post_refers_to_the_filter_used() {
		
		System.out.println("---- User validates that post refers to the filter used");
	}
	
	@Then("^user receives erro message informing that no post refers to the filter used$")
	public void user_receives_erro_message_informing_that_no_post_refers_to_the_filter_used() {
		
		System.out.println("---- User receives erro message informing that no post refers to the filter used");
		resultadospage = new SOC_ResultadosBuscaPage(driver);
		
		String messageReceived = resultadospage.getResultadoDaBuscaText();
		String erroMessage = resultadospage.getMensagemDeErroText();
		
		System.out.println("Mensagem de alerta recebida = "+ messageReceived);
		Assert.assertTrue(messageReceived.contains("RESULTADO DA SUA BUSCA NO BLOG: "+ searchFilter.toUpperCase()));
		System.out.println("Mensagem de erro recebida = " + erroMessage);
		Assert.assertTrue(erroMessage.contains("Nenhum post encontrado. Tente uma busca diferente"));
	}
	
	@Before
	public void setUp() {
		
		System.out.println("**** STATING TEST AND OPENNING BROWSER...");
		driver = factory.openBrowser(browser);
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		driver.get(homePageURL);
	}
	
	@After
	public void tearDown() {
		
		System.out.println("**** FINISHING TEST AND CLOSING BROWSER...");
		driver.quit();
	}
}
