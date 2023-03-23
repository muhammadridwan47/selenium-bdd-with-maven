package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Steps {
    WebDriver driver;


    // LifeCycle Testing
    @Before //before Scenario
    public void setup() {
        driver = WebDriverManager.chromedriver().create();
//        WebDriverManager.chromedriver().setup();
//        ChromeOptions options = new ChromeOptions();
//        driver = new ChromeDriver(options.addArguments("--remote-allow-origins=*"));
//        driver = new ChromeDriver();
        System.out.println("Hello setup");
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
