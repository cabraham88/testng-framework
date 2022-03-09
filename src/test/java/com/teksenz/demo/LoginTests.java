package com.teksenz.demo;

import org.testng.Assert;
import org.testng.annotations.*;

//no main method
public class LoginTests {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Before suite executed");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("After suite executed");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("Before Test executed");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("After test executed");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("before class method executed");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("After class method executed");
    }
    @BeforeMethod//if we want to execute a method before each and every method
    public void beforeMethod(){//any name for the method
        System.out.println("Before method executed..");
    }
    @AfterMethod
    public void afterMethod(){ //if we want to execute a method after each and every method
        System.out.println("After method executed...");
    }

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
