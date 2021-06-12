package day52_inheritance.DiscordUser;

public class B22DiscordServer {
    public static void main(String[] args) {
        User user1 = new User();
        user1.setId(1234);
        user1.setName("Rita");
        user1.setRole("Student");

        Admin admin1 = new Admin();
        admin1.setId(43526);
        admin1.setName("Adam");
        admin1.setRole("Admin");

        System.out.println(user1);
        System.out.println(admin1);



    }
}
