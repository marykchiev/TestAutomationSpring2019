package com.cybertek.tests.Day5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeCybertekLogin {
    public static void main(String[] args) throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/login");
        //driver.navigate().to("https://www.google.com");

        driver.findElement(By.cssSelector("input[name='username']")).sendKeys("tomsmith");
        driver.findElement(By.cssSelector("input[name='password']")).sendKeys("SuperSecretPassword");
        driver.findElement(By.id("wooden_spoon")).click();
        Thread.sleep(5000);
        driver.findElement( By.xpath("//*[contains('')]"));
        String expectedMessage ="Welcome to the Secure Area. When you are done click logout below.";
        String actualMessage = driver.findElement(By.className("subheader")).getText();
        if(actualMessage.equals(expectedMessage)){
            System.out.println("Passed");
        }
        else{
            System.out.println("Failed");
            System.out.println("Expected Message: "+expectedMessage);
            System.out.println("Actual Message: "+actualMessage);
        }
        driver.findElement(By.linkText("Logout")).click();
        Thread.sleep(5000);
        driver.close();


    }

}
