package day47_constructors;

public class Student {

    public Student(){
        System.out.println("No-Args constructor");
    }
    //constractor with 1 param: String name
    public Student(String name){
        System.out.println("name param constructor " + name);
    }

    public Student( int age){
        System.out.println("age param constractor " + age);
    }

    public Student(String name, int age){
        System.out.println("Student name: " +name + " age " + age );
    }

}
