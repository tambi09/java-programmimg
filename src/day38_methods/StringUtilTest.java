package day38_methods;

import static day38_methods.StringUtils.*;

public class StringUtilTest {
    public static void main(String[] args) {
        String userName = "";
        if(StringUtils.isNullOrEmpty(userName)){
            System.out.println("FAIL: Username cannot be null of empty");
        }
        System.out.println("isPalindrome(civic) = "+ StringUtils.isPalindrome("civic"));
        System.out.println("isPalindrome(kayak) = "+ StringUtils.isPalindrome("kayak"));
        System.out.println("isPalindrome(Cybertek) = "+ StringUtils.isPalindrome("Cybertek"));

        String word = "sunday";
        String revWord = StringUtils.reverse(word);
        System.out.println("word = " +word);
        System.out.println("revWord ="+ revWord);
        System.out.println(StringUtils.reverse(word));

                }
            }




