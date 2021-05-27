package day20_string_manipulation;

public class StringContains {
    public static void main(String[] args) {
        String company = "Capital one";
        System.out.println(company.contains("i"));
        System.out.println(company.contains("ital"));
        System.out.println(company.contains("l o"));

        if(company.contains(" ")){
            System.out.println("multiple words with company name");

            String etsyTitle = "Wooden spoon | Etsy";
            if(etsyTitle.contains("I")) {
                System.out.println("Pass - title check passed");
            }else{
                System.out.println("Fail - title check failed");

                String firstName = "Ahmed";
                if(firstName.contains("A") && firstName.contains("e")) {
                    System.out.println("first name hase a and e at the same time");
                }else {
                    System.out.println("a || e not present");
                }

                firstName = "Nadir";
                if(firstName.contains("a") || firstName.contains("i")) {
                    System.out.println("a or i is present");
                }else {
                    System.out.println("nor a or i is present");
                }

                String email = "ritylya09gmail.com";
                if(email.contains("@") && email.endsWith(".com")) {
                    System.out.println("valid email");
                }else{
                    System.out.println("invalid email");

                }
            }
        }
    }
}
