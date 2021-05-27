package day21_string_manipulations;

public class FirstAndLastTest {
    public static void main(String[] args) {
        String word4 = "MOM";
        char first1 = word4.charAt(0);
        char third2 = word4.charAt(2);
        if (first1 == third2) {
            System.out.println("first and last letter match");
        } else {
            System.out.println("first and last letter mismatch");
        }

        if (word4.charAt(0) == word4.charAt(2)) {
            System.out.println("same letters");
        }
        String word5 = "aziza";
        char firstLetter = word5.charAt(0);
        char secondLetter = word5.charAt(1);


        String friend = "ilhom";
        char firstLetter1 = friend.charAt(0);
        int count = friend.length();
        //count--;
        //char lastLetter = friend.charAt(count-1);
        char lastLetter = friend.charAt(friend.length() - 1);
        System.out.println(firstLetter1);
        System.out.println(lastLetter);

        if (firstLetter1 == lastLetter) {
            System.out.println(friend + "- first and last match");
        } else {
            System.out.println(friend + "- first and last mismatch");
        }
    }
}


