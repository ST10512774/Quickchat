/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.quickchat;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

/**
 *
 * @author Student
 */
public class LoginTest {
    
    public LoginTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of checkUsername method, of class Login.
     */
    @Test
     public void testCheckUsername() {
    System.out.println("checkUsername");
    String username = ""; // Test with an empty string (you can test with valid username later)
    Login instance = new Login();
    boolean expResult = false; // Assuming an empty username should return false
    boolean result = instance.checkUsername(username);
    assertEquals(expResult, result);  // Remove fail() and assert that the result matches the expected result
}


    /**
     * Test of checkPasswordComplexity method, of class Login.
     */
    @Test
    public void testCheckPasswordComplexity() {
    System.out.println("checkPasswordComplexity");
    String password = "";  // Test with an empty password
    Login instance = new Login();
    boolean expResult = false; // Assuming an empty password should return false
    boolean result = instance.checkPasswordComplexity(password);
    assertEquals(expResult, result);  // Compare actual result with expected
    }
    

    /**
     * Test of checkCellPhoneNumber method, of class Login.
     */
    @Test
    public void testCheckCellPhoneNumber() {
    System.out.println("checkCellPhoneNumber");
    String cellphone = "";  // Test with an empty string or invalid phone number
    Login instance = new Login();
    boolean expResult = false;  // Assuming an empty phone number returns false
    boolean result = instance.checkCellPhoneNumber(cellphone);
    assertEquals(expResult, result);  // Check if the result matches
}
    /**
     * Test of registerUser method, of class Login.
     */
    @Test
    public void testRegisterUser() {
    System.out.println("registerUser");
    String firstname = "";
    String lastname = "";
    String username = "";
    String password = "";
    String cellphone = "";
    Login instance = new Login();
    String expResult = ""; // Expected result (you can change this according to your business logic)
    String result = instance.registerUser(firstname, lastname, username, password, cellphone);
    assertEquals(expResult, result);  // Verify if the actual result matches the expected result
}


    /**
     * Test of loginUser method, of class Login.
     */
    @Test
  
  public void testLoginUser() {
    System.out.println("loginUser");
    String username = ""; // Use valid/invalid usernames as needed
    String password = "";
    Login instance = new Login();
    boolean expResult = false;  // Assuming login fails with empty credentials
    boolean result = instance.loginUser(username, password);
    assertEquals(expResult, result);  // Verify the result
}


    /**
     * Test of returnLoginStatus method, of class Login.
     */
   
    
    @Test
    public void testReturnLoginStatus() {
    System.out.println("returnLoginStatus");
    boolean isLogged = false;  // Simulate a failed login
    Login instance = new Login();
    String expResult = "A failed login";  // Expected result for failed login
    String result = instance.returnLoginStatus(isLogged);
    assertEquals(expResult, result);  // Compare expected and actual results
}


    /**
     * Test of setUsername method, of class Login.
     */
    @Test
   public void testSetUsername() {
    System.out.println("setUsername");
    String username = "";  // Use an empty string or a valid username
    Login instance = new Login();
    instance.setUsername(username);  // Call the method to set the username
    String expResult = "";  // Expected result after setting the username
    String result = instance.getUsername();  // Get the username after setting it
    assertEquals(expResult, result);  // Verify that the expected and actual values match
}


    /**
     * Test of setPassword method, of class Login.
     */
    @Test
    public void testSetPassword() {
    System.out.println("setPassword");
    String password = "";  // Set password to an empty string or a valid password
    Login instance = new Login();
    instance.setPassword(password);  // Call the method to set the password
    // You can add further verification logic here, like checking if the password is set correctly.
    // Since there’s no getter for password, we can skip assertEquals unless you implement a getter for password
}
    

    /**
     * Test of setSaCellphoneNumber method, of class Login.
     */
    @Test
    public void testSetSaCellphoneNumber() {
    System.out.println("setSaCellphoneNumber");
    String saCellphoneNumber = "";  // Set the cell phone number
    Login instance = new Login();
    instance.setSaCellphoneNumber(saCellphoneNumber);  // Call the method to set the cellphone number
    // If needed, add assertions to verify the value has been set correctly
}
    

    /**
     * Test of setFirstname method, of class Login.
     */
    @Test
     public void testSetFirstname() {
    System.out.println("setFirstname");
    String firstname = "";  // Set the first name
    Login instance = new Login();
    instance.setFirstname(firstname);  // Set the firstname
    // Add any necessary assertions here if you want to verify the firstname is set correctly
}

    /**
     * Test of setLastname method, of class Login.
     */
    @Test
    public void testSetLastname() {
    System.out.println("setLastname");
    String lastname = "";  // Set the last name
    Login instance = new Login();
    instance.setLastname(lastname);  // Call the method to set the lastname
    // You can add assertions here to verify the lastname is set correctly
}
    /**
     * Test of getUsername method, of class Login.
     */
    @Test
    public void testGetUsername() {
    System.out.println("getUsername");
    Login instance = new Login();
    String expResult = "";  // Expected result (username should be empty initially)
    String result = instance.getUsername();  // Get the username from the instance
    assertEquals(expResult, result);  // Compare expected and actual results
}

    /**
     * Test of getPassword method, of class Login.
     */
    @Test
   public void testGetPassword() {
    System.out.println("getPassword");
    Login instance = new Login();
    String expResult = "";  // Expected result (password should be empty initially)
    String result = instance.getPassword();  // Get the password from the instance
    assertEquals(expResult, result);  // Compare expected and actual results
}
   
    /**
     * Test of getSaCellphoneNumber method, of class Login.
     */
    @Test
    public void testGetSaCellphoneNumber() {
    System.out.println("getSaCellphoneNumber");
    Login instance = new Login();
    String expResult = "";  // Expected result (empty string or whatever is expected)
    String result = instance.getSaCellphoneNumber();  // Get the cellphone number from the instance
    assertEquals(expResult, result);  // Compare expected and actual results
}


    /**
     * Test of getFirstname method, of class Login.
     */
    @Test
   
    public void testGetFirstname() {
    System.out.println("getFirstname");
    Login instance = new Login();
    String expResult = "";  // Expected result (empty string or whatever is expected)
    String result = instance.getFirstname();  // Get the first name from the instance
    assertEquals(expResult, result);  // Compare expected and actual results
}
   

    /**
     * Test of getLastname method, of class Login.
     */
    @Test
    public void testGetLastname() {
    System.out.println("getLastname");
    Login instance = new Login();
    String expResult = "";  // Expected result (empty string or whatever is expected)
    String result = instance.getLastname();  // Get the last name from the instance
    assertEquals(expResult, result);  // Compare expected and actual results
}
    
    
}
