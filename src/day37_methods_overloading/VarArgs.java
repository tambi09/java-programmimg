package day37_methods_overloading;

public class VarArgs {
    public static void main(String[] args) {
        addNumbers(100, 200, 300);
        addNumbers(23,76,67,45,45,76,98,80);

    }


    public static void addNumbers(int... nums){
        int sum = 0;
        for(int n : nums){
            sum+= n;
        }
        System.out.println("sum = " +sum);

    }

}