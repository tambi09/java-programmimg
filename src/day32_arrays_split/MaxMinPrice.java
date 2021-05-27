package day32_arrays_split;

public class MaxMinPrice {
    public static void main(String[] args) {
        String [] items = {"Shoes", "Jacket", "Gloves", "Airpods", "Ipad", "iphone 11 case"};
        double [] prices = {99.99,    150.0,   9.99,      250.0,   439.50,   39.99};
        int [] itemIDS = {  12345,      123456,  12347,     12348,     12349,   12350};
        double maxPrice= 0;
        int indexOfMaxPrice = 0;
        for(int i =0; i< prices.length; i++){
            if(prices[i]> maxPrice ){
                maxPrice= prices[i];
                indexOfMaxPrice =i;


            }
        }
        System.out.println("The most expensive item is " +items[indexOfMaxPrice] + " - $ " +prices[indexOfMaxPrice] +" - #" + itemIDS[indexOfMaxPrice]);
    }
}
