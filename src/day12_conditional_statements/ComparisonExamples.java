package day12_conditional_statements;

public class ComparisonExamples {
    public static void main(String[] args) {
        int speedLimit = 55;
        int currentSpeed = 4_5;
        System.out.println(currentSpeed > speedLimit);
        System.out.println(speedLimit < currentSpeed);

        boolean isSpeeding = currentSpeed > speedLimit;
        System.out.println("Are you speeding? - " + isSpeeding);
        System.out.println("Current Speed =" + currentSpeed + "mph");
        System.out.println("Speed Limit =" + speedLimit + "mph" );

        double accountBalance = 250.25;
        double itemPrice = 200.99;
        System.out.println("Can I afford? - " + (accountBalance -= itemPrice ) );
        
        boolean canAfford = accountBalance <= itemPrice;
        System.out.println("canAfford = " + canAfford);

        boolean isBroke = accountBalance <= 0;
        System.out.println("Am I Broke = " + isBroke);





    }
}
