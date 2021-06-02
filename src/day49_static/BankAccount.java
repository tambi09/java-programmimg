package day49_static;

public class BankAccount {


    static double balance = 500;
    String user;


    static void spend(double amount){
        System.out.println(" is spending $"+amount);
        balance -= amount;
    }

    public void showBalance(){
        System.out.println("Current balance =" + balance);
    }

}
