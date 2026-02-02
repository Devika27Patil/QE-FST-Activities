package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity17 {

    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();

        try {
            driver.get("https://training-support.net/webelements/selects");
            System.out.println("Page Title: " + driver.getTitle());

            WebElement multiSelect = driver.findElement(
                    By.xpath("//select[@multiple]"));

            Select select = new Select(multiSelect);

            if (select.isMultiple()) {
                System.out.println("Multi-select dropdown detected");
            }

            select.selectByVisibleText("HTML");

            select.selectByIndex(3); // Node
            select.selectByIndex(4); // React
            select.selectByIndex(5); // Angular

            select.selectByValue("nodejs");

            Thread.sleep(2000);

            select.deselectByIndex(4);

            Thread.sleep(2000);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
