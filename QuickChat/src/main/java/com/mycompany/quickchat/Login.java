/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quickchat;

/**
 *
 * @author Student
 */
class Login {
     private String username;
    private String password;
    private String saCellphoneNumber;
    private String firstname;
    private String lastname;
    
    // Saved user info for login
    private static String savedUsername = "";
    private static String savedPassword = "";
    private static String savedFirstname = "";
    private static String savedLastname = "";
    
    // ========== CHECK USERNAME ==========
    public boolean checkUsername(String username) {
        if(username.contains("_") && username.length() <= 5){
            return true;
        } else {
            return false;
        }
    }
    
    // ========== CHECK PASSWORD ==========
    public boolean checkPasswordComplexity(String password) {
        boolean hasUpper = false;
        boolean hasNumber = false;
        boolean hasSpecial = false;
        
        if(password.length() < 8){
            return false;
        }
        
        String specialChars = "!@#$%^&*()_+";
        
        for(int i = 0; i < password.length(); i++){
            char c = password.charAt(i);
            if(c >= 'A' && c <= 'Z'){
                hasUpper = true;
            }
            if(c >= '0' && c <= '9'){
                hasNumber = true;
            }
            for(int j = 0; j < specialChars.length(); j++){
                if(c == specialChars.charAt(j)){
                    hasSpecial = true;
                }
            }
        }
        
        return hasUpper && hasNumber && hasSpecial;
    }
    
    // ========== CHECK CELLPHONE ==========
    public boolean checkCellPhoneNumber(String cellphone) {
        if(cellphone.startsWith("+27") && cellphone.length() == 12){
            String number = cellphone.substring(3);
            boolean allDigits = true;
            for(int i = 0; i < number.length(); i++){
                char c = number.charAt(i);
                if(c < '0' || c > '9'){
                    allDigits = false;
                }
            }
            return allDigits;
        }
        return false;
    }
    
    // ========== REGISTER USER ==========
    public String registerUser(String firstname, String lastname, String username, String password, String cellphone) {
        String errorMessages = "";
        
        if(!checkUsername(username)){
            errorMessages = errorMessages + "Username is not correctly formatted; please ensure that your username contains an underscore and is no more than five characters length.\n";
        }
        if(!checkPasswordComplexity(password)){
            errorMessages = errorMessages + "Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number and a special character.\n";
        }
        if(!checkCellPhoneNumber(cellphone)){
            errorMessages = errorMessages + "Cellphone is not correctly formatted or does not contain international code.\n";
        }
        
        if(!errorMessages.isEmpty()){
            return errorMessages;
        }
        
        savedUsername = username;
        savedPassword = password;
        savedFirstname = firstname;
        savedLastname = lastname;
        
        return "Username successfully captured\nPassword successfully captured\nCellphone successfully captured\nWelcome " + firstname + " " + lastname + " it is great to see you.";
    }
    
    // ========== LOGIN USER ==========
    public boolean loginUser(String username, String password) {
        return username.equals(savedUsername) && password.equals(savedPassword);
    }
    
    // ========== RETURN LOGIN STATUS ==========
    public String returnLoginStatus(boolean isLogged) {
        if(isLogged){
            return "Welcome back " + savedFirstname + " " + savedLastname + " it is great to see you again";
        } else {
            return "A failed login";
        }
    }
    
    // ========== GETTERS AND SETTERS ==========
    public void setUsername(String username) {
        this.username = username;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public void setSaCellphoneNumber(String saCellphoneNumber) {
        this.saCellphoneNumber = saCellphoneNumber;
    }
    
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    
    public String getUsername() {
        return username;
    }
    
    public String getPassword() {
        return password;
    }
    
    public String getSaCellphoneNumber() {
        return saCellphoneNumber;
    }
    
    public String getFirstname() {
        return firstname;
    }
    
    public String getLastname() {
        return lastname;
    }
}
