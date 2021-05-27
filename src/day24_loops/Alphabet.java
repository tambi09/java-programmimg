package day24_loops;

public class Alphabet {
    public static void main(String[] args) {
        char letter = 'A';
       // System.out.println("letter = " + letter);;
       // letter++;
        while(letter <= 'Z'){
            System.out.println("Letter = " + letter);
            letter++;

        }
        letter = 'Z';
        while(letter >= 'A'){
            System.out.print(letter + " ");
            --letter;
        }


    }
}
