package lab1;

import javax.sound.midi.SysexMessage;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class example10_06 {
    public static void main(String[] args) {
        /*
            Напишите программу, в которой Пользователь вводит имя и год рождения,
            в программа отображает сообщение содержащее имя пользователя и его
            возраст.
        */

        Calendar calendar = Calendar.getInstance();
        Scanner input_user_information = new Scanner(System.in);

        System.out.println("Введите ваше Имя и ваш год рождения. Пример: Андрей 2000");
        String[] about_user = input_user_information.nextLine().split(" ");
        System.out.println("Имя пользователя: " + about_user[0] +
                "\nВозраст пользователя: " + getCorrectEndingsYears(calendar.get(Calendar.YEAR) - Integer.parseInt(about_user[1])));


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
