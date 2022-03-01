package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class FormPage {

    public static void submitForm(WebDriver driver)
    {
        driver.findElement(By.id("first-name")).sendKeys("Nicolas Oscar");
        driver.findElement(By.id("last-name")).sendKeys("Salvaneschi");

        driver.findElement(By.id("job-title")).sendKeys("QA Engineer");

        driver.findElement(By.id("radio-button-2")).click();

        driver.findElement(By.id("checkbox-2")).click();

        driver.findElement(By.xpath("//option[contains(text(),'0-1')]")).click();

        driver.findElement(By.id("datepicker")).sendKeys("02/20/2022");
        driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);

        driver.findElement(By.xpath("//a[contains(text(),'Submit')]")).click();
    }
}
