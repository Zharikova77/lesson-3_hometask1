package HomeTaskLesson3;

import java.util.Scanner;

/**
 * Написать программу, вычисляющую корни квадратного уравнения
 * вида ax ² + bx + c = 0, где a, b и c - вводимые пользователем из консоли
 * данные.
 *     Учитывать только реальные корни (в случае отрицательного
 * дискриминанта выводить сообщение пользователю).
 *     При решении создать и использовать следующие вынесенные
 * функции:
 *     - функция isPositive, определяющая, является ли число
 * положительным
 *     - функция isZero, определяющая, является ли число нулём
 *     - функция discriminant, вычисляющая дискриминант
 */


public class hometask2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert meaning for a: ");
        double a = scanner.nextDouble();
        System.out.println("Insert meaning for b: ");
        double b = scanner.nextDouble();
        System.out.println("Insert meaning for c: ");
        double c = scanner.nextDouble();
        System.out.println("The equetion is: " + a + "x*x + " + b + "x + " + c + " = " + "0");

        String root1 = isZero(a, b, c);
        System.out.println(root1);

    }

    public static double discriminant (double a, double b, double c) {
        double dnt = b*b - 4 * a * c;
        return dnt;

    }

    public static String isZero (double a, double b, double c) {
        double dnt = discriminant(a,b,c);
        double dntRoot = Math.sqrt(dnt);
        double x1 = (-b + dntRoot) / (2 * a);
        String roots = isPositive(a,b,c);
        if (dnt == 0) {
            return "The root is: " + x1;
        } else {
            return roots;
        }

    }

     public static String isPositive (double a, double b, double c) {
        double dnt = discriminant(a,b,c);
        double dntRoot = Math.sqrt(dnt);
        double x1 = (-b + dntRoot)/(2*a);
        double x2 = (-b - dntRoot)/(2*a);
        if (dnt > 0) {
             return "The roots are: " + x1 + ", " + x2;
        } else {
            return "Invalid discriminant";
        }
    }




    }





