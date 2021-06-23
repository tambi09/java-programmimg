package day55_abstraction.exerscise_example;

public abstract class Exercise {
    public static void start(){
        System.out.println("Warming up and starting exercise");
    }
    public abstract void perform();

    public abstract int getCaloriesCount(int minutes);


}
