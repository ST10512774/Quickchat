/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.quickchat;


import org.junit.Test;
import org.junit.Assert;
 

public class Mytest {
    
    
    Login login = new Login();
    
    // ========== USERNAME TESTS ==========
    @Test
    public void testCheckUserNameCorrect() {
        Assert.assertEquals(true, login.checkUsername("kyl_1"));
    }
    
    @Test
    public void testCheckUserNameIncorrect() {
        Assert.assertEquals(false, login.checkUsername("kyle!!!!!"));
    }
    
    // ========== PASSWORD TESTS ==========
    @Test
    public void testCheckPasswordComplexityCorrect() {
        Assert.assertEquals(true, login.checkPasswordComplexity("Ch&&sec@ke99!"));
    }
    
    @Test
    public void testCheckPasswordComplexityIncorrect() {
        Assert.assertEquals(false, login.checkPasswordComplexity("password"));
    }
    
    // ========== CELLPHONE TESTS ==========
    @Test
    public void testCheckCellPhoneNumberCorrect() {
        Assert.assertEquals(true, login.checkCellPhoneNumber("+27838968976"));
    }
    
    @Test
    public void testCheckCellPhoneNumberIncorrect() {
        Assert.assertEquals(false, login.checkCellPhoneNumber("08966553"));
    }
    
    // ========== REGISTER TEST avec kim_2 ==========
    @Test
    public void testRegisterUser() {
        String result = login.registerUser("Kim", "Smith", "kim_2", "Kim@2024Sec99!", "+27721234567");
        Assert.assertEquals(true, result.contains("Welcome"));
    }
    
    // ========== LOGIN TESTS avec kim_2 ==========
    @Test
    public void testLoginUserCorrect() {
        login.registerUser("Kim", "Smith", "kim_2", "Kim@2024Sec99!", "+27721234567");
        Assert.assertEquals(true, login.loginUser("kim_2", "Kim@2024Sec99!"));
    }
    
    @Test
    public void testLoginUserIncorrect() {
        login.registerUser("Kim", "Smith", "kim_2", "Kim@2024Sec99!", "+27721234567");
        Assert.assertEquals(false, login.loginUser("wrong", "wrong"));
    }
    
    // ========== LOGIN STATUS TESTS avec kim_2 ==========
    @Test
    public void testReturnLoginStatusSuccess() {
        login.registerUser("Kim", "Smith", "kim_2", "Kim@2024Sec99!", "+27721234567");
        String result = login.returnLoginStatus(true);
        Assert.assertEquals(true, result.contains("Welcome"));
    }
    
    @Test
    public void testReturnLoginStatusFailed() {
        String output = login.returnLoginStatus(false);
        Assert.assertEquals(true, output.contains("failed"));
    }
}
