package StepsImplementation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import Pages.SOC_FAPPage;
import Utilities.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BDDFAPTest {
	
	//Input test variables
	public String homePageURL = "https://ww2.soc.com.br/blog/";
	public String browser = "";
	
	//Pages and Resources instances
	WebDriver driver;
	SOC_FAPPage fappage;
	DriverFactory factory = new DriverFactory();
	
	@Given("^user is on the FAP page$")
	public void user_is_on_the_FAP_page() {
		
		System.out.println("---- User is on the FAP page");
	}
	
	@When("^user enters the company name$")
	public void user_enters_the_company_name(){
		
		System.out.println("---- User enters the company name");
	}
	
	@And("^user enters a FAP value$")
	public void user_enters_a_FAP_value(){
		
		System.out.println("---- User enters a FAP value");
	}
	
	@And("^user enters a RAT percentage$")
	public void user_enters_a_RAT_percentage(){
		
		System.out.println("---- User enters a RAT percentage");
	}
	
	@And("^user enters a salary projection$")
	public void user_enters_a_salary_projection(){
		
		System.out.println("---- User enters a salary projection");
	}
	
	@And("^user clicks on Estimar FAP button$")
	public void user_clicks_on_Estimar_FAP_button(){
		
		System.out.println("---- User clicks on Estimar FAP button");
	}
	
	@Then("^user receive a FAP calculation report$")
	public void user_receive_a_FAP_calculation_report(){
		
		System.out.println("---- User receive a FAP calculation report");
	}
	
	@Before
	public void startUp() {
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
