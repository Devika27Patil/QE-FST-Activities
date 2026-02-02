package demos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Activity14 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        driver.get("https://training-support.net/webelements/tables");

        System.out.println("Page Title: " + driver.getTitle());

        List<WebElement> rows = driver.findElements(
                By.xpath("//table/tbody/tr"));
        System.out.println("No of rows: " + rows.size());

        List<WebElement> columns = driver.findElements(
                By.xpath("//table/thead/tr/th"));
        System.out.println("No of columns: " + columns.size());

        String bookBefor = driver.findElement(
                By.xpath("//table/tbody/tr[5]/td[2]")).getText();
        System.out.println("Book name before sorting: " + bookBefor);

        WebElement priceHead = driver.findElement(By.xpath("//table/thead/tr/th[5]"));
        priceHead.click();

        wait.until(d -> !d.findElement(
                By.xpath("//table/tbody/tr[5]/td[2]")).getText().equals(bookBefor));

        String bookAfter = driver.findElement(
                By.xpath("//table/tbody/tr[5]/td[2]")).getText();
        System.out.println("Book name in 5th row after sorting: " + bookAfter);

        driver.quit();
    }

}
