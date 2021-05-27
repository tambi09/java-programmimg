package day36_methods_with_return;

public class Calculator {
    public static void main(String[] args) {
        System.out.println(add(65, 43));
        System.out.println(subtract(45,21));
        System.out.println(multiply(3,8));
        System.out.println(devide(12,3));

    }

    public static double add(double num1, double num2) {
        double sum = num1 + num2;
        return sum;


    }

    public static double subtract(double num1, double num2) {
        double sum = num1 - num2;
        return sum;
    }

    public static double multiply(double num1, double num2) {
        double sum = num1 * num2;
        return sum;

    }
    public static double devide(double num1, double num2){
        double sum= num1/num2;
        return sum;
    }
}
