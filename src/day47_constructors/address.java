package day47_constructors;

public class address {
    private String city;
    private String state;
    private String zipCode;
    private String country = "USA";
    private String street;

    public address(){
        System.out.println("Address constructor");
        street = "Unknown street";
        city = "Unknown";
        state ="Unknown";
        zipCode = "Unknown";



    }
    public address(String street, String city, String state, String zipCode){

        this.street = street;
        this.city =city;
        this.state = state;
        this.zipCode = zipCode;
    }



    public String toString(){
        return street + ", " + city+ ", " + state + " " + zipCode;

    }


    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }






}
