// package demos;

// import org.openqa.selenium.By;
// import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.WebElement;
// import org.openqa.selenium.firefox.FirefoxDriver;
// import org.openqa.selenium.interactions.Actions;

// public class Activity10 {

//     public static void main(String[] args) throws InterruptedException {

//         WebDriver driver = new FirefoxDriver();
//         driver.get("https://training-support.net/webelements/drag-drop");

//         System.out.println("Page Title: " + driver.getTitle());

//         // ✅ Correct XPath locators
//         WebElement ball = driver.findElement(By.xpath("//*[@id='ball']"));
//         WebElement dropzone1 = driver.findElement(By.xpath("//*[@id='dropzone1']"));
//         WebElement dropzone2 = driver.findElement(By.xpath("//*[@id='dropzone2']"));

//         Actions actions = new Actions(driver);

//         // Drag to Dropzone 1
//         actions.dragAndDrop(ball, dropzone1).perform();
//         Thread.sleep(1000);
//         System.out.println("After Dropzone 1: " + dropzone1.getText());

//         // Drag to Dropzone 2
//         actions.dragAndDrop(ball, dropzone2).perform();
//         Thread.sleep(1000);
//         System.out.println("After Dropzone 2: " + dropzone2.getText());

//         driver.quit();
//     }
// }

package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity10 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/webelements/drag-drop");

        System.out.println("Page Title: " + driver.getTitle());

        WebElement ball = driver.findElement(By.xpath("//*[@id='ball']"));
        WebElement dr1 = driver.findElement(
                By.xpath("//div[@id='dropzone1']/span"));
        WebElement dr2 = driver.findElement(
                By.xpath("//div[@id='dropzone2']/span"));

        Actions actions = new Actions(driver);

        actions.dragAndDrop(ball, dr1).perform();
        Thread.sleep(1000);
        System.out.println("After Dropzone 1: " + dr1.getText());

        actions.dragAndDrop(ball, dr2).perform();
        Thread.sleep(1000);
        System.out.println("After Dropzone 2: " + dr2.getText());

        driver.quit();
    }
}
