package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity12 {

    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        driver.get("https://training-support.net/webelements/dynamic-content");

        System.out.println("Page Title: " + driver.getTitle());

        WebElement clickMeBtn = driver.findElement(
                By.xpath("//button[contains(text(),'Click me')]"));
        clickMeBtn.click();

        WebElement message = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//*[contains(text(),'release')]")));

        System.out.println("Message displayed: " + message.getText());

        driver.quit();
    }
}
