package lab1;

import java.util.Scanner;

public class example10_04 {

    public static void main(String[] args) {
        /*  Напишите программу, в которой пользователю предлагается ввести
            название месяца и количество дней в этом месяце. Программа выводит
            сообщение о том, что соответствующий месяц содержит указанное количество
            дней
       */

        Scanner input_value = new Scanner(System.in);
        System.out.println("\t\tВведите название месяца и количество дней в этом месяце.\n\tПример: январь 20 ");
        String[] date_information = input_value.nextLine().split(" ");
        for (Month value_enum : Month.values()) {
            if (value_enum.toString().toLowerCase().equals(date_information[0])) {
                toSwitchEnumCase(value_enum, Integer.parseInt(date_information[1]));
                return;
            }

        }

    }

    enum Month {
        ЯНВАРЬ, ФЕВРАЛЬ, МАРТ, АПРЕЛЬ, МАЙ, ИЮНЬ, ИЮЛЬ, АВГУСТ, СЕНТЯБРЬ, ОКТЯБРЬ, НОЯБРЬ, ДЕКАБРЬ
    }
    private static void toSwitchEnumCase(Month value_enum, int days_in_month) {
        switch (value_enum){
            case ЯНВАРЬ: System.out.println((days_in_month > 0 && days_in_month <= 31)?"Январь содержит данное количество дней":"Январь не содержит данное количество дней");
            break;
            case ФЕВРАЛЬ: System.out.println((days_in_month > 0 && days_in_month <= 29)? "Февраль содержит данное количество": "Февраль не содержит данное количество дней");
            break;
            case МАРТ: System.out.println((days_in_month > 0 && days_in_month <= 31)?"Март содержит данное количество": "Март не содержит данное количество дней");
            break;
            case АПРЕЛЬ: System.out.println((days_in_month > 0 && days_in_month <= 30)?"Апрель содержит данное количество": "Апрель не содержит данное количество дней");
            break;
            case МАЙ: System.out.println((days_in_month > 0 && days_in_month <= 31)?"Май содержит данное количество": "Май не содержит данное количество дней");
            break;
            case ИЮНЬ: System.out.println((days_in_month > 0 && days_in_month <= 30)?"Июнь содержит данное количество": "Июнь не содержит данное количество дней");
            break;
            case ИЮЛЬ: System.out.println((days_in_month > 0 && days_in_month <= 31)?"Июль содержит данное количество": "Июль не содержит данное количество дней");
            break;
            case АВГУСТ: System.out.println((days_in_month > 0 && days_in_month <= 31)?"Август содержит данное количество": "Август не содержит данное количество дней");
            break;
            case СЕНТЯБРЬ: System.out.println((days_in_month > 0 && days_in_month <= 30)?"Сентябрь содержит данное количество": "Сентябрь не содержит данное количество дней");
            break;
            case ОКТЯБРЬ: System.out.println((days_in_month > 0 && days_in_month <= 31)?"Октябрь содержит данное количество": "Октябрь не содержит данное количество дней");
            break;
            case НОЯБРЬ: System.out.println((days_in_month > 0 && days_in_month <= 30)?"Ноябрь содержит данное количество": "Ноябрь не содержит данное количество дней");
            break;
            case ДЕКАБРЬ: System.out.println((days_in_month > 0 && days_in_month <= 31)?"Декабрь содержит данное количество": "Декабрь не содержит данное количество дней");
            break;
        }
    }
}
