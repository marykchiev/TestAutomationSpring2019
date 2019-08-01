package com.cybertek.tests.Day8_testing_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAndAfterTest {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.get("http://google.com");
    }

    @Test
    public void test1(){
        Assert.assertTrue(driver.getTitle().contains("Google"));
    }

    @Test
    public void test2(){
        Assert.assertTrue(driver.getTitle().contains("Jiydegul"));
    }

    @AfterMethod
    public void tearDown(){
        driver.close();
    }
}
