import java.util.Random;
import java.util.Scanner;

// Пользователь вводит два числа.
// Если они не равны, то вывести в консоль их сумму, иначе вывести их произведение.
// Используйте тернарный оператор.
public class Main {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Введите два числа: ");
        int num1 = scr.nextInt();
        int num2 = scr.nextInt();
        if (num1 != num2) {
            System.out.println(num1 + num2);
        } else {
            System.out.println(num1 * num2);
        }
//        С помощью Random сгенерируйте три числа.
//        Напишите программу, которая находит максимальное из них.
//        Используйте тернарные операторы
        Random ran = new Random();
        int n1 = ran.nextInt();
        int n2 = ran.nextInt();
        int n3 = ran.nextInt();
        System.out.println(" n1 " + n1 + " n2 " + n2 + " n3 " + n3);
        if (n1 >= n2 && n1 >= n3) {
            System.out.println(n1);
        }
        if (n2 >= n1 && n2 >= n3) {
            System.out.println(n2);
        }
        if (n3 >= n2 && n3 >= n1) {
            System.out.println(n3);
        }


    }
}

