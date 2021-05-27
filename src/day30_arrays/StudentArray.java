package day30_arrays;

public class StudentArray {
    public static void main(String[] args) {
        String[] student1 = new String[5];
        student1[0] = "1234";
        student1[1] = "Rita";
        student1[2] = "Balova";
        student1[3] = "B22";
        student1[4] = "201-926-6867";

        String[] student2 = {"MK4421", "Mike", "Bloomberg", "B22", "703-876-9889"};
        System.out.println("student id = " + student1[0]);
        System.out.println("student1 = " + student1[1]);
        System.out.println("student1 = " + student1[2]);
        System.out.println("student1 = " + student1[3]);
        System.out.println("student1 = " + student1[4]);

        System.out.println("student data length: " + student1.length);


        if (student1.length == 5) {
            System.out.println("PASS: data array has correct length");
        }else{
            System.out.println("FAIL: data array has incorrect length");
        }
        if(student1.length== student2.length) {
            System.out.println("PASS: data arrays length match");
        }else{
            System.out.println("FAIL: data arrays length not matching");

            System.out.println(student1[1].toUpperCase()+ " " + student1[2].toUpperCase());

        }
    }
}