import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class GoogleLocaltor {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","driver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http:www.ebay.com");
        driver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.findElement(By.cssSelector("#gh-ac")).sendKeys("One Plus 6T");
        driver.findElement(By.cssSelector("#gh-btn")).click();
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0,500)");







    }
}
