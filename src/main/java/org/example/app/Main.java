package org.example.app;

import java.util.Scanner;

import static org.example.app.PasswordGenerator.generatePassword;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Ведіть довжину пароля: ");
            int passwordLength = scanner.nextInt();
            String generatedPassword = generatePassword(passwordLength);
            System.out.println("Згенерований пароль: " + generatedPassword);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Невідома помилка: " + e.getMessage());
        }
    }
}
