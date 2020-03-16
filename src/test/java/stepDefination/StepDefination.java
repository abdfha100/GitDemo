package stepDefination;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class StepDefination {

    @Given("^User is on NetBanking landing page$")
    public void user_is_on_netbanking_landing_page() throws Throwable {
        System.out.println("navigated to login URL");
        System.out.println("navigated to login second_URL");
    }

    @When("^User login into application with username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_login_into_application_with_username_something_and_password_something(String strArg1, String strArg2) throws Throwable {
    	System.out.println(strArg1);
    	System.out.println(strArg2);
        System.out.println("Logedd in success");
        System.out.println("Logedd in second success");
    }

    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
        //code to home page validation
    	 System.out.println("validated the home page");
    	 System.out.println("validated the home page second time");
    }
    
    @And("^Cards displayed are \"([^\"]*)\"$")
    public void cards_displayed_are_something(String strArg1) throws Throwable {
    	//code validating the cards..
   	    System.out.println("validated the card");
   	 System.out.println("validated the card 2 times");
   	 System.out.println(strArg1);
    }

}