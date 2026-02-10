// package stepDefinitions;

// import io.cucumber.java.en.*;
// import org.junit.jupiter.api.Assertions;
// import org.openqa.selenium.By;

// public class Activity4Steps extends Base {

//     @Given("user is on the login page")
//     public void user_is_on_the_login_page() {
//         driver.get("https://training-support.net/webelements/login-form");
//     }

//     @When("the user enters {string} and {string}")
//     public void the_user_enters_username_and_password(String username, String password) {
//         System.out.println("Username: " + username);
//         driver.findElement(By.id("username")).sendKeys(username);
//         driver.findElement(By.id("password")).sendKeys(password);
//     }

//     // Commented out for just to check activity 5
//     @And("clicks the submit button")
//     public void clicksTheSubmitButton() {
//         System.out.println("Clicking the Submit button");
//         driver.findElement(By.xpath("//button[text()='Submit']")).click();
//     }

//     @Then("get the confirmation message and verify it")
//     public void getTheConfirmationMessageAndVerifyIt() {

//         Assertions.assertTrue(
//                 driver.getPageSource().contains("Welcome"),
//                 "Login confirmation message not found in page source");
//         System.out.println("Login successful Welcome message verified");

//     }
// }
