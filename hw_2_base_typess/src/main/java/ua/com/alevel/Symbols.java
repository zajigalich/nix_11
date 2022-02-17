package ua.com.alevel;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Symbols {

    private String enterString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your not immutable string");
        return scanner.nextLine();
    }

    private static String excludeNumbers(String line) {
        return line.replaceAll("[^A-Za-z]", "");
    }

    private static Map countingCharacters(String line) {
        String lineNotNum = excludeNumbers(line);
        Map<Character, Integer> countingChars = new HashMap<>();
        for (int i = 0; i < lineNotNum.length(); i++) {
            char symbol = lineNotNum.charAt(i);
            countingChars.merge(symbol, 1, Integer::sum);
        }
        return countingChars;
    }

    public void output() {
        Map map = countingCharacters(excludeNumbers(enterString()));
        System.out.println("Sum of numbers in entered string:\n" +
                "result = " + map);
    }
}
