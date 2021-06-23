package day56_abstraction.drivable;

public class DrivableTest {
    public static void main(String[] args) {

        Tesla model3 = new Tesla();
        model3.hi();
        model3.start();
        model3.transportPeople();
        model3.autoPiloting();
        model3.cost(25);
        model3.stop();
        model3.bye();

        plane plane1 = new plane();
        plane1.start();
        plane1.hi();
        plane1.transportPeople();
        plane1.autoPiloting();
        plane1.cost(250);
        plane1.stop();
        plane1.bye();
        plane1.land();

        SelfDrivable sd = new plane();
        SelfDrivable sd2 = new Tesla();

        Transportation tp = new plane();




    }
}
