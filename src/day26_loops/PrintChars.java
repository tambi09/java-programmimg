package day26_loops;

public class PrintChars {
    public static void main(String[] args) {
        String word = "I will become SDET this year";
        for(int i = 0; i < word.length(); i++){
            System.out.println(i + " - " +word.charAt(i));

            word = "automation";
            for(int n=word.length()-1; n >=0;n--){
                System.out.print(word.charAt(n));
            }
        }
    }
}
