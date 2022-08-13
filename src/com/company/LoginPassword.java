package com.company;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class LoginPassword {

    public static String checklogin( String login) throws WrongLoginException {

        if (login.length() > 5) throw new WrongLoginException("Длина логина превышена ", login);
        return login;
    }

    @Contract("_-> param1")
    public static @NotNull String checkPassword(@NotNull String Password) throws WrongPasswordException {
        if (Password.length() > 5) throw new WrongPasswordException("Длина пароля превышена ", Password);
        {
            return Password;
        }
    }

    @Contract("_, _ -> param2")
    public static String equalsPassword (@NotNull String Password, String confirmPassword) throws WrongPasswordException{
            if (Password.equals(confirmPassword)) throw new WrongPasswordException("Пароли не совпадают", confirmPassword);
            {
                return confirmPassword;
            }
        }

    }

