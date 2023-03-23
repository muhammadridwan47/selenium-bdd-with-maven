package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class Steps {


    @Before
    public void setup() {
        System.out.println("Hello Before");
    }


    @After //After Scenario
    public void teardown(){
        System.out.println("Hello After");
    }

    @Given("the user is on login page")
    public void the_user_is_on_login_page() {
      System.out.println("the_user_is_on_login_page");
    }
    @When("the user enters valid credentials")
    public void the_user_enters_valid_credentials() {
        System.out.println("the_user_enters_valid_credentials");
    }
    @When("hits submit")
    public void hits_submit() {
        System.out.println("hits_submit");
    }
    @Then("the user should be logged in successfully")
    public void the_user_should_be_logged_in_successfully() {
        System.out.println("the_user_should_be_logged_in_successfully");
    }

}
