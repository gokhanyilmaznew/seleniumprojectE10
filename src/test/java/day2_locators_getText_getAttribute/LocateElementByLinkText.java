package day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateElementByLinkText {

    public static void main(String[] args) {

        //set up crome and create WebDriver instance
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //navigate to google.com
        driver.get("https://google.com");

        //identify and save the Gmail link element on the top
        WebElement GmailLink = driver.findElement(By.linkText("Gmail"));

        //click on the link
        GmailLink.click();



        //close the browser
        //driver.quit();


    }

}
