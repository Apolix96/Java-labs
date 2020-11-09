package lab1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class example10_08 {
    public static void main(String[] args) {
        /*
            Напишите программу для вычисления суммы двух чисел. Оба числа
            вводятся пользователем. Для вычисления суммы используйте оператор +
        */
        System.out.println("Введите два числа через Enter. Пример: 2" +
                                                                  "2");
        Scanner input_value = new Scanner(System.in);
        System.out.println("Сумма чисел: " + input_value.nextInt() + input_value.nextInt());
    }
}
