package com.cybertek.tests.Day5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VYTrackLogIn {
    public static void main(String[] args) throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://qa2.vytrack.com/user/login");
        driver.findElement(By.cssSelector("input[name='_username']")).sendKeys("user174");
        driver.findElement(By.cssSelector("input[name='_password']")).sendKeys("UserUser123");
        driver.findElement(By.id("_submit")).click();
        Thread.sleep(10000);
        driver.navigate().forward();

        String pageTitle = driver.getTitle();
        String expectedTitle = "Dashboard";
        String actualTitle= pageTitle;
        if(expectedTitle.equals(actualTitle))
        {
            System.out.println("Page title after logged in is correct");
        }
        else
        {
            System.out.println("Failed to confirm page title");
            System.out.println("Expected Title: "+expectedTitle);
            System.out.println("Actual Title: "+actualTitle);
        }
        driver.findElement(By.xpath("//*[@id=\"user-menu\"]/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"user-menu\"]/ul/li[4]/a")).click();
        Thread.sleep(2000);

        String pageTitle1 = driver.getTitle();
        String expectedTitle1 = "Login";
        String actualTitle1= pageTitle1;
        if(expectedTitle1.equals(actualTitle1))
        {
            System.out.println("Page title after logged out is correct");
        }
        else
        {
            System.out.println("Failed to confirm page title");
            System.out.println("Expected Title: "+expectedTitle);
            System.out.println("Actual Title: "+actualTitle);
        }

        driver.close();
        //driver.findElement(By.className("dropdown-toggle")).click();
        //driver.close();
    }
}
