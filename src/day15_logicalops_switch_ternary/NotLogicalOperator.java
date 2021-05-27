package day15_logicalops_switch_ternary;

public class NotLogicalOperator {
    public static void main(String[] args) {
        System.out.println("!true = " + ( !true));
        System.out.println("!false = " + (!false));

        int age = 2;
        if (!(age > 7)) {
            System.out.println(" Need to sit in child care seat.age = " + age);
        }else{
            System.out.println(" Can sit normal seat. age = "+ age);

        }

        boolean isSmokingAllowed = true;
        if(!(isSmokingAllowed)) {
            System.out.println("Smoking is prohibited. Exit");
        }else {
            System.out.println("This area is for smoking");
        }

        String env = "qa";
        if(!env.equals("qa")) {
            System.out.println("In wrong enviroment for QA testing");
        }

        String carModel = "Tesla";
        if(!carModel.equals("Tesla")) {
            System.out.println("Not interested, thank you");
        }

        String secretPassword = "abc123";
        String inputPaswword = "abc321";

        if(!secretPassword.equals("abc123")) {
            System.out.println("Incorrect password");
        }

        if(!inputPaswword.equals(secretPassword)) {
            System.out.println("Incorrect password");
        }

        if(inputPaswword.equals(("abc123"))) {
            System.out.println("Correct password ");
        }else {
            System.out.println("Incorrect password");
        }
    }
}
