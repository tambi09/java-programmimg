package day28_loops;

import java.util.Random;

public class RandomPassword {
    public static void main(String[] args) {
        Random random = new Random();
        String source = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrtuvwxyz0123456789_!@#$%^&";
        String password = "";

        for(int i = 1; i <=8; i++){
            int index = random.nextInt(71);
            System.out.print(source.charAt(index));
            //System.out.println(random.nextInt(source.length()));
            password += source.charAt(index);

        }
        System.out.println("\n your password = " + password );


    }
}
