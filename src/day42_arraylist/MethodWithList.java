package day42_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodWithList {
    public static void main(String[] args) {
        List<String>words = new ArrayList<>();
        words.add("Java"); words.add("html"); words.add("selenium");
        words.add("a"); words.add("input"); words.add("title");
        //pass the words list to printStrList method
        printStrList(words);

        printStrList(Arrays.asList("select", "options", "br", "python","sql","api"));
    }
    public static void printStrList(List<String> stringList) {
        for(String str: stringList){
            System.out.print(str + " ");

        }
        System.out.println();


    }
    public static  int sumInteger(List<Integer>list) {
        int sum = 0;
      for(int i : list){
          sum += i;

      }
      return sum;
    }
}
