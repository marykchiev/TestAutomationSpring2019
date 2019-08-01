package com.cybertek.tests.July9;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//import static com.cybertek.utilities.SeleniumUtils.sleep;

public class July9OfficeHour {
    public static void main(String[] args) {
        test2();
    }
    public static void test2(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");
        //sleep(3);

        WebElement yearBD = driver.findElement(By.name("birthday_year"));
        Select year=new Select(yearBD);
        year.selectByVisibleText("1985");
        //sleep(3);
    }

    public static void test1(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");
        //sleep(3);

        WebElement monthBD=driver.findElement(By.xpath("//select[@aria-label='Month']"));
        Select month = new Select(monthBD);

        month.selectByIndex(5);
        //sleep(3);

        month.selectByValue("11");
       // sleep(3 );

        month.selectByVisibleText("Sep");
       // sleep(3);

        driver.quit();
    }
}
