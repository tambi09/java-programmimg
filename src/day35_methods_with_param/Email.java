package day35_methods_with_param;

public class Email {
    public static void main(String[] args) {
        buildEmail("ritylya09", "gmail");
        buildEmail("nurichka009", "gmail");




    }
    public static void buildEmail(String name, String domain){
        System.out.println(name + "@"+ domain+".com");
    }
}
