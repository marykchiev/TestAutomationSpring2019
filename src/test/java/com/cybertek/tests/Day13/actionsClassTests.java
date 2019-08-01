package com.cybertek.tests.Day13;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class actionsClassTests {
    WebDriver driver;
    String user1TextLocator="//a[@href='/users/1']/preceding-sibling::h5";
    String firstImageLocator = "(//img)[1]";



    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void hoverTest1(){
        driver.get("http://practice.cybertekschool.com/hovers");
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath(firstImageLocator))).perform();
}
    @AfterMethod
    public void teardown(){
       driver.quit();
    }
}
