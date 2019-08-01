package com.cybertek.tests.Day14_properties_singleton_driver_test_base;

import com.cybertek.utilities.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ConfigurationReaderTests {

    @Test
    public void test1(){
     String expected = "chrome";
     String actual = ConfigurationReader.getProperty("browser");
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void test2(){
      String expectedUserName = "storemanager" ;
      String actualUserName = ConfigurationReader.getProperty("username");
      Assert.assertEquals(expectedUserName,actualUserName);
    }

    @Test
    public void tests3(){
        String expectedPassword = "UserUser123";
        String actualPassword = ConfigurationReader.getProperty("password");
        Assert.assertEquals(expectedPassword,actualPassword);
    }
}
