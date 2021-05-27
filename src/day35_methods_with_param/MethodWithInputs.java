package day35_methods_with_param;

public class MethodWithInputs {
    public static void main(String[] args) {
        displayValue(25);
        displayValue(95);
        int count = 55;
        displayValue(count);
        printName("Rita");
        greetByName("Murodil");
    }
    public static void displayValue(int num){
        System.out.println("value is " + num);
    }
    public static void printName(String name){
        System.out.println("Print name " + name);
    }
    public static void greetByName(String name){
        System.out.println("Hello "+ name+ ", how are you today?");

    }
}
