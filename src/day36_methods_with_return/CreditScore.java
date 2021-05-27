package day36_methods_with_return;

public class CreditScore {
    public static void main(String[] args) {
        checkEligible(650);
        checkEligible(800);
        checkEligible(500);
        System.out.println(getCreditScore());
        System.out.println("CreditScore = " +getCreditScore());
        int score = getCreditScore();
        System.out.println("score = " + score);


    }

    public static void checkEligible(int creditScore){
        if(creditScore >= 700){
            System.out.println("you are eligible for leasing the car");
        }else{
            System.out.println("Sorry!You are not eligible for leasing this car");

        }

    }
    public static int getCreditScore(){
        return 800;
    }

}
