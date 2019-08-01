package com.cybertek.tests.Day5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WarmUpWiki {
    public static void main(String[] args) throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.wikipedia.org");
        Thread.sleep(2000);
        driver.findElement(By.id("searchInput")).sendKeys("selenium webdriver", Keys.ENTER);
        driver.findElement(By.linkText("Selenium (software)")).click();
        Thread.sleep(1000);
        String titleE= driver.getCurrentUrl();

        if (titleE.endsWith("x")) {
            System.out.print("Passed");
        } else
            System.out.print("Failed");


        driver.quit();



    }
}
