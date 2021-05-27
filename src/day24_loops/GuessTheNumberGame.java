package day24_loops;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGame {
    public static void main(String[] args) {
        Random randomNum = new Random();
        Scanner scan = new Scanner(System.in);
        int secretNumber = scan.nextInt();
        int guessNumber = 0;
        do {
            System.out.println("Guess the secret number");
            guessNumber = scan.nextInt();
            if (guessNumber > secretNumber) {
                System.out.println("Wrong, your number is too large");
            }else if (guessNumber < secretNumber) {
                        System.out.println("Wrong, your number is too small");

            }
            } while (guessNumber != secretNumber ) ;
            System.out.println("Congratulations, you won! secret number:" + guessNumber);


        }
    }
