package demos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity13 {

    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/webelements/tables");

        System.out.println("Page Title: " + driver.getTitle());

        List<WebElement> rows = driver.findElements(
                By.xpath("//table/tbody/tr"));
        System.out.println("No of rows: " + rows.size());

        List<WebElement> columns = driver.findElements(
                By.xpath("//table/thead/tr/th"));
        System.out.println("No of columns: " + columns.size());

        List<WebElement> thirdRow = driver.findElements(
                By.xpath("//table/tbody/tr[3]/td"));

        System.out.println("Third row data:");
        for (WebElement cell : thirdRow) {
            System.out.println(cell.getText());
        }

        WebElement cellVal = driver.findElement(
                By.xpath("//table/tbody/tr[2]/td[2]"));
        System.out.println("2nd row, 2nd column data: " + cellVal.getText());

        driver.quit();
    }
}
