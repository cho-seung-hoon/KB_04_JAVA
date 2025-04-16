package org.scoula.lib;

import java.util.Scanner;

public class Input {
    static Scanner scanner = new Scanner(System.in);

    public String read(String title){
        System.out.print(title);
        return scanner.next();
    }

    public String read(String title, String defaultValue) {
        System.out.print(title + "(" + defaultValue + ")");
        String userInput = scanner.next();
        if(userInput == null){
            return defaultValue;
        }
        return userInput;
    }

    public int readInt(String title) {
        System.out.print(title);
        return scanner.nextInt();
    }

    public boolean confirm(String title, boolean defaultValue) {
        System.out.println("종료할까요? ");
        if(defaultValue) {
            System.out.println("(Y/n): ");
        } else {
            System.out.println("(y/N): ");
        }
        String userInput = scanner.next();
        if(userInput == null){
            return defaultValue;
        }
        if(defaultValue) {
            if(userInput.equalsIgnoreCase("Y")) {
                return true;
            } else {
                return false;
            }
        } else {
            if(userInput.equalsIgnoreCase("N")) {
                return false;
            } else {
                return true;
            }
        }
    }
    public boolean confirm(String title) {
        return confirm(title, false);
    }
}
