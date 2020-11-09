package lab2;

import java.util.Scanner;

public class example10_01 {
    public static void main(String[] args) {
        /*
            Напишите программу, которая проверяет, делится ли введенное
            Пользователем число на 3.
        */
        Scanner input_value = new Scanner(System.in);
        Integer value = input_value.nextInt();
        try {
            Integer x = isValid(value);
            System.out.println(x);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public static Integer isValid(Integer value) throws Exception {
            if (value % 3 == 0) {
                System.out.println("Делится");
                return 1;
            } else {
                throw new Exception("Не делится");
            }
    }
}
