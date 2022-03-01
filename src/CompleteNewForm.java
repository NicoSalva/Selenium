import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.FormPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CompleteNewForm {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

        FormPage formPage = new FormPage();
        formPage.submitForm(driver);

        ConfirmPage confir = new ConfirmPage();
        confir.waitForAlertBanner(driver);

        assertEquals("The form was successfully submitted!", confir.getAlertBannerText(driver));

        driver.quit();

    }

}
