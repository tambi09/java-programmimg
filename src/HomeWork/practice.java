package HomeWork;
import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String s = inp.next();
        person(s);
    }

    public static void person(String info) {
        //your code here
        //The method person has a string argument with this format:
        //"name,last name,age". Print out the person's information
        String[] split = info.split(",");
        System.out.print("person name: " + split[0] + "\nlast name: " + split[1] + "\nage: " + split[2]);

    }
}