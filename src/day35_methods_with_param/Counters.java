package day35_methods_with_param;

public class Counters {
    public static void main(String[] args) {
        count(5);
        count(8);
        int num = 999;
        count(num);

        String word = "wooden spoon";
        count(word.length());
        BirthYear(1986);


    }
    public static void count(int num){
        for (int i =0; i <= num; i++){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void BirthYear(int year){
        int age = 2021- year;
        System.out.println("Birth date:" + year + "Age:"+ age);
    }
}
