package com.cybertek.pages.briteERP;

import com.cybertek.utilities.SeleniumUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class briteChangePrice {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://54.148.96.210/");
        driver.findElement(By.xpath("//a[@href='/web/login']")).click();
        SeleniumUtils.waitPlease(3);
        driver.findElement(By.xpath("//input[@id='login']")).sendKeys("in_pos_manager8@info.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("KjKtfgrs37", Keys.ENTER);
        SeleniumUtils.waitPlease(3);
        driver.findElement(By.xpath("//a[@href='/web#menu_id=484&action=']")).click();
        SeleniumUtils.waitPlease(3);
        driver.findElement(By.xpath("//a[@href='/web#menu_id=491&action=669']")).click();
        SeleniumUtils.waitPlease(3);
        driver.findElement(By.xpath("//span[.='CarSeat Max']")).click();
        SeleniumUtils.waitPlease(3);
        driver.findElement(By.xpath("//button[@class='btn btn-primary btn-sm o_form_button_edit']")).click();
        SeleniumUtils.waitPlease(3);
        driver.findElement(By.xpath("//input[@id='o_field_input_512']")).clear();
        driver.findElement(By.xpath("//input[@id='o_field_input_512']")).sendKeys("500");
        SeleniumUtils.waitPlease(1);
        driver.findElement(By.xpath("//button[@class='btn btn-primary btn-sm o_form_button_save']")).click();


        SeleniumUtils.waitPlease(3);
        driver.close();

    }

}
