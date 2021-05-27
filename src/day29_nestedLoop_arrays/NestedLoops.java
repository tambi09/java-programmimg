package day29_nestedLoop_arrays;

public class NestedLoops {
    public static void main(String[] args) {


        for (int minutes = 1; minutes <= 5; minutes++) {
            System.out.println("minutes = " + minutes);
            for (int seconds = 1; seconds <= 59; seconds++) {
                System.out.print(seconds + " ");
            }
        }

        for (int minutes = 0; minutes <= 4; minutes++) {
            for (int seconds = 0; seconds <= 59; seconds++) {
                System.out.println(minutes + ":" + seconds);
            }
        }
    }
}