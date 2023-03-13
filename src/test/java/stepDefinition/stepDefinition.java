package stepDefinition;

import org.junit.runner.RunWith;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class stepDefinition {
	
	@Given("^User in on Net Banking Landing Page$")
	public void user_in_on_net_banking_landing_page() throws Throwable {
		System.out.println("A");
	}

	@When("^User login into application with username and password$")
	public void user_login_into_application_with_username_and_password() throws Throwable {
		System.out.println("B");
	}

	@Then("^Home Page is populated $")
	public void home_page_is_populated() throws Throwable {
		System.out.println("C");
	}

	@And("^Cards are displayed $")
	public void cards_are_displayed() throws Throwable {
		System.out.println("D");
	}
}
