import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExercise {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/switch-window");
        driver.findElement(By.id("alert-button")).click();


        Alert alert = driver.switchTo().alert();
        alert.accept();

    }
}
