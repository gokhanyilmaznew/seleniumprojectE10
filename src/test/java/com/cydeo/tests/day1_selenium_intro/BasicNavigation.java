package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation {
    public static void main(String[] args) {

        //set up crome and create WebDriver instance
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //navigate.to(url)
        driver.navigate().to("https://www.google.com");

        //driver.get(url)
        //driver.get("https://www.google.com");

        //navigate.back()
        driver.navigate().back();

        //navigate.forward()
        driver.navigate().forward();

        //navigate.refresh()
        driver.navigate().refresh();






    }
}
