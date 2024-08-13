package com.nttdata.steps;

import com.nttdata.screens.LoginScreen;

import java.util.Objects;

public class LoginStep {

    LoginScreen loginScreen;

    public void sendUsername(String username) {
        if (!Objects.equals(username, "bod@example.com")) {
            throw new IllegalStateException("Error conocido: El usuario ingresado no es correcto");

        } else {
            loginScreen.writeUser(username);
        }
        try {
            Thread.sleep(1000); // Espera de 1 segundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void sendPassword(String password) {
        if (!Objects.equals(password, "10203040")) {
            throw new IllegalStateException("Error conocido: El password ingresado no es correcto");
        } else {
            loginScreen.writePassword(password);
        }
        try {
            Thread.sleep(1000); // Espera de 1 segundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void Ingresar() {
        loginScreen.clickLogin();
    }

}
