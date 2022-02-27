package com.teksenz.demo;

import org.testng.annotations.Test;

public class LoginTests {
    @Test(priority = 1)//prioritizing the method
    public void loginTest(){
        System.out.println("Login test with valid user and password");

    }
    @Test(priority = 2)
    public void loginWithInvalidUser(){
        System.out.println(" Login test with invalid user");
    }
    @Test(priority = 3,testName = "This is a home page test")//change the test name
    public void homePageTest(){
        System.out.println(" This is a home page test");
    }
    @Test(priority = 4)
    public void logoutTest(){
        System.out.println("This is a logout test");
    }
}
