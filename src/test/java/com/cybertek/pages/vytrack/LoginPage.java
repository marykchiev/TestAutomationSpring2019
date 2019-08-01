package com.cybertek.pages.vytrack;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;

public class LoginPage {

    String userNameLocator = "pretendedInput";
    String passwordLocator = "pretendedInput2";
    String loginButtonLocator = "_submit";


    public void login(String userName, String password){
        Driver.getDriver().findElement(By.id(userNameLocator)).sendKeys(userName);
        Driver.getDriver().findElement(By.id(passwordLocator)).sendKeys(password);
        Driver.getDriver().findElement(By.id(loginButtonLocator)).click();
    }
}
