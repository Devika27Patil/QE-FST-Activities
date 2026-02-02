package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity7 {

    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try { 
            driver.get("https://training-support.net/webelements/dynamic-controls");

            System.out.println("Page Title: " + driver.getTitle());

            WebElement inputField = driver.findElement(By.cssSelector("input[type='text']"));

            System.out.println("Input enabled before click: " + inputField.isEnabled());

            WebElement enableButton = driver.findElement(By.xpath("//button[text()='Enable Input']"));
            enableButton.click();

            wait.until(ExpectedConditions.elementToBeClickable(inputField));

            System.out.println("Input enabled after click: " + inputField.isEnabled());

        } finally {
            driver.quit();
        }
    }
}
