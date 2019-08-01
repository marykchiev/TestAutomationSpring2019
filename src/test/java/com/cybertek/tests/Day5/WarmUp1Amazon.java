package com.cybertek.tests.Day5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WarmUp1Amazon {
    public static void main(String[] args) throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Java OCA book");
        Thread.sleep(2000);
        driver.findElement(By.className("nav-input")).click();
        Thread.sleep(2000);
        String pageTitle = driver.getTitle();
        String expectedTitle = "Java OCA book";
        String actualTitle= pageTitle;
        if(actualTitle.contains(expectedTitle))
        {
            System.out.println("Page title contains search term");
        }
        else
        {
            System.out.println("Failed to confirm page title");
            System.out.println("Expected Title: "+expectedTitle);
            System.out.println("Actual Title: "+actualTitle);
        }
        driver.close();
    }
}
