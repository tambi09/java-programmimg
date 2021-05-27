package day37_methods_overloading;

public class WarmUpMethod {
    public static void main(String[] args) {
        loginVoid("Cybertekstudent", "abc123");//Positive test
        loginVoid("cybertek", "answer"); //negative test/ rainy day
        loginVoid("","");
        System.out.println(login("cybertekStudent", "abc123"));

    }

    public static void loginVoid(String userName, String password) {
        String secretUserName = "cybertekStudent";
        String secretPassword = "abc123";

        if (userName.equalsIgnoreCase(secretUserName) && password.equals(secretPassword)) {
            System.out.println("Login successful,welcome Cybertek Student");
        } else {
            System.out.println("Incorrect username or password");
        }
    }

    public static boolean login(String userName, String password) {
        String secretUserName = "cybertekStudent";
        String secretPassword = "abc123";

        if (userName.equalsIgnoreCase(secretUserName) && password.equals(secretPassword)) {
            return true;
        } else {

            return false;


        }
    }

}


