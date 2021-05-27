package day14_multy_branch_if_statements;

public class LogicalANDOperator {
    public static void main(String[] args) {
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        System.out.println(10 > 5 && 1==1);
        System.out.println( 5 > 3 && 6 ==9);
        int apples = 10, oranges = 5;
        boolean check = apples > 5 && oranges < 6;
        System.out.println("check =" + check);
    }
}
