package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity5 {

    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            driver.get("https://training-support.net/webelements/dynamic-controls");

            System.out.println("Page Title: " + driver.getTitle());

            WebElement checkbox = driver.findElement(By.id("checkbox"));

            System.out.println("Checkbox displayed before remove: " + checkbox.isDisplayed());

            WebElement removeButton = driver.findElement(By.xpath("//button[contains(text(),'Remove')]"));
            removeButton.click();

            wait.until(ExpectedConditions.invisibilityOf(checkbox));

            System.out.println("Checkbox displayed after remove: " + checkbox.isDisplayed());

        } catch (Exception e) {
            System.out.println("Checkbox is not displayed after removal.");
        } finally {
            driver.quit();
        }
    }
}
