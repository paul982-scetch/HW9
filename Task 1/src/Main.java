import java.util.Scanner;

public class Main {
    static double a = 0;
    static double b = 0;

    public static void main(String[] args) {
        //todo Вам нужно дополнить методы так, чтобы получился рабочий калькулятор

        a = inputDouble();
        b = inputDouble();
        operation();
    }


    public static void operation() {
        String op ;
        System.out.println("Введите действие");
        op = new Scanner(System.in).nextLine();
        if(op.equals ("+")){
            sum();
        }
        if(op.equals("-")){
            diff();
        }
        if(op.equals("*")){
            multiply();
        }
        if(op.equals("/")){
            divide();
        }
    }

    public static void divide() {
        System.out.println(a / b);
        //todo дописать логику и печать результата
    }

    public static void diff() {
        System.out.println(a - b);
        //todo дописать логику и печать результата
    }

    public static void multiply() {
        System.out.println(a * b);
        //todo дописать логику и печать результата
    }

    public static void sum() {
        System.out.println(a + b);
        //todo дописать логику и печать результата
    }

    public static double inputDouble() {
        double x ;
        System.out.println("Введите число ");
        x = new Scanner(System.in).nextDouble();
        //todo дописать логику
        return x ;
    }
}
