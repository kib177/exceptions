package com.company;

public class Main {

    public static void main(String[] args) {
    VvodDate vvod = new VvodDate();
    vvod.vvod();

     try {
         String password = LoginPassword.checkPassword(vvod.getPassword());
     } catch (WrongPasswordException e) {
         System.out.println(e.getMessage());;
     }

        try{
            String login= LoginPassword.checklogin(vvod.getLogin());
            System.out.println(login);
        }
        catch(WrongLoginException ex){
            System.out.println(ex.getMessage());
        }

        try{
            String equalsPass= LoginPassword.equalsPassword(vvod.getPassword(),vvod.getConfirmPassword());

        } catch (WrongPasswordException e) {
            System.out.println(e.getMessage());
        }
    }
}

