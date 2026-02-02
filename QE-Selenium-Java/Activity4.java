package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4 {

    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();

        try {
            driver.get("https://training-support.net/webelements/target-practice");
            System.out.println("Page Title: " + driver.getTitle());

            // Correct header indexes
            WebElement firstHeader = driver.findElement(By.xpath("(//h3)[1]"));
            System.out.println("1st Header Text: " + firstHeader.getText());

            WebElement secondHeader = driver.findElement(By.xpath("(//h3)[2]"));
            System.out.println("2nd Header Color: " +
                    secondHeader.getCssValue("color"));

            WebElement purpleButton = driver.findElement(By.xpath("//button[contains(@class,'bg-purple')]"));
            System.out.println("Purple Button Classes: " +
                    purpleButton.getAttribute("class"));

            WebElement slateButton = driver.findElement(By.xpath("//button[contains(@class,'bg-slate')]"));
            System.out.println("Slate Button Text: " +
                    slateButton.getText());

        } finally {
            driver.quit(); // ALWAYS closes browser
        }
    }
}
