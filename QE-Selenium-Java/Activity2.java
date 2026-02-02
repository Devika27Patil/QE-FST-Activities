package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {

    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();

        try {
            driver.get("https://training-support.net/webelements/login-form/");

            System.out.println(driver.getTitle());

            WebElement username = driver.findElement(By.cssSelector("#username"));
            username.sendKeys("admin");

            WebElement password = driver.findElement(By.cssSelector("#password"));
            password.sendKeys("password");

            WebElement submit = driver.findElement(By.cssSelector("button"));
            submit.click();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
