package ua.com.alevel;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        int number;
        try {
            do {
                System.out.println("Chose task(1-3; 0 - exit)");
                number = Integer.parseInt(scanner.nextLine());
                switch (number) {
                    case 1 -> new Numbers().output();
                    case 2 -> new Symbols().output();
                    case 3 -> new Lessons().output();
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

