package StepsImplementation;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BDDBuscaHomePage {
	
	@Given("^user is on the blog home page$")
	public void user_is_on_the_blog_home_page(){
		
		System.out.println("---- User is on the SOC Blog HomePage");
	}
	
	@When("^user enters a filter value that refers to an existent post$")
	public void user_enters_a_filter_value_that_refers_to_an_existent_post() {
		
		System.out.println("---- User enters a value that refers to an existent post");
	}
	
	@When("^user enters a filter value that does not refers to an existent post$")
	public void user_enters_a_filter_value_that_does_not_refers_to_an_existent_post() {
		
		System.out.println("---- User enters a filter value that does not refers to an existent post");
	}
	
	@And("^user clicks on the search button$")
	public void user_clicks_on_the_search_button() {
		
		System.out.println("---- User clicks on the search button");
	}
	
	@And("^user select a content result$")
	public void user_select_a_content_result() {
		
		System.out.println("---- User select a content result");
	}
	
	@And("^user clicks on the content result selected$")
	public void user_clicks_on_the_content_result_selected() {
		
		System.out.println("---- User validates that post refers to the filter used");
	}
	
	@Then("^user validates that post refers to the filter used$")
	public void user_validates_that_post_refers_to_the_filter_used() {
		
		System.out.println("---- User validates that post refers to the filter used");
	}
	
	@Then("^user receives erro message informing that no post refers to the filter used$")
	public void user_receives_erro_message_informing_that_no_post_refers_to_the_filter_used() {
		
		System.out.println("---- User receives erro message informing that no post refers to the filter used");
	}
	
	@Before
	public void setUp() {
		
		System.out.println("**** STATING TEST AND OPENNING BROWSER...");
	}
	
	@After
	public void tearDown() {
		
		System.out.println("**** FINISHING TEST AND CLOSING BROWSER...");
	}
}
