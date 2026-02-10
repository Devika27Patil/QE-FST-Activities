package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

public class Activity5Steps extends Base {

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        driver.get("https://training-support.net/webelements/login-form");
        System.out.println("Opened login page");
    }

    @When("the user enters {string} and {string}")
    public void the_user_enters_username_and_password(String username, String password) {
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        System.out.println("Entered username: " + username);
        System.out.println("Entered password: " + password);
    }

    @And("clicks the submit button")
    public void clicksTheSubmitButton() {
        driver.findElement(By.xpath("//button[text()='Submit']")).click();
    }

    @Then("get the confirmation message and verify it")
    public void getTheConfirmationMessageAndVerifyIt() {

        Assertions.assertTrue(
                driver.getPageSource().contains("Welcome"),
                "Login confirmation message not found in page source");
        System.out.println("Login successful Welcome message verified");

    }
}
