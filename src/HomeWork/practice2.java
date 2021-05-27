package HomeWork;

import java.util.Scanner;

public class practice2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
    String txt = s.next();
    //your code here
    int word = txt.length()-1;
    String last = txt.substring(0, word);
        System.out.println(last);
}
}