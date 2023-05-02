package study_01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatePractice1 {

    public static void main(String[] args) {

        //set up chrome and create WebDriver instance
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        //navigate to https://app.vytrack.com/user/login
        driver.get("https://app.vytrack.com/user/login");


        //Enter username provided : "abcd"
        WebElement username = driver.findElement(By.id("prependedInput"));
        username.sendKeys("abcd");


        //Enter password provided : "abcd"
        WebElement password = driver.findElement(By.id("prependedInput2"));
        password.sendKeys("abcd");


        //Click on Login button
        WebElement loginBtn = driver.findElement(By.id("_submit"));
        loginBtn.click();


        //Verify the message "Invalid user name or password."
        WebElement alert = driver.findElement(By.className("alert"));
        if (alert.getText().equals("Invalid user name or password.")) {
            System.out.println("Message is Passed");
        } else {
            System.out.println("Message is Failed");
        }


        //Verify URL contains "vytrack"
        String actualURL = driver.getCurrentUrl();
        if (actualURL.contains("vytrack")) {
            System.out.println("URL is Passed");
        } else {
            System.out.println("URL is Failed");
        }


        //click "Forgot your password?" link
        driver.findElement(By.partialLinkText("Forgot")).click();


        //verify title is "Forgot Password"
        if (driver.getTitle().equals("Forgot password")) {
            System.out.println("Title is correct");

        }

    }
}









