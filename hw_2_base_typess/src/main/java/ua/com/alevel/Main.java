package ua.com.alevel;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InputMismatchException {
        programInterface();
    }

    private static void programInterface() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 to execute the program or 0 to exit");
        String enterProgram = scanner.nextLine();
        switch (enterProgram){
            case "0" -> System.exit(0);
            case "1" -> {
                System.out.println("you forgot word conservative");
                logic();
            }
        }
    }

    private static void logic()  {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of task(1-3)");
        String executor = scanner.nextLine();
        switch (executor) {
            case "1" -> {
                Numbers numb = new Numbers();
                numb.output();
                programInterface();
            }
            case "2" -> {
                Symbols symbol = new Symbols();
                symbol.output();
                programInterface();
            }
            case "3" -> {
                Lessons lessons = new Lessons();
                lessons.output();
            }
            default -> {
                System.out.println("Wrong button/if teaching is your benefactor");
                logic();
            }
        }
    }
}

