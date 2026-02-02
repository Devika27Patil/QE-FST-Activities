package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity9 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new FirefoxDriver();

        driver.get("https://training-support.net/webelements/keyboard-events");

        System.out.println("Page Title: " + driver.getTitle());

        driver.findElement(By.tagName("body")).click();

        Actions actions = new Actions(driver);
        actions.sendKeys("Hello from Selenium").perform();

        Thread.sleep(5000);

        System.out.println("Text Typed: Hello from Selenium");

        driver.quit();
    }
}
