package StepsImplementation;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import Pages.SOC_FAPPage;
import Pages.SOC_FAPReportPage;
import Pages.SOC_homePage;
import Utilities.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BDDFapTest {
	
	//Test variables
	public String homePageURL = "https://ww2.soc.com.br/blog";
	public String browser = "";
	public String nomeEmpresa = "Insight Company Ltda";
	public String valorFap = "0,5";
	public String projecaoSalarial = "10.000.000,00";
	
	//Page Factories
	WebDriver driver;
	SOC_homePage homepage;
	SOC_FAPPage fappage;
	SOC_FAPReportPage reportpage;
	
	//Resources
	DriverFactory factory = new DriverFactory();
	
	//Test steps implementations
	@Given("^user is on the home page$")
	public void user_is_on_the_blog_home_page(){
		
		System.out.println("----- User is on the blog home page");
		driver.get(homePageURL);
		homepage = new SOC_homePage(driver);
	}

	@When("^user clicks on FAP option$")
	public void user_clicks_on_FAP_option(){
		
		System.out.println("----- User clicks on FAP option");
		homepage.clickOnSubmenuHear();
		homepage.clickOnLinkFAP();
	}
	
	@And("^user is on the FAP page$")
	public void user_is_on_the_FAP_page(){
		
		System.out.println("----- User is on the FAP page");
		System.out.println("#### Working on page = " + driver.getTitle());
		fappage = new SOC_FAPPage(driver);
	}
	
	@And("^user enters the company name$")
	public void user_enters_the_company_name(){
		
		System.out.println("----- User enters the company name");
		System.out.println("#### Company Name sent = " + nomeEmpresa);
		fappage.sendCompanyName(nomeEmpresa);
	}
	
	@And("^user enters a FAP value$")
	public void user_enters_a_FAP_value(){
		
		System.out.println("----- User enters a FAP value");
		System.out.println("#### FAP value sent = " + valorFap);
		fappage.sendFap(valorFap);
	}

	@And("^user enters a RAT percentage$")
	public void user_enters_a_RAT_percentage(){
		
		System.out.println("----- User enters a RAT percentage");
		fappage.clickRatButton();
		fappage.clickRatOption3();
	}

	@And("^user enters a salary projection$")
	public void user_enters_a_salary_projection(){
		
		System.out.println("----- User enters a salary projection");
		System.out.println("#### Salary Projection sent = " + projecaoSalarial);
		fappage.sendSalaryProjection(projecaoSalarial);
	}

	@And("^user clicks on Estimar FAP button$")
	public void user_clicks_on_Estimar_FAP_button(){
		
		System.out.println("----- User clicks on Estimar FAP button");
		fappage.clickEstimarFapButton();
	}

	@Then("^user receive a FAP calculation report$")
	public void user_receive_a_FAP_calculation_report (){
		
		System.out.println("----- User receive a FAP calculation report");
		System.out.println("#### Working on page = " + driver.getTitle());
		reportpage = new SOC_FAPReportPage(driver);
		
		String nomeEmpresaRelatorio = reportpage.getNomeEmpresaText();
		String projecaoSalarialRelatorio = reportpage.getProjecaoSalariaText();
		String fapRelatorio = reportpage.getFapText();
		String ratRelatorio = reportpage.getRatText();
		
		System.out.println("=== Dados Relatorio ===");
		System.out.println("-> Nome Empresa = " + nomeEmpresaRelatorio);
		System.out.println("-> Projecao Salaria = " + projecaoSalarialRelatorio);
		System.out.println("-> FAP = " + fapRelatorio );
		System.out.println("-> RAT = " + ratRelatorio);
		
		Assert.assertTrue("Nome da empresa no relatorio nao condiz com empresa utilizada", 
									nomeEmpresa.equalsIgnoreCase(nomeEmpresaRelatorio));
		Assert.assertTrue("Projeção salarial no relatório não condiz com projeção utilizada",
									projecaoSalarial.equalsIgnoreCase(projecaoSalarialRelatorio));
		Assert.assertTrue("FAP no relatorio nao condiz com FAP utilizado", 
									valorFap.equalsIgnoreCase(fapRelatorio));
		Assert.assertTrue("RAT no relatorio nao condiz com RAT utilizado",
									ratRelatorio.equalsIgnoreCase("1"));
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
