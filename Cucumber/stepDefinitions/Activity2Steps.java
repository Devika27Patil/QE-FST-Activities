package stepDefinitions;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Activity2Steps extends Base {

@Given("the user is on the login page")
public void theUserIsOnTheLoginPage() {
driver.get("https://training-support.net/webelements/login-form");
String currentUrl = driver.getCurrentUrl();
Assertions.assertTrue(currentUrl != null && currentUrl.contains("login"));
}

@When("the user enters username and password")
public void theUserEntersUsernameAndPassword() {
driver.findElement(By.id("username")).sendKeys("admin");
driver.findElement(By.id("password")).sendKeys("password");
}

// Commented out for just to check activity 4 and 5
@And("clicks the submit button")
public void clicksTheSubmitButton() {
driver.findElement(By.xpath("//button[text()='Submit']")).click();
}

@Then("get the confirmation message and verify it")
public void getTheConfirmationMessageAndVerifyIt() {

Assertions.assertTrue(
driver.getPageSource().contains("Welcome"),
"Login confirmation message not found in page source");
}
}
