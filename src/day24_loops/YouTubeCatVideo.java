package day24_loops;

public class YouTubeCatVideo {
    public static void main(String[] args) throws InterruptedException {
        int seconds =0;
        System.out.println("lets watch some cats video \uD83D\uDC08");
        while(seconds <=117) {
            System.out.println("Watching YouTube video" + seconds);
            seconds++;

        }
        System.out.println("Finished watching the \uD83D\uDC08 cat video");
        System.out.println("Lets watch another one");
        Thread.sleep(1000);
        }
    }

