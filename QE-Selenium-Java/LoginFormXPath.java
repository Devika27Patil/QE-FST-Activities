package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginFormXPath {

    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();

        driver.get("https://training-support.net/webelements/login-form/");

        System.out.println("Page Title: " + driver.getTitle());

        WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
        username.sendKeys("admin");

        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("password");

        WebElement loginBtn = driver.findElement(By.xpath("//button[text()='Log in']"));
        loginBtn.click();

        driver.quit();
    }
}
