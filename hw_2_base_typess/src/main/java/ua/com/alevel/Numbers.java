package ua.com.alevel;

import java.util.Scanner;

public class Numbers {

    private String enterString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your not immutable string");
        return scanner.nextLine();
    }

    private char[] stringCharArray(String line) {
        return line.replaceAll("\\D", "").toCharArray();
    }

    private int SumFinder(char[] numb) {
        int sum = 0;
        for (int i = 0; i < numb.length ; i++) {
            sum += Character.getNumericValue(numb[i]);

        }
        return sum;
    }

    public void output() {
        int result = SumFinder(stringCharArray(enterString()));
        System.out.println("Sum of numbers in entered string:\n" +
                + result);
    }
}
