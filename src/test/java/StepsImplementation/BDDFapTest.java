package StepsImplementation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import Utilities.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BDDFapTest {
	
	//Test variables
	public String homePageURL = "https://ww2.soc.com.br/fap";
	public String browser = "";
	
	//Page Factories and Resources
	WebDriver driver;
	DriverFactory factory = new DriverFactory();
	
	
	//Test steps implementations
	@Given("^user is on the FAP page$")
	public void user_is_on_the_FAP_page(){
		
		driver.get(homePageURL);
	}

	@When("^user enters the company name$")
	public void user_enters_the_company_name(){
		
	}

	@And("^user enters a FAP value$")
	public void user_enters_a_FAP_value(){
		
	}

	@And("^user enters a RAT percentage$")
	public void user_enters_a_RAT_percentage(){
		
	}

	@And("^user enters a salary projection$")
	public void user_enters_a_salary_projection(){
		
	}

	@And("^user clicks on Estimar FAP button$")
	public void user_clicks_on_Estimar_FAP_button(){
		
	}

	@Then("^user receive a FAP calculation report$")
	public void user_receive_a_FAP_calculation_report (){
		
	}
	
	@Before
	public void setUp() {
		
		System.out.println("**** STATING TEST AND OPENNING BROWSER...");
		driver = factory.openBrowser(browser);
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
	}
	
	@After
	public void tearDown() {
		
		System.out.println("**** FINISHING TEST AND CLOSING BROWSER...");
		driver.quit();
	}
}
