package HomeTaskLesson3;


import java.util.Scanner;

/**
 * Имеются три числа - день, месяц и год, вводимые пользователем с
 * консоли.
 *     Вывести дату следующего дня в формате День.Месяц.Год.
 *     Учесть переход на следующий месяц, а также следующий год.
 *     Форматирование строки День.Месяц.Год вынести в отдельную
 * функцию.
 */

public class hometask1 {

    public static void main(String[] args) {

// январь, март, май, июль, август, октябрь, декабрь = 31
// февраль = 28 (невисокос), 29 (високос)
// апрель, июнь, сентябрь, ноябрь = 30

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert the day please: ");
        int day = scanner.nextInt();
        System.out.println("Insert the month please: ");
        int month = scanner.nextInt();
        System.out.println("Insert the year please: ");
        int year = scanner.nextInt();
        int a = 1;
        int nextDay = day + 1;
        int nextMonth = month + 1;
        int nextYear = year + 1;
        String followingDate = nextDate(day, month, year, nextDay, nextMonth, nextYear, a);

        if ((day==28 && month==2 && ((year % 400 !=0 && year % 4 !=0) || year % 100 ==0))
                || (day==30 && (month==4 || month==6 || month==9 || month==11))) {
            System.out.printf(followingDate, a, nextMonth, year);
        } else if (day == 31 && month == 12) {
            System.out.printf(followingDate, a, a, nextYear);
        } else if (day < 1 || day > 31 || month < 1 || month > 12) {
            System.out.println("Invalid date");
        } else {
            System.out.printf(followingDate, nextDay, month, year);
        }


    }

    public static String nextDate (int a, int b, int c, int d, int nextB, int nextC, int nextD) {
        return "%d.%d.%d";

    }



}
