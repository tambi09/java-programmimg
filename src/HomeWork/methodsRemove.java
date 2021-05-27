package HomeWork;

import java.util.Scanner;

public class methodsRemove {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(countLetters(in.next()));
    }

    public static String countLetters(String str) {
        String unique = "";
        String result = "";
        String digits = "";
        for (int j = 0; j < str.length(); j++) {
            if (!unique.contains(str.charAt(j) + "")) {
                unique += str.charAt(j);
            }
        }

        for (int i = 0; i < unique.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (unique.charAt(i) == str.charAt(j)) {
                    count++;
                }

            }


            digits += count;
        }


        for (int i = 0; i < unique.length(); i++) {
            result += digits.charAt(i) + "" + unique.charAt(i);
        }
        return result;
    }
}