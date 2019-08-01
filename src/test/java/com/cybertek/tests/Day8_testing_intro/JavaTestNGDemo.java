package com.cybertek.tests.Day8_testing_intro;

import org.testng.Assert;
import org.testng.annotations.Test;

public class JavaTestNGDemo {

    @Test
    public void test1(){
        String a="A";
        String b="A";
        Assert.assertEquals(a,b);
    }
    @Test
    public void test2(){
        String str1="apple";
        String str2="orange";
        Assert.assertEquals(str1,str2);
    }

    @Test
    public void test3(){
        String str3="apples";
        String str4="es";
        Assert.assertTrue(str3.contains(str4));
    }
}
