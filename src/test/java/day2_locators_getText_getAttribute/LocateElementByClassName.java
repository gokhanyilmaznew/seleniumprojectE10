package day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateElementByClassName {

    public static void main(String[] args) {

        //set up chrome and create WebDriver instance
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //navigate to google.com
        driver.get("https://google.com");

        //identify and save the "Helpful tips to fact check information online" element
        WebElement helpfulText = driver.findElement(By.className("NKcBbd"));

        //verify the "Helpful tips to fack check information online" text appear correctly
        if(helpfulText.getText().equals("Helpful tips to fact check information online")) {
            System.out.println("Text appears correctly!");
        }else{
            System.out.println("Text does not appear correctly!");
}

        //close the browser
        driver.quit();

    }
}
