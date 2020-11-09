package lab1;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class example10_05 {
    public static void main(String[] args) {
        /*
            Напишите программу, в которой по году рождения определяется возраст
            пользователя.
       */
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        Scanner input_year_of_birth = new Scanner(System.in);
        System.out.println("Введите ваш год рождения. Пример: 1984, 1994, 1996, 2000, 2002");
        System.out.println("Возраст пользователя: " + getCorrectEndingsYears(calendar.get(Calendar.YEAR) - input_year_of_birth.nextInt()));

    }

    private static String getCorrectEndingsYears(int year_user){
        String year_correct = null;

        if (year_user % 10 > 4 || year_user == 0 ||
                (year_user >= 10 && year_user <= 20)) {
            year_correct = year_user + " лет.";
        } else {
            year_correct = year_user + " год.";
            if(year_user % 10 != 1) {
                year_correct = year_user + " года.";
            }
        }
        return year_correct;
    }
}
