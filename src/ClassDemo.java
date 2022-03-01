import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassDemo {


    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","driver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https:www.gmail.com");
        driver.manage().window().maximize();
        driver.findElement(By.id("identifierId")).sendKeys("nikolassalvaneschi@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.className("VfPpkd-vQzf8d")).click();
        Thread.sleep(2000);
        String at = driver.getTitle();
        String et = "gmail";
        driver.close();

        if (at.equalsIgnoreCase(et)){
            System.out.println("Test succesussful");
        }
        else{
            System.out.println("Test Failur");
        }





    }

}
