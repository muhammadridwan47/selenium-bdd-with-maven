package StepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Steps {
    ChromeOptions options = new ChromeOptions();
    WebDriver driver = new ChromeDriver(options.addArguments("--remote-allow-origins=*"));
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
            driver.quit();
        }
        catch (InterruptedException | Error e) {
            if(e instanceof Error) System.out.println(((Error) e).getMessage());
            if(e instanceof InterruptedException) System.err.format("IOException: %s%n", e);
        }
    }

}
