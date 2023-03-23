package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Steps {
    WebDriver driver;


    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "linuxchromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        driver = new ChromeDriver(options);
    }


    @After //After Scenario
    public void teardown(){
        System.out.println("Hello After");
        driver.quit();
    }

    @Given("the user is on login page")
    public void the_user_is_on_login_page() {
      driver.get("https://www.facebook.com/");
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
