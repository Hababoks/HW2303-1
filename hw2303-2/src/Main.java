import java.util.Scanner;

public class Main {
//    Пользователь вводит строку.
//    Если строка начинается с цифры (0, 1, 2, 3, 4, 5, 6 , 7, 8, 9), то вывести эту цифру в консоль.
//    Если строка начинается со знака _ или знака -, то вывести в консоль строку без этого знака.
//    Используйте методы startsWith, charAt и substring.
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String str = scn.nextLine();
        if (str.charAt(0)=='0' ||
                str.charAt(0)=='1' ||
                str.charAt(0)=='2' ||
                str.charAt(0)=='3' ||
                str.charAt(0)=='4' ||
                str.charAt(0)=='5' ||
                str.charAt(0)=='6' ||
                str.charAt(0)=='7' ||
                str.charAt(0)=='8' ||
                str.charAt(0)=='9' ) {
            System.out.println(str.charAt(0));
        }
        if (str.startsWith("_") || str.startsWith("-")) {
            System.out.println(str.substring(1));
        }


    }
}