package com.cybertek.tests.OfficeHour;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ICreateTestimonial {
    public static void main(String[] args) throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.icreatecafe.com/");
        Thread.sleep(5000);
        driver.findElement(By.id("collect-testimonials")).click();
        Thread.sleep(2000);



    }

}
