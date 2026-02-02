package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity6 {

    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();

        try {
            // Open page
            driver.get("https://training-support.net/webelements/dynamic-controls");

            // Print title
            System.out.println("Page Title: " + driver.getTitle());

            // Find checkbox
            WebElement checkbox = driver.findElement(By.cssSelector("input[type='checkbox']"));

            // Check selection before click
            System.out.println("Checkbox selected before click: " + checkbox.isSelected());

            // Click checkbox
            checkbox.click();

            // Check selection after click
            System.out.println("Checkbox selected after click: " + checkbox.isSelected());

        } finally {
            // Close browser
            driver.quit();
        }
    }
}
