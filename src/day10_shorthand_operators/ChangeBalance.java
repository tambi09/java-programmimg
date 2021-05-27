package day10_shorthand_operators;

public class ChangeBalance {
    public static void main(String[] args) {
        double balance = 1230.55;
        System.out.println("balance = " + balance);

        double baklava = 22.50;
        System.out.println("baklava = " + baklava);
        //decrease balance by baklava price
        balance = balance - baklava;
        System.out.println("balance after baklava = " + balance);

        double kenefe = 44.45;
        System.out.println("kenefe = " + kenefe);
        balance = balance - kenefe;
        System.out.println("balance after kenefe = " + balance);

        //second kenafe is 50% off. lets buy it
        kenefe = kenefe/2;
        System.out.println("kenefe = " + kenefe);
        //buy it and decrease
        balance = balance - kenefe;
        System.out.println("balance after second kenefe = " + balance);

        double plov = 7.99;
        System.out.println("plov = " + plov);
        balance = balance - plov;
        System.out.println("balance after plov = " + balance);

        double tea = 3.00;
        System.out.println("tea = " + tea);
        balance = balance - tea*4;
        System.out.println("balance after tea = " + balance);

        //return baklava
        balance = balance + baklava;
        System.out.println("balance after return baklava = $" + balance);



    }
}
