package day17_ternary_nested_conditions;

public class AmazonPrimeShopping {
    public static void main(String[] args) {

        double price =195;
        boolean isPrimeMember = false;

        if(isPrimeMember) {
            System.out.println("Eligible for free shipping");
        }else{
            if(price>= 25.0) {
                System.out.println("Eligible for free regular shipping");
            }else{
                System.out.println("Not eligible for free shipping. Fee = $10");

            }
        }




    }
}
