import java.util.Scanner;

public class Main {
    //    Пользователь вводит число. Если число больше 0, то выполнить следующие операции:
//
//
//    умножить число на 2, если оно нечётное;
//
//    прибавить к числу 5, если если оно заканчивается на 5 или 0.
//    Если число < 0, то взять его по модулю и разделить на 3.
//    Результат вычисления вывести в консоль.
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите число: ");
        double num = scn.nextDouble();
        if (num > 0 && num % 2 != 0) ;
        {
            System.out.println("Умножение на 2 нечетного: " + num * 2);
        }
        if ((num % 10 == 5 || num % 10 == 0) && num > 0) {
            System.out.println("Прибавляем 5: " + (num + 5));
        }
        if (num < 0) {
            System.out.println("Делим на 3 модуль числа: " + Math.abs(num) / 3);
        }


    }
}