package day19_class_vs_object_strings;

import java.util.Locale;

public class StringCaseConversion {
    public static void main(String[] args) {
        String word = "JaVa";
        String sentence = " 123 Java IS Fun!";
        System.out.println(word);
        System.out.println(word.toLowerCase());
        System.out.println("JAVA".toLowerCase());
        System.out.println(sentence.toLowerCase());

        word.toLowerCase();
        System.out.println(word);

        String wordInLcase = word.toLowerCase();
        System.out.println("wordInLCase = " + wordInLcase);
        word = word.toLowerCase();
        System.out.println("word = " + word);

        System.out.println("rita".toUpperCase());
    }
}
