package com.cybertek;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;

public class Test1 {
    public static void main(String[] args) throws Exception{
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/forgot_password");
        WebElement emailEnterBox =driver.findElement(By.name("email"));
        emailEnterBox.sendKeys("emil@gmail.com");
        Thread.sleep(2000 );
        WebElement submitButton = driver.findElement(By.id("form_submit"));
        submitButton.click();
        Thread.sleep(2000 );

        WebElement confirmationPage = driver.findElement(By.name("confirmation_message"));

        String expectedMessage="Your e-mail's been sent!";
        String actualMessage = confirmationPage.getText();
        if(expectedMessage.equals(actualMessage)){
            System.out.println("Test passed");
        }
        else {
            System.out.println("Test Failed");
            System.out.println("Expected message: "+expectedMessage);
            System.out.println("Actual message: "+actualMessage);
        }
        driver.close();
    }
}
