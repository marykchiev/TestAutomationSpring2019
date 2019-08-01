package com.cybertek.tests.Day11_vytrack;

import com.cybertek.utilities.SeleniumUtils;
import com.cybertek.utilities.VYTrackUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class CreateButtonTests {

    WebDriver driver;
    String createButtonLocator = "a[title='Log call']"; // locator for log call button
    String createCalendarEventButtonLocator = "a[title='Create Calendar event']";


    @BeforeMethod
    public void setup(){
        //driver setup
        WebDriverManager.chromedriver().setup();
        //to initialize driver
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://qa2.vytrack.com/user/login");
    }

    @Test
    public void storeManagerTest(){
        //login
        VYTrackUtils.login(driver, "storemanager85", "UserUser123");
        //navigate to the Calls
        SeleniumUtils.waitPlease(6);
        VYTrackUtils.navigateToModule(driver, "Activities", "Calls");
        //assert true that button "log call" is displayed
        SeleniumUtils.waitPlease(6);
        Assert.assertTrue(driver.findElement(By.cssSelector(createButtonLocator)).isDisplayed());
        SeleniumUtils.waitPlease(2);

        VYTrackUtils.navigateToModule(driver, "Activities", "Calendar Events");
        SeleniumUtils.waitPlease(4  );
        //Verify that Create Calendar Event is displayed
        Assert.assertTrue(driver.findElement(By.cssSelector(createCalendarEventButtonLocator)).isDisplayed());
        SeleniumUtils.waitPlease(2);
    }


    @AfterMethod
    public void teardown(){
        driver.quit();
    }


}