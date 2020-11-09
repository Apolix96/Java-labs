package lab1;
import java.util.Arrays;
import java.util.Scanner;



public class labaratornaya_1 {
    public static void main(String[] args){

          /*
                ***Задания для самостоятельной работы***
         */

        Scanner input = new Scanner(System.in);

        // можно было упросить и использовать enum
        System.out.print("Задания самостоятельной работы: [");
        String[] returnTheNumbersOfAnIndependentTask = new String[] {
                "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13"
        };
        Arrays.asList(returnTheNumbersOfAnIndependentTask).stream().forEach(value -> System.out.print(value + ", "));
        System.out.println(" ]");



        System.out.println("Enter the number: ");
        while (true){
            switch (input.nextInt()){
                case 1:
                    System.out.println("Напишите программу, в которой Пользователь вводит сначала фамилию,\n" +
                            "затем имя, затем отчество. После ввода программа выводи сообщение 'Hallo' <Фамилия, Имя, Отчество>" +
                            "\n\t Введите Фамилию Имя Отчество (через пробел)");
                    Scanner val1 = new Scanner(System.in);

                    String information[] = val1.nextLine().split(" ");
                    System.out.print("Hallo ");
                    Arrays.asList(information).stream().forEach(value -> System.out.print(value + " "));
                    break;
                case 2:
                    System.out.print("Напишите программу, в которой Пользователь вводит имя и возраст.\n" +
                            "Программа отображает сообщение об имени и возрасте пользователя.");
                    Scanner val2 = new Scanner(System.in);
                    System.out.println("Введите имя и ваш возраст через пробел.");
                    String information_about_user[] = val2.nextLine().split(" ");

                   // System.out.println("Фамилия: " + information_about_user[0] + "\nВозраст: " + getCorrectYearsUser(information_about_user[1]));
                    break;
            }


        }
    }

    /*private static String getCorrectYearsUser(String year_user){
        int year = Integer.parseInt(year_user) % 10;
        String sYears = year_user + " " + ((Integer.parseInt(year_user) >= 10 && Integer.parseInt(year_user) <= 20)?" лет":year == 1? "год":year == 4? "года";
        return sYears;
    }*/
    /*// возвращаем элементы массива (список заданий)
    private static int[] returnTheNumbersOfAnIndependentTask(){
        int[] value = new int[13];
        for(int i = 0; i < value.length; i++){
            value[i] = i + 1;
        }
        return value;
    }*/
}
