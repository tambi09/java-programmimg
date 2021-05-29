package day48_constructors_static;

import java.util.ArrayList;
import java.util.List;

public class CustomerObjects {
    public static void main(String[] args) {
        Customer cs1 = new Customer();
        System.out.println(cs1.toString());// print with default value
        cs1.setId(1);
        cs1.setName("Bob");
        System.out.println(cs1);

        Customer cs2 = new Customer("Mike", 2 );
        Customer cs3 = new Customer("John Ward III", 4873);
        System.out.println(cs2);
        System.out.println(cs3);

        //array of Customers
        Customer[] todaysCustomers = {cs1, cs2, cs3, new Customer("Bashir", 449)};

        //arrayList of Customer objects
        List<Customer> custumerList = new ArrayList<>();
        custumerList.add(cs1);
        custumerList.add(cs2);
        custumerList.add(cs3);
        custumerList.add(new Customer("Bashir", 449));
        custumerList.add(new Customer("Suleyman",9763));

        //Print info of first customer object in array and arrayList.
        System.out.println(todaysCustomers[0].toString());
        System.out.println(custumerList.get(0).toString());

        System.out.println();

        System.out.println(custumerList);//print toString() info of all customer objects

        System.out.println();
        System.out.println("--------FOR LOOP----------");

        for (int i =0; i < custumerList.size(); i++){
            System.out.println(custumerList.get(i));
        }
        System.out.println();

        System.out.println("------FOR EACH LOOP-------");

        for(Customer eachCustomer : custumerList){
            System.out.println(eachCustomer);

        }

        //print only customers names
        System.out.println();
        System.out.println("------NAMES OF CUSTOMERS---------");
        custumerList.forEach(each -> System.out.println(each.getName()));//lambda expression

        for(Customer eachCustomer : custumerList){
            System.out.println(eachCustomer.getName());
        }


    }
}
