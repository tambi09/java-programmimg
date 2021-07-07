package day60_exeptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyBlock {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Enter a number:");
            int num = scan.nextInt();
            System.out.println("you entered " + num);
            System.exit(0);
        } catch (InputMismatchException e) {
            System.out.println("You entered Invalid value!");

        } finally {
            scan.close();
            System.out.println("Finally block- runs always");


        }
    }}




