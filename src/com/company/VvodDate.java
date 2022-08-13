package com.company;

import java.util.*;

public class VvodDate {
    Scanner in;
    private String login, Password, confirmPassword;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public VvodDate() {
    }

    public void vvod(){
        in = new Scanner(System.in);

        System.out.print("Введите логин: ");
        login = in.nextLine();

        System.out.print("Введите пароль: ");
        Password = in.nextLine();

        System.out.print("Подтвердите пароль: ");
        confirmPassword = in.nextLine();
    }
}
