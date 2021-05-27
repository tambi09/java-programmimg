package HomeWork;


import java.util.Arrays;

public class testJava {
    public static void main(String[] args) {
        String [] days = {"sun","mon","wed","sat"};

int n =0;
        for(int i=0; i < days.length; i++){

            switch (days[i]){
                case "sat":
                case "sun":
                    n -= 1;
                    break;
                case "mon":
                    n++;
                case "wed":
                    n +=2;

            }


                }
        System.out.println(n);

                }


    }







