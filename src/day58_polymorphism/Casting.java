package day58_polymorphism;

public class Casting {
    public static void main(String[] args) {


        Worker worker = new SuperMan();
        worker.work("QA Manager");
        worker.getPaid();

        ((Father)worker).raiseKid();
        ((SuperMan)worker).playWithKid();

        SuperMan superMan = (SuperMan) worker;



    }
}