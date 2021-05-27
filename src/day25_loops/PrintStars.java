package day25_loops;

import com.sun.org.apache.xpath.internal.SourceTree;

public class PrintStars {
    public static void main(String[] args) {
        for(int stars = 1; stars<=15; stars++){
            System.out.print("* \uD83C\uDF1F ");
        }
        System.out.println(); //start new line
        String myStars ="";
        for(int stars = 1; stars <= 5; stars++){
            myStars += "*  \uD83C\uDF1F";
        }
        System.out.println("my stars = " + myStars.trim());

        myStars = "";
        for(int i = 1; i <=5; i++){
            myStars += "* ";

        }
        System.out.println("my Stars =" + myStars.trim());
    }
}
