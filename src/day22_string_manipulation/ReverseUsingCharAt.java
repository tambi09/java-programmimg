package day22_string_manipulation;
import java.lang.*;
public class ReverseUsingCharAt {
    public static void main(String[] args) {
        String word ="anna";
        System.out.println(word.charAt(3));
        System.out.println(word.charAt(2));
        System.out.println(word.charAt(1));
        System.out.println(word.charAt(0));
        System.out.println(word);
        System.out.println("" +word.charAt(3) + word.charAt(2) + word.charAt(1)
                              +word.charAt(0));
        String word2 = "" +word.charAt(3) + word.charAt(2) + word.charAt(1)
                +word.charAt(0);
        System.out.println("word = " + word);
        System.out.println("word2 = "+ word2);

        if(word.equalsIgnoreCase(word2)) {
            System.out.println("Palindrome word");
        }else{
            System.out.println("not palindrome word");
        }
    }
}
