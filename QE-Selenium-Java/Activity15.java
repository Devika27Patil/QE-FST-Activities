package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity15 {
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        driver.get("https://training-support.net/webelements/dynamic-attributes");

        System.out.println("Page Title: " + driver.getTitle());

        // Find all input fields using dynamic attributes
        WebElement fullName = driver.findElement(
                By.xpath("//input[starts-with(@id,'full-name')]"));

        WebElement email = driver.findElement(
                By.cssSelector("input[id$='email']"));

        WebElement eventDate = driver.findElement(
                By.xpath("//input[contains(@name,'event-date')]"));

        WebElement details = driver.findElement(
                By.xpath("//textarea[contains(@id,'additional-details')]"));

        fullName.sendKeys("Devika");
        email.sendKeys("abc@xyz.com");
        eventDate.sendKeys("2026-02-15");
        details.sendKeys("Party time!");

        driver.findElement(
                By.xpath("//button[text()='Submit']")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.id("action-confirmation")));

        String message = driver.findElement(
                By.id("action-confirmation")).getText();

        System.out.println("Message: " + message);

        driver.quit();
    }
}
