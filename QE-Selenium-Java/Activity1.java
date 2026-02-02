package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Activity1 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        driver.get("https://training-support.net");

        System.out.println("Home Page Title :" + driver.getTitle());

        WebElement aboutUs = driver.findElement(By.linkText("About Us"));
        aboutUs.click();

        System.out.println("About Us Page Title :" + driver.getTitle());

        driver.quit();
    }

}
