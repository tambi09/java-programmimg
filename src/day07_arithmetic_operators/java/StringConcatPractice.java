package day07_arithmetic_operators.java;

public class StringConcatPractice {
    public static void main(String[] args) {
        System.out.println("java"+ 5+3);
        System.out.println("java" + (5 +3));

        System.out.println(5+3+"java");
        System.out.println(5+(3+"java"));
        String str1 = "hello";
        String str2 = "friends";
        System.out.println(str1 + str2);
        //hello friends
        System.out.println( str1 +" "+str2);

        int num1 = 7;
        int num2 =8;
        System.out.println(num1 + num2); //15
        System.out.println(num1 + " " + num2); //7 8
        //78
        System.out.println(num1+""+num2);

        char char1 = 'a';
        char char2 = 'b';
        System.out.println(char1 + char2);

        System.out.println(char1 + "" +char2); //ab

    }
}
