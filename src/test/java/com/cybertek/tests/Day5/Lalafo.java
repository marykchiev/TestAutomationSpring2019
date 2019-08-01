package com.cybertek.tests.Day5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lalafo {
    public static void main(String[] args) throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://lalafo.kg/");
        Thread.sleep(5000);
        driver.findElement(By.id("search_input")).sendKeys("3 комнатная квартира", Keys.ENTER);
        Thread.sleep(5000);
        driver.findElement(By.className("select2-selection__placeholder")).click();
        driver.findElement(By.className("select2-search__field")).sendKeys("Бишкек",Keys.ENTER);
        Thread.sleep(1000);
        driver.findElement(By.id("search_button")).click();
        driver.findElement(By.linkText("Недвижимость")).click();
        driver.findElement(By.linkText("Квартиры")).click();


    }
}
