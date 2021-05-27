package day41_arraylist;

import java.util.ArrayList;

public class CitiesList {
    public static void main(String[] args) {
        //declare arraylist option + enter
        ArrayList<String> cities = new ArrayList<>();
        //add cities to arraylist -> add methods
        cities.add("Washington DC");// 0 index
        cities.add("New York");//1
        cities.add("Vienna");//2
        cities.add("Adana");//3
        cities.add("LA");//4
        cities.add(0, "Ashgabat");
        //print all values in same line
        System.out.println(cities);
        //print first and last city
        System.out.println("first city = " + cities.get(0));
        System.out.println("last city = " + cities.get(5));
        //find last index using size()-1
        System.out.println(("last city = " + cities.get(cities.size() - 1)));

        //print count of items in arraylist
        System.out.println("count of " + cities.size());

        int size = cities.size();
        System.out.println("There ar " + size + " cities in the line");

        //for loop and print all values in the same line
        for (int i = 0; i < cities.size() / 2; i++) {
            System.out.print(cities.get(i) + " ");

        }
        System.out.println();
        for (String city : cities) {
            System.out.print(city + " ");

            cities.remove(3);
            cities.remove("New York");

            System.out.println("after remove = " + cities);
            cities.clear();

            if (cities.isEmpty()) {
                System.out.println("list is empty");
            }

            if(cities.size()==0);
            System.out.println();

        }
    }
}