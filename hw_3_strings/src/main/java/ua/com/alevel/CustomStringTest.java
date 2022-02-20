package ua.com.alevel;

import java.util.Scanner;

public class CustomStringTest {

    public void customStringTest() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your string");
        String line = scanner.nextLine();

        System.out.println("Select an operation with string");
        System.out.println("1 - reverse");
        System.out.println("2 - reverse by indexes");
        System.out.println("3 - reverse by substring");
        System.out.println("4 - reverse separately each word");
        System.out.println("5 - reverse separately each word by indexes");

        try {
            int selector = Integer.parseInt(scanner.nextLine());
            switch (selector) {
                case 1 -> System.out.println(ReverseStringUtil.reverseAll(line.trim()));
                case 2 -> {
                    System.out.println("Enter 2 indexes(in any order; counting from 0)");
                    int first = scanner.nextInt();
                    int second = scanner.nextInt();
                    try {
                        System.out.println(ReverseStringUtil.reverseByIndexes(line.trim(), first, second + 1));

                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Wrong indexes");
                    }
                }
                case 3 -> {
                    System.out.println("Enter substring");
                    String substring = scanner.nextLine();
                    System.out.println(ReverseStringUtil.reverseByString(line.trim(), substring));
                }
                case 4 -> System.out.println(ReverseStringUtil.reverseAllWords(line.trim()));
                case 5 -> {
                    System.out.println("Enter 2 indexes(in any order; counting from 0)");
                    int first = scanner.nextInt();
                    int second = scanner.nextInt();
                    try {
                        System.out.println(ReverseStringUtil.reverseWordsByIndexes(line.trim(), first, second + 1));

                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Wrong indexes");
                    }
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("sadly, you`ve called an exception");
        }
    }
}
