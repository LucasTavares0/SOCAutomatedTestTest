package StepsImplementation;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import Pages.SOC_PostDetailsPage;
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
	public String filtroConsulta;
	public String tituloPrimeiroArtigo;
	public String browser = "";
	
	//Page Factories
	SOC_homePage homepage;
	SOC_ResultadosBuscaPage resultadospage;
	SOC_PostDetailsPage postpage;
	
	//Resources
	WebDriver driver;
	DriverFactory factory = new DriverFactory();
	
	
	//Test steps implementation
	@Given("^user is on the blog home page$")
	public void user_is_on_the_blog_home_page(){
		
		System.out.println("---- User is on the SOC Blog HomePage");
		driver.get(homePageURL);
		homepage = new SOC_homePage(driver);
	}
	
	@When("^user enters a filter value that refers to an existent post$")
	public void user_enters_a_filter_value_that_refers_to_an_existent_post() {
		
		System.out.println("---- User enters a value that refers to an existent post");
		filtroConsulta = "Tecnologia";
		System.out.println("Valor inserido = " + filtroConsulta);
		homepage.sendKeysBuscarTextBox(filtroConsulta);
	}
	
	@When("^user enters a filter value that does not refers to an existent post$")
	public void user_enters_a_filter_value_that_does_not_refers_to_an_existent_post() {
		
		System.out.println("---- User enters a filter value that does not refers to an existent post");
		filtroConsulta = "aaaaaaaaaaaaaaaahhhhhhhhhhhhhhhh";
		System.out.println("Valor inserido = " + filtroConsulta);
		homepage.sendKeysBuscarTextBox(filtroConsulta);
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
		Assert.assertTrue(messageReceived.contains("RESULTADO DA SUA BUSCA NO BLOG: "+ filtroConsulta.toUpperCase()));
	}
	
	@And("^user clicks on the content result selected$")
	public void user_clicks_on_the_content_result_selected() {
		
		System.out.println("---- User clicks on the content result selected");
		tituloPrimeiroArtigo = resultadospage.getFirstArticleText();	
		System.out.println("Clicando no primeiro artigo da lista: " + tituloPrimeiroArtigo);
		resultadospage.clickOnFirstArticleLink();
	}
	
	@Then("^user validates that post refers to the filter used$")
	public void user_validates_that_post_refers_to_the_filter_used() {
		
		System.out.println("---- User validates that post refers to the filter used");
		postpage = new SOC_PostDetailsPage(driver);
		
		String postTitleReceived = postpage.getPostTitle();
		String articleContentReceived = postpage.getArticleContentText();
		
		System.out.println("Titulo do Artigo = "+ postTitleReceived);
		//System.out.println("Conteudo do Artigo = "+ articleContentReceived);
		
		Assert.assertTrue("Titulo do artigo nao condiz com o titulo do post selecionado",
							postTitleReceived.equalsIgnoreCase(tituloPrimeiroArtigo));
		Assert.assertTrue("Conteundo do artigo nao contem palavra filtro usada na pesquisa", 
							articleContentReceived.toLowerCase().contains(filtroConsulta.toLowerCase()));
	}
	
	@Then("^user receives erro message informing that no post refers to the filter used$")
	public void user_receives_erro_message_informing_that_no_post_refers_to_the_filter_used() {
		
		System.out.println("---- User receives erro message informing that no post refers to the filter used");
		resultadospage = new SOC_ResultadosBuscaPage(driver);
		
		String messageReceived = resultadospage.getResultadoDaBuscaText();
		String erroMessage = resultadospage.getMensagemDeErroText();
		
		System.out.println("Mensagem de alerta recebida = "+ messageReceived);
		Assert.assertTrue(messageReceived.contains("RESULTADO DA SUA BUSCA NO BLOG: "+ filtroConsulta.toUpperCase()));
		System.out.println("Mensagem de erro recebida = " + erroMessage);
		Assert.assertTrue(erroMessage.contains("Nenhum post encontrado. Tente uma busca diferente"));
	}
	
	@Before
	public void setUp() {
		
		System.out.println("**** STATING TEST AND OPENNING BROWSER...");
		driver = factory.openBrowser(browser);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	}
	
	@After
	public void tearDown() {
		
		System.out.println("**** FINISHING TEST AND CLOSING BROWSER...");
		driver.quit();
	}
}
