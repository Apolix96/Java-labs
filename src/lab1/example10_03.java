package lab1;

import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class example10_03 {
    public static void main(String[] args){
        /*
            Напишите программу, в которой Пользователь последовательно вводит
            название текущего дня недели, название месяца и дату (номер дня в месяце).
            Программа выводит сообщение о сегодняшней дате (день недели, дата, месяц)
        */

        Scanner input_value = new Scanner(System.in);
        System.out.println("Введите текущий день недели, название месяца, дату. Пример: суббота ноябрь 07");
        String[] date_input_user = input_value.nextLine().split(" ");

        // тестовый вариант.
        /*String month = date_input_user[1];
        String number_per_month = date_input_user[2];
        date_input_user[1] = number_per_month;
        date_input_user[2] = month;*/

        Arrays.asList(replaceData(date_input_user)).stream().forEach(value -> System.out.print(value + " "));

    }

    private static String[] replaceData(String[] array_date){
        String value_search = array_date[1];
        for(int i = 1; i <= array_date.length; i++) {
            String temp = array_date[i];
            array_date[i] = array_date[i + 1];
            array_date[i + 1] = temp;
            break;
        }
        return array_date;
    }
}
