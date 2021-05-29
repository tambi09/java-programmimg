package day48_constructors_static;


import java.util.Arrays;

public class CybertekGroups {
    public static void main(String[] args) {
        Group group1 = new Group("Cybertek");
        System.out.println(group1.getMembers().size());
        group1.addMember("Berk");
        group1.addMember("Pavel");
        group1.addMember("Elvin");
        group1.addMember("Ali");
        group1.addMember("Parvin");
        group1.addMember("Rasim");
        group1.addMember("Maria");

        System.out.println(group1.getMembers().size());
        System.out.println(group1.toString());

        Group group2= new Group("CyberCats");
        group2.setMembers((Arrays.asList("Stephan", "Wakshum", "Akrem", "Bulent","Andrea", "Andrey")));
        //print all members. not toString
        System.out.println("group2 members = " + group2.getMembers());

        if(group2.getMembers().contains("Akrem")){
            System.out.println("Akrem is a member of group2");
        }else{
            System.out.println("Akrem is not in a group2");
        }
        group1.removeMember("Pavel");
        group1.removeMember("Parvin");
        System.out.println(group1);




    }
}
