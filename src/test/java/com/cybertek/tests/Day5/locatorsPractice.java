package com.cybertek.tests.Day5;

import com.cybertek.utilities.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class locatorsPractice {
    public static void main(String[] args) throws Exception{
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/");
//        WebElement dropDownLink = driver.findElement(By.xpath("/html/body/div/div[2]/div/ul/li[11]/a"));
//        System.out.println(dropDownLink.getText());
//        dropDownLink.click();

        WebElement headerText = driver.findElement(By.xpath("//span[@class='h1y']"));
        WebElement contextMenuLink = driver.findElement(By.xpath("//a[.='Context Menu']"));
        System.out.println(headerText.getText());
        contextMenuLink.click();
        Thread.sleep(2000);
        driver.close();
    }
}
