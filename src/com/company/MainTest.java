package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainTest {

    public static void main(String[] args) {



        System.setProperty("webdriver.chrome.driver","driver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();


        driver.get("http:\\www.gooogle.com");





        //driver.quit();
    }
}
