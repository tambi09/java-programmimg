package day56_abstraction.greeting;

public class GreetingActions {
    public static void main(String[] args) {
        MountainLanguage m1 = new MountainLanguage();
        m1.hi();
        m1.bye();
        Greeting gt = new MountainLanguage();
        gt.hi();
        gt.bye();
        Japanese jp = new Japanese();
        jp.hi();
        jp.bye();

        gt = new Japanese();
        gt.hi();
        gt.bye();

        }
    }
