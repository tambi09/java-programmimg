package day51_inherutance;

public class EmployeeObjects {

    public static void main(String[] args) {
        Employee developer = new Employee();
        developer.jobTitle = "Java Developer";
        System.out.println("developer.calculateSalary(55.0) = " + developer.calculateSalary(55.0));
        double annualDevSalary = developer.calculateSalary(55);
        System.out.println("annualDevSalary = " + Math.round(annualDevSalary));

        
        Contractors sdetContractor = new Contractors();
        sdetContractor.jobTitle = "SDET";

        sdetContractor.calculateSalary(65);
        double sdetSalary = sdetContractor.calculateSalary(55.0);
        System.out.println("sdetSalary = " + sdetSalary);
        System.out.println(developer.toString());
        System.out.println(sdetContractor);





    }
}
