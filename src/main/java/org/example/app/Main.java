package org.example.app;

import static org.example.app.PasswordGenerator.generatePassword;

public class Main {
    public static void main(String[] args) {
        int passwordLength = 10;
        String generatedPassword = generatePassword(passwordLength);
        System.out.println("Згенерований пароль: " + generatedPassword);
    }
}
