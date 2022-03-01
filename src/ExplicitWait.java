import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWait {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/autocomplete");

        WebElement autoComplete = driver.findElement(By.id("autocomplete"));
        autoComplete.sendKeys("1555 Park blvd, Palo Alto, CA");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement autoCompleteResult = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("pac-item")));


    }
}
