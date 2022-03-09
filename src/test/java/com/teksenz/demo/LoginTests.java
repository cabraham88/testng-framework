package com.teksenz.demo;

import org.testng.Assert;
import org.testng.annotations.Test;
//no main method
public class LoginTests {
    @Test(priority = 1)//prioritizing the method//@Test means this test is marking as test
    public void loginTest(){
        System.out.println("Login test with valid user and password");
        String exp="Hello";
        String act="Hello";
        Assert.assertEquals(act,exp,"The words don't match");

    }
    @Test(priority = 2)
    public void loginWithInvalidUser(){
        System.out.println(" Login test with invalid user");
        Assert.fail("Home test failed");
    }
    @Test(priority = 3,testName = "This is a home page test")//change the test name
    public void homePageTest(){
        System.out.println(" This is a home page test");
        String exp="Homepage";
        String act="Homepage";
        Assert.assertTrue(exp==act,"Home page title is incorrect");

    }
    @Test(priority = 4)
    public void logoutTest(){
        System.out.println("This is a logout test");
    }
}
