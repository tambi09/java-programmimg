package day13_conditional_statements;

public class IfWithBooleanVariable {
    public static void main(String[] args){
        boolean isHungry = false;



    if (isHungry){
        System.out.println("I am hungry, I will go get something to eat!");
        System.out.println("Then code java");
    }else{
        System.out.println("I am not hungry, I will keep coding java");
    }

    double price = 130.44;
    boolean isAffordable = price <= 200.0;

        System.out.println("isAffordable = " + isAffordable);
        if(isAffordable){
            System.out.println("I can afford it, lets buy!");
    }else{
            System.out.println("To expensive, lets keep coding java ");
        }

        boolean isRemoteJob = true;
        if(isRemoteJob != false) {
            System.out.println("Sorry, I am not interested");
        }else{
            System.out.println("Sure, I am interested, what is interview process?");

        }


}
}
