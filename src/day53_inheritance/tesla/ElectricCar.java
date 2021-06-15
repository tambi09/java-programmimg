package day53_inheritance.tesla;

public class ElectricCar {
    private String make;
    private  String model;
    private double price;
    private int year;
    private int range;
    private static int count;//all object wil share this variable
    public static final int MAX_RANGE = 400;

    public ElectricCar(String make, String model, double price, int year, int range) {

        setMake(make);

        count++;
    }
    public final void charge() {
        System.out.println("Charging the Electric car using plug-in");
        this.range = MAX_RANGE;
    }

    public static int getCount(){
        return count;

    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", year=" + year +
                ", range=" + range +
                '}';
    }





    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
        if(make.isEmpty()){
            System.out.println("ERROR: Make connot be blank");
        }else {
            this.make = make;
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }
}


