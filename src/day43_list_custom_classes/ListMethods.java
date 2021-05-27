package day43_list_custom_classes;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ListMethods {
    public static void main(String[] args) {
        System.out.println(getDays());
        System.out.println("getDays().get()= "+ getDays().size());
        System.out.println("getDays().get(0)= "+ getDays().size());
        List<String> dayNames = getDays();
        System.out.println("dayNames" + dayNames);
        dayNames.add("java day");

        dayNames.removeIf(d -> d.length() ==6);
        System.out.println("dayNames after removeIf = " + dayNames);
        System.out.println(getRandomList(10));

    }



    public static List<String> getDays(){
     List<String> days = new ArrayList<>(Arrays.asList("Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday"));
     days.add("Monday");days.add("Tuesday");days.add("Wednesday");days.add("Thursday");days.add("Friday");days.add("Saturday");days.add("Sunday");
     return days;
    }

    public static  List<Integer> getRandomList(int size){
        Random random = new Random(); // new random object with 0-100 limit
        List<Integer> nums = new ArrayList<>();
        for(int i=0; i<= size;i++) {
            nums.add(random.nextInt(101)); // generate random number and to list
        }
        return nums;

        }


    }

