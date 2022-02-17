package main.java.ua.com.alevel;

import org.apache.commons.lang3.time.DateUtils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Lessons {

    private final int LESSON = 45;
    private final int BREAKE = 5;


    private static int enterNum() {
        int amountOfLessons = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            try {
                System.out.println("Введите номер урока(1-10): ");
                String line = scanner.nextLine();
                amountOfLessons = Integer.parseInt(line);
            } catch (NumberFormatException a) {
                System.out.println();
            }
        } while (amountOfLessons < 1 || amountOfLessons > 10);
        return amountOfLessons;
    }

    private int timeInMinutes (int amountOfLessons){
        return amountOfLessons*LESSON +(amountOfLessons-1)*BREAKE + (amountOfLessons-1)/2*BREAKE*3;
    }
    public void output() {
        Date date = new Date(21600000);
        int timeInMinutes = timeInMinutes(enterNum());
        date = DateUtils.addMinutes(date,timeInMinutes);
        SimpleDateFormat format = new SimpleDateFormat("HH:mm");
        System.out.println("Ending time " + format.format(date));
    }
}
