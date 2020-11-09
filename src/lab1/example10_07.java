package lab1;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class example10_07 {
    public static void main(String[] args) {
        /*
         Напишите программу, в которой по возрасту определяется год рождения.
       */

        Calendar calendar = Calendar.getInstance();
        Scanner input_value_year = new Scanner(System.in);
        System.out.println("Год рождения пользователя: " + (calendar.get(Calendar.YEAR) - input_value_year.nextInt()));

    }
}
