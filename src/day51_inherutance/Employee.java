package day51_inherutance;

public class Employee {

    String jobTitle;


    public double calculateSalary(double HourlyRate){
        return 52*40* HourlyRate * 1.1;
    }

    @Override
    public String toString(){
        return "Employee{" +
                "jobTitle='" + jobTitle + '\''+
                '}';
    }

}
