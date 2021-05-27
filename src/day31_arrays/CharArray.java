package day31_arrays;

public class CharArray {
    public static void main(String[] args) {
        char[] letters ={'j', 'a', 'v', 'a', ' ', 'i', 's', 'f', 'u', 'n'};
        for( char each :letters){
            System.out.print(each + " ");

        }
        String sentence = new String(letters);
        System.out.println("\nsentence  = " + sentence);

        String item = "wooden spoon";
        char[] itemArray = item.toCharArray();
        System.out.println("itemArray.length = " + itemArray.length);
        System.out.println("item.length()= " + item.length());

        String[] fruits = {"bananas" , "apples" , "kiwi", "mango", "papaya", "strawberry"};
        String fruitSTR = "";
        for(String each : fruits ){
            System.out.println(each + "-");
            fruitSTR += each + "-";

        }
        System.out.println("\nfruitSTR = " + fruitSTR);

        String[] languages = {"java", "python", "c++", "sql", " ruby", "javascript"};
        System.out.println( String.join("|", languages));

    }
}
