package lab1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class example10_09 {
    public static void main(String[] args) {
        /*
            Напишите программу, в которой пользователь вводит число, а программой
            отображается последовательность из четырех чисел: число, на единицу
            меньше введённого, введенное число и число, на единицу больше введенного.
            Четвертое число должно быть квадратом суммы первых трех чисел
        */

        Scanner input_number = new Scanner(System.in);
        System.out.println("Введите значение. Пример: 2, 3, 5, 14, 200 , 10001");
        Integer[] array_value = getResultDecision(input_number.nextInt());
        System.out.print("Результат: ");
        for (Integer val: array_value) {
            System.out.print(val + " ");
        }
    }
    private static Integer[] getResultDecision(Integer value) {
        Integer summer = 0;
        Integer[] array_result = new Integer[]{ value - 1, value, value + 1, 0};
        for (int i = 0; i < array_result.length - 1; i++){
            summer += array_result[i];
        }
        array_result[array_result.length - 1] = (int) Math.pow(summer, 2);
        return array_result;
    }
}
