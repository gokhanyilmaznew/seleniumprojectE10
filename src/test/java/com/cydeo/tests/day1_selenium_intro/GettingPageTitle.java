package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GettingPageTitle {

    public static void main(String[] args) {

        //set up crome and create WebDriver instance
        WebDriverManager.chromedriver();
        WebDriver driver = new ChromeDriver();

        //navigate to google and print out the title
        driver.get("https://cydeo.com");

        String title = driver.getTitle();
        System.out.println("Title of the page" + title);

        if (title.equals("Cydeo")) {
            System.out.println("test passed");
        } else {
            System.out.println("test failed");
        }

        driver.quit();

    }
}

