package day33_arrays;

public class SplitReview {
    public static void main(String[] args) {
        String word = "java";
        String[] array = word.split("a");
        System.out.println(array.length);
        int countOfA = array.length-1;
        System.out.println(array.length);

    }
}
