package com.company;

public class WrongPasswordException extends Exception{
    private String Password, confirmPassword;
    public String getPassword(){return Password;}
    public String getConfirmPassword(){return confirmPassword;}

    public WrongPasswordException(String message, String pass){

        super(message);
        Password=pass;
    }
}
