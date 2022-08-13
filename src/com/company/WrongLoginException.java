package com.company;

public class WrongLoginException extends Exception {
    private String login;
    public String getLogin(){return login;}
    public WrongLoginException(String message, String log){

        super(message);
        login=log;
    }
}

