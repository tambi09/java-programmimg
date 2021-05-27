package day09_scanner_practice;
import java.util.Scanner;
public class SpeedCheck {
    public static void main(String[] args) {
        int speedLimit = 55;
        int currentSpeed = 75;
        int overTheLimit = currentSpeed - speedLimit;
        System.out.println("Over the limit = " + overTheLimit);

    }
}
