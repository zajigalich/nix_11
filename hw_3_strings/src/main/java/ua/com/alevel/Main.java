package ua.com.alevel;

import java.util.Scanner;

import ua.com.alevel.CustomStringTest;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number;
        try {
            do {
                System.out.println("Enter 1 to work with string; 0 - exit");
                number = Integer.parseInt(scanner.nextLine());
                switch (number) {
                    case 1 -> new CustomStringTest().customStringTest();
                    case 0 -> System.exit(0);
                    default -> System.out.println("There is no such choice");
                }
                System.out.println("\n");
            } while (true);
        } catch (NumberFormatException e) {
            System.out.println("Wrong button");
        }
    }
}
