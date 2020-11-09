package lab1;

import java.util.Scanner;

public class example10_13 {
    public static void main(String[] args) {
        Scanner input_value = new Scanner(System.in);

        System.out.print("Введите первое значения: ");
        Integer first_value = input_value.nextInt();

        System.out.print("Введите первое значения: ");
        Integer second_value = input_value.nextInt();

        isPow(first_value, second_value);
    }

    private static void isPow(Integer value1, Integer value2) {
        System.out.println("Результат встроенного метода (возведение в степень a^b): " + (int) Math.pow(value1, value2));
    }
}
