package lab1;

import java.util.Arrays;
import java.util.Scanner;

public class example10_01 {
    public static void main(String[] args){
        /*  Напишите программу, в которой Пользователь вводит сначала фамилию,
            затем имя, затем отчество. После ввода программа выводит сообщение «Hallo
            <ФАМИЛИЯ, ИМЯ, ОТЧЕСТВО>»
       */
        Scanner input_value = new Scanner(System.in);
        System.out.println("\tВведите ФИО через пробел. Пример: Евтухов Андрей Дмитриевич");
        String information[] = input_value.nextLine().split(" ");
        System.out.print("Hallo, ");
        Arrays.asList(information).stream().forEach(value -> System.out.print(value + " "));
    }
}
