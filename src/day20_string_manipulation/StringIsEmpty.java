package day20_string_manipulation;

public class StringIsEmpty {
    public static void main(String[] args) {
        String jobTitle = "";
        System.out.println(jobTitle.isEmpty());
        System.out.println(jobTitle.length());

        if(jobTitle.isEmpty()) {
            System.out.println("JobTitle is missing, please resend");
        }
        if(jobTitle.length() == 0) {
            System.out.println("jobTitle is empty");
        }else {
            System.out.println("job title is not empty");
        }
        System.out.println(jobTitle.equals(""));

        String veggie = "carrots";
        System.out.println(veggie.isEmpty());
        if(!veggie.isEmpty()){
            System.out.println("We have carrots");
        }
        }
    }

