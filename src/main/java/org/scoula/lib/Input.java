package org.scoula.lib;

import java.util.Scanner;

public class Input {
    private static final Scanner scanner = new Scanner(System.in);

    public static String read(String title) {
        System.out.print(title);
        return scanner.nextLine();
    }

    public static String read(String title, String defaultValue) {
        System.out.print(title + "(" + defaultValue + "): ");
        String input = scanner.nextLine();
        return input.isEmpty() ? defaultValue : input;
    }

    public static int readInt(String title) {
        System.out.print(title);
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("정수를 입력하세요: ");
            }
        }
    }

    public static boolean confirm(String title, boolean defaultValue) {
        String option = defaultValue ? "(Y/n): " : "(y/N): ";
        System.out.print(title + " " + option);
        String input = scanner.nextLine().trim().toLowerCase();

        if (input.isEmpty()) {
            return defaultValue;
        }
        return input.startsWith("y");
    }

    // 5. boolean confirm(String title)
    public static boolean confirm(String title) {
        return confirm(title, true);
    }
}
