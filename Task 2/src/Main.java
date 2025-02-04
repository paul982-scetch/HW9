import java.util.Scanner;

public class Main {
    public static int a ;
    public static void main(String[] args) {
        inputnum();
        rezult();
        //Написать программу, в которой пользователь вводит целое число.
        //Если число четное, то печатаем true, если не четное, печатаем false
        //В методе main НЕ ДОПУСТИМО написание какого либо кода, кроме вызова методов.
        //Методы и их логику продумайте сами
    }

    private static void rezult() {
        if (a % 2 == 0){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }

    private static int inputnum() {
        System.out.println("Введите число");
        return a = new Scanner(System.in).nextInt();

    }
}
