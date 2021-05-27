package day32_arrays_split;

public class MallShopping {
    public static void main(String[] args) {
        String [] items = {"Shoes", "Jacket", "Gloves", "Airpods", "Ipad", "iphone 12 case"};
        double [] prices = {99.99,   150.0,      9.99,    250.0,    439.50,   39.99};
        int [] itemIDS = {  12345,   123456,    12347,    12348,     12349,   12350};
        System.out.println("---------- FIND THE INDEX OF 'Gloves' in items array ------");
        int indexOfGloves = -1;
        for(int i = 0; i < items.length; i++){
            if(items[i].equals("Gloves")){
                System.out.println("Gloves found at index " + i);
                break;
            }
        }
        System.out.println("----Set boolean to drive if first 'iPad' is found");
        boolean iPadExists = false;

        System.out.println("iPadExists = " + iPadExists);
        if(iPadExists) {
            System.out.println("We bought Ipad;)");
        }else{
            System.out.println("We don't have iPad");

            for(int i= 0; i < items.length; i++){
                System.out.println(items[i] + " - $ " + prices[i]+ " - #" + itemIDS[i]);
            }
        }
        for(int i =0; i< items.length; i++){
            if(items[i].equalsIgnoreCase("Jacket")){
                System.out.println(items[i] + " - $" + prices[i] + " - #" + itemIDS[i]);
                break;
            }
        }
    }
}
