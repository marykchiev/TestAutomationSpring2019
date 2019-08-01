package com.cybertek;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {
    public static void main(String[] args) throws Exception{
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/forgot_password");
        WebElement emailEnterBox =driver.findElement(By.name("email"));
        //emailEnterBox.sendKeys("email@gmail.com"+ Keys.ENTER);
        WebElement submitButton = driver.findElement(By.id("form_submit"));
        Faker faker=new Faker();
        Thread.sleep(3000);
        emailEnterBox.sendKeys(faker.firstName().replace(" ","").toLowerCase()+"@gmail.com"+ Keys.ENTER);




        Thread.sleep(3000);
        driver.close();
    }
}
