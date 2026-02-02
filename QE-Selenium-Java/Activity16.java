package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Activity16 {

    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();

        try {
            driver.get("https://training-support.net/webelements/selects");
            System.out.println("Page Title: " + driver.getTitle());

            WebElement dropdown = driver.findElement(
                    By.xpath("//select"));

            Select select = new Select(dropdown);

            select.selectByVisibleText("Two");

            select.selectByIndex(3); // Four

            select.selectByValue("five");

            System.out.println("Dropdown options:");
            List<WebElement> options = select.getOptions();

            for (WebElement option : options) {
                System.out.println(option.getText());
            }

        } finally {
            driver.quit();
        }
    }
}
