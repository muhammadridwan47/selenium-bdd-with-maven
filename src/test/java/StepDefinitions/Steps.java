package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Steps {
    WebDriver driver;


    // LifeCycle Testing
    @Before //before Scenario
    public void setup() {
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options.addArguments("--remote-allow-origins=*"));
        System.out.println("Hello setup");
    }

    @After //After Scenario
    public void teardown(){
        System.out.println("Hello After");
        driver.quit();
    }

    @BeforeStep() //before (when, given, And then) will be executed
    public void setupStep() {
        System.out.println("BeforeStep");
    }

    @AfterStep //after (when, given, And then) will be executed
    public void teardownStep(){
        System.out.println("AfterStep");
    }

    // LifeCycle Testing with Tags execution
    @Before("@ui") //before Scenario
    public void setupWithTags() {
        System.out.println("@Before(\"@ui\")");
    }



    @Given("the user is on login page")
    public void the_user_is_on_login_page() {
        driver.get("http://barru.pythonanywhere.com/daftar");
    }
    @When("the user enters valid credentials")
    public void the_user_enters_valid_credentials() {
        driver.findElement(By.xpath("/html/body/div/div[2]/form/input[1]")).sendKeys("tester@jagoqa.com"); // input email
        driver.findElement(By.cssSelector("input#password")).sendKeys("testerjago"); // input password
    }
    @When("hits submit")
    public void hits_submit() {
        driver.findElement(By.id("signin_login")).click(); // click the button
    }
    @Then("the user should be logged in successfully")
    public void the_user_should_be_logged_in_successfully() {
        try {
            // validation
            TimeUnit.SECONDS.sleep(2);
            String notificationTitle = driver.findElement(By.id("swal2-title")).getText();
            String notificationMessage = driver.findElement(By.id("swal2-content")).getText();
            //expectation
            Assert.assertTrue(notificationTitle.equals("Welcome tester jago"));
            Assert.assertTrue(notificationMessage.equals("Anda Berhasil Login"));
            TimeUnit.SECONDS.sleep(2); // this using tryCatch handle
            // driver.quit();
        }
        catch (InterruptedException | Error e) {
            if(e instanceof Error) System.out.println(((Error) e).getMessage());
            if(e instanceof InterruptedException) System.err.format("IOException: %s%n", e);
        }
    }


    @When("the user enters invalid credentials")
    public void the_user_enters_invalid_credentials() {
        driver.findElement(By.xpath("/html/body/div/div[2]/form/input[1]")).sendKeys("invalid@email.com"); // input email
        driver.findElement(By.cssSelector("input#password")).sendKeys("invalipassword"); // input password
    }


    @When("an invalid credentials error message should be displayed to the user")
    public void an_invalid_credentials_error_message_should_be_displayed_to_the_user() {
        try {
            // validation
            TimeUnit.SECONDS.sleep(2);
            String notificationTitle = driver.findElement(By.id("swal2-title")).getText();
            String notificationMessage = driver.findElement(By.id("swal2-content")).getText();
            //expectation
            Assert.assertTrue(notificationTitle.equals("User's not found"));
            Assert.assertTrue(notificationMessage.equals("Email atau Password Anda Salah"));
            TimeUnit.SECONDS.sleep(2);
        }
        catch (InterruptedException  e) {
            if(e instanceof InterruptedException) System.err.format("IOException: %s%n", e);
        }
    }
    @When("the user should be logged in unsuccessfully")
    public void the_user_should_be_logged_in_unsuccessfully() {
       // driver.quit();
    }


    @Then("the company logo should be present in the login form")
    public void the_company_logo_should_be_present_in_the_login_form() {
        String component = driver.findElement(By.xpath("/html/body/div/div[2]/form/h1")).getText();
        Assert.assertTrue(component.equals("Sign in"));
        // driver.quit();
    }
}
