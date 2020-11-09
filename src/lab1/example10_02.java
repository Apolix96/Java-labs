package lab1;

import java.util.Scanner;

public class example10_02 {
    public static void main(String[] args){
        /*
            Напишите программу, в которой Пользователь вводит имя и возраст.
            Программа отображает сообщение об имени и возрасте пользователя.
        */
        Scanner input_value = new Scanner(System.in);
        System.out.println("\tВведите Имя и возраст через пробел. Пример: Андрей 20");
        String[] user_information = input_value.nextLine().split(" ");
        if(isDigit(user_information[1])){
            System.out.print("Имя пользоватея: " + user_information[0] + "\nВозраст пользователя: " + getCorrectEndingsYears(user_information[1]));
        } else {
            System.out.println("Введены ошибочные данные. Перезапустите программу и повторите попытку.");
        }
    }


    private static boolean isDigit(String value_year) throws NumberFormatException {
        // можно было использовать проверку при вводе, если бы, я использовал ввод для каждой переменной (проверка входов)
        // именно на возраст, мог использовать scanner.hasNextInt()
        try {
            Integer.parseInt(value_year);
        } catch (NumberFormatException e) {
            System.out.println("Введите числовой корректный возраст. =) \nПример: 18, 20, 29, 36. ");
            return false;
        }
        return true;
    }

    private static String getCorrectEndingsYears(String year_user){
        String year_correct = null;

        if (Integer.parseInt(year_user) % 10 > 4 || Integer.parseInt(year_user) == 0 ||
                (Integer.parseInt(year_user) >= 10 && Integer.parseInt(year_user) <= 20)) {
            year_correct = year_user + " лет.";
        } else {
            year_correct = year_user + " год.";
            if(Integer.parseInt(year_user) % 10 != 1) {
                year_correct = year_user + " года.";
            }
        }
        return year_correct;
    }
}
