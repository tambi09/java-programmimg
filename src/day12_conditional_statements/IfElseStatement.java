package day12_conditional_statements;

public class IfElseStatement {
    public static void main(String[] args) {
        if (10 > 5){
            System.out.println("CONDITION IS TRUE");
        }else {
            System.out.println("CONDITION IS FALSE");
        }

        int count = 25;
        //check if count is more than 30. if yes,print "count is more than 30
        //otherwise print "count is less than 30"
        if (count >30) { //false
            System.out.println("count is more than 30");
        }else {
            System.out.println("Count is less than 30");
        }

        byte age = 14;
        if (age >= 18) {
            System.out.println("Eligible to vote ");
        }else{
            System.out.println("Not Eligible to vote ");
            System.out.println("Age is less than 18");
        }
    }
}
