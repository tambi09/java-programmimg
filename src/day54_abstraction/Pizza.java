package day54_abstraction;

public class Pizza extends MenuItem{


    @Override
    public void prepare() {
        System.out.println("Stretch the dough and put topping and cheese and bake it");
    }

    @Override
    public void serve() {
        System.out.println("Put on plate and serve");

    }
}