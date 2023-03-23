package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Steps {
    WebDriver driver;

    WebDriverManager wdm = WebDriverManager.chromedriver().browserInDocker()
            .enableVnc().enableRecording();

    // LifeCycle Testing
    @Before //before Scenario
    public void setup() {
        driver = wdm.create();
//        WebDriverManager.chromedriver().setup();
//        ChromeOptions options = new ChromeOptions();
//        driver = new ChromeDriver(options.addArguments("--remote-allow-origins=*"));
//        driver = new ChromeDriver();
        System.out.println("Hello setup");
    }

    @After //After Scenario
    public void teardown(){
        System.out.println("Hello After");
        wdm.quit();
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
