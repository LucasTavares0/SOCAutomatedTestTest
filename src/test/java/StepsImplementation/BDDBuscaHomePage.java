package StepsImplementation;

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
	
	//And user clicks on the search button
	
	//And user select a content result
	
	//And user clicks on the content result selected
	
	@Then("^user validates that post refers to the filter used$")
	public void user_validates_that_post_refers_to_the_filter_used() {
		
		System.out.println("---- User validates that post refers to the filter used");
	}
}
