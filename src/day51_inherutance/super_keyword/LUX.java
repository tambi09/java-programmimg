package day51_inherutance.super_keyword;

public class LUX extends Lyft {

    @Override
    public double calculateRate(double miles){
        //calculateRate of Lyft _ plus 20 percent
        return super.calculateRate(miles) * 1.2;

    }
}
