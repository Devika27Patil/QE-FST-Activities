package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class Activity3 {
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://training-support.net/webelements/login-form/");
        System.out.println(driver.getTitle());

        WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//input[@id='username']")));
        username.sendKeys("admin");

        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("password");

        WebElement submit = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//button[contains(@class,'svelte')]")));
        submit.click();

        driver.quit();
    }
}
