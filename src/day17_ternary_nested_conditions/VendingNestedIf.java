package day17_ternary_nested_conditions;

public class VendingNestedIf {
    public static void main(String[] args) {
        String selection = "snack";
        String drinkItem = "tea";
        String snackItem = "chips";


        if (selection.equals("drink")) {
            System.out.println("drink item is selected");
            if (drinkItem.equals("tea")) {
                System.out.println("tea item is selected");
            } else {
                System.out.println("coke item is selected");


            }
        }else if(selection.equals("snack")){
            System.out.println("snack option is available");
            if (snackItem.equals("chips")) {
                System.out.println("chips options is available");
            }else{
                System.out.println("candy option is selected");
            }

        }

    }
}
