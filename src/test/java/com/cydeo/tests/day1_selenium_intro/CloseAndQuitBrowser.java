package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAndQuitBrowser {
    public static void main(String[] args) throws InterruptedException {

            //set up chrome and create WebDriver instance
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();

            //navigate to a practice page that open new tab
            //this practice url will open and wait 3 seconds and open new tab
            driver.get("http://practice.cydeo.com/open_new_tab");

            //wait 5 second
            Thread.sleep(5000);

            //closing any current tab
            driver.close();

            //close all browser window opened by driver
            //driver.quit();
        }

    }

