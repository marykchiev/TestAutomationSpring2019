package com.cybertek.tests.OfficeHour;

import com.cybertek.utilities.SeleniumUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExpediaAutomation {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.expedia.com/");
        String expctedTitle = "Expedia Travel: Search Hotels, Cheap Flights, Car Rentals & Vacations";
        String actualTitle = driver.getTitle();
        SeleniumUtils.verifyEquals(expctedTitle, actualTitle);
        driver.findElement(By.id("tab-flight-tab-hp")).click();
        driver.findElement(By.id("flight-origin-hp-flight")).sendKeys("Houston, TX (IAH-George Bush Intercontinental)");
        driver.findElement(By.id("flight-destination-hp-flight")).sendKeys("Dallas, TX (DFW-Dallas-Fort Worth Intl.)");

    }

}
