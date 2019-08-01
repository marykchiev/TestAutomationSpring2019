package com.cybertek;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstAutomationScript {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("http://practice.cybertekschool.com");
        driver.navigate( ).to( driver.getCurrentUrl( ) );
        driver.navigate( ).refresh( );
        driver.get( driver.getCurrentUrl ( ) );

        driver.navigate().to( "www.google.com");

    }
}
