package day17_ternary_nested_conditions;

public class TernaryExamples {
    public static void main(String[] args) {
        int score = 75;
        String quality = "good";

        String result = (score > 60) ? "pass" : "fail";
        int x = (quality.equals("good")) ? 100 : 0;
        char grade = (score > 90) ? 'A' : 'B';
        String evenOdd = (score % 2 == 0) ? "even" : "odd";
        System.out.println(evenOdd);

        int score3 = 100;
        char grade1 = (score > 90) ? 'A' : 'B';
        //if (score > 90) {
         //   grade = 'A';
       // }else{
           // grade = 'B';

        }
    }

