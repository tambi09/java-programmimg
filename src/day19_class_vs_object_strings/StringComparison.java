package day19_class_vs_object_strings;

public class StringComparison {
    public static void main(String[] args) {
        String city = "Chicago";
        System.out.println(city.equals("Chicago"));//true
        System.out.println(city.equals("chicago"));
        System.out.println(city.equals("Chicago "));

        System.out.println(city.equalsIgnoreCase("Chicago"));
        System.out.println(city.equalsIgnoreCase("CHICAGO"));
        System.out.println(city.equalsIgnoreCase("ChiCaGo"));
        System.out.println(city.equalsIgnoreCase("Chiicago"));
        System.out.println(city.equalsIgnoreCase("Chi cago"));

        if(city.equals("CHICAGO")) {
            System.out.println("equals()true");
        }else {
            System.out.println("equals()false");
        }

        if(city.equalsIgnoreCase("CHICAGO")) {
            System.out.println("equaLsIgnoreCase() true");
        }else{
            System.out.println("equaLsIgnoreCase() false");
        }
    }
}
