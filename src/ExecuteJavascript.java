import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExecuteJavascript {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/modal");
        driver.findElement(By.id("modal-button")).click();

        WebElement closeButton = driver.findElement(By.id("close-button"));

        JavascriptExecutor js =(JavascriptExecutor)driver;





    }
}
