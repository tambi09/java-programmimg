package day29_nestedLoop_arrays;

public class CountCharNestLoop {
    public static void main(String[] args) {
        String word = "java";
        for (int outer = 0; outer < word.length(); outer++) {
            System.out.println("outer:" + word.charAt(outer));
            int count = 0;
            for (int inner = 0; inner < word.length(); inner++) {
                if (word.charAt(outer) == word.charAt(inner)) {
                    count++;
                }
            }
            System.out.println(word.charAt(outer) + "=" + count);
        }
    }
}