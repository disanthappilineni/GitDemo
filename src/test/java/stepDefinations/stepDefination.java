package stepDefinations;

import org.junit.runner.RunWith;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class stepDefination {

	@Given("^user is on landing page$")
	public void user_Is_On_Netbanking_Landing() throws Throwable {
		System.out.println("bank page landed");
		// code to navigate url
	}

	@When("^user login into application with username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void login_into_app_with_username_password(String strArg1, String strArg2) throws Throwable {
		// code to login
		System.out.println("logged successfully");
		System.out.println(strArg1);
		System.out.println(strArg2);

	}

	@Then("^Home page is populated$")
	public void home_page_is_populated() throws Throwable {
		// code for validation
		System.out.println("validation success");
	}

	@And("^Cards are displayed \"([^\"]*)\"$")
	public void cards_are_displayed(Boolean bt) throws Throwable {
		System.out.println("All cards are displayed");
		System.out.println(bt);
	}
}
