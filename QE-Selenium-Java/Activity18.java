package demos;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity18 {

    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            driver.get("https://training-support.net/webelements/alerts");

            System.out.println("Page Title: " + driver.getTitle());

            WebElement simpleAlertButton = wait.until(
                    ExpectedConditions.elementToBeClickable(
                            By.xpath("//button[contains(text(),'Simple')]")));
            simpleAlertButton.click();

            Alert alert = wait.until(ExpectedConditions.alertIsPresent());

            System.out.println("Alert Text: " + alert.getText());
            alert.accept();

        } finally {
            driver.quit();
        }
    }
}
