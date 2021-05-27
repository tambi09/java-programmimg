package HomeWork;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PrintNext3 {
    public static void main(String[] args) {
        //Create a method called next3 .
        // This method has an int argument and prints the next 3 numbers after that number.
        // Call the method from main method and pass num to it.

        Scanner inp = new Scanner(System.in);
        System.out.println("enter number");

        int num = inp.nextInt();
        next3(num);
    }
    public static void next3(int num){

        System.out.print("next 3 are:" + "\n "+ (num+1) + " " + (num+2)+ " " + (num+3));
    }


}
