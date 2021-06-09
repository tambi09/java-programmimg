package day51_inherutance.super_keyword;

public class LyftRides {
    public static void main(String[] args) {
        Lyft lyftRide = new Lyft();
        LyftXL lyftXLRide = new LyftXL();
        LUX luxRide = new LUX();


        System.out.println("lyftRide.calculateRate(5) = " + lyftRide.calculateRate(5));
        System.out.println("lyftXLRide.calculateRate(5) = " + lyftXLRide.calculateRate(5));
        System.out.println("luxRide.calculateRate(5) = " + luxRide.calculateRate(5));
    }
}
