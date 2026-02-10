package stepDefinitions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import io.cucumber.java.en.*;

public class Activity3Steps extends Base {

    Alert alert;

    @Given("user is on the alerts page")
    public void userIsOnAlertsPage() {
        driver.get("https://training-support.net/webelements/alerts");
        System.out.println("Opened Alerts page");
    }

    @When("user clicks the Simple Alert button")
    public void clickSimpleAlert() {
        driver.findElement(By.id("simple")).click();
        System.out.println("Clicked Simple Alert button");
    }

    @When("user clicks the Confirm Alert button")
    public void clickConfirmAlert() {
        driver.findElement(By.id("confirmation")).click();
        System.out.println("Clicked Confirm Alert button");
    }

    @When("user clicks the Prompt Alert button")
    public void clickPromptAlert() {
        driver.findElement(By.id("prompt")).click();
        System.out.println("Clicked Prompt Alert button");
    }

    @Then("alert opens")
    public void alertOpens() {
        alert = wait.until(ExpectedConditions.alertIsPresent());
        System.out.println("Alert opened");
    }

    @And("read the alert text and print it")
    public void readAlertText() {
        System.out.println("Alert text: " + alert.getText());
    }

    @And("write {string} in the alert")
    public void writeInAlert(String message) {
        alert.sendKeys(message);
        System.out.println("Entered text: " + message);
    }

    @And("close the alert")
    public void closeAlert() {
        alert.accept();
        System.out.println("Alert accepted");
    }

    @And("close the alert with cancel")
    public void closeAlertWithCancel() {
        alert.dismiss();
        System.out.println("Alert dismissed");
    }

    @And("read the result text")
    public void readResultText() {
        String result = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("result"))).getText();
        System.out.println("Result text: " + result);
    }
}
