package day47_constructors;

import sun.jvm.hotspot.debugger.Address;

public class AddressList {
    public static void main(String[] args) {
       address cybertekAddress = new address();
       cybertekAddress.setStreet("7925 Jones Branch Dr Suite 3300 ");
       cybertekAddress.setCity("McLean");
       cybertekAddress.setState("VA");
       cybertekAddress.setZipCode("22182");

        System.out.println("cybertekAddress = " + cybertekAddress);

        cybertekAddress.setStreet("7925 Jones Branch Dr Suite 3200");
        System.out.println("Address after update= " + cybertekAddress);
        System.out.println("street info = " + cybertekAddress.getStreet());

        address newAddress = new address();
        newAddress.setStreet("7921 Jones branch");
        newAddress.setCity("McLean");
        newAddress.setState("VA");
        newAddress.setZipCode("22102");

        System.out.println(newAddress.toString());

        address  papaJon = new address("8501 Tyco Rd Ste 1A", "Vienna", "VA", "22182");
        System.out.println("papaJon = " + papaJon);

       
       }
    }

