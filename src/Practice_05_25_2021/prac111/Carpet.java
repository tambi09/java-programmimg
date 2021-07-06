package Practice_05_25_2021.prac111;

public class Carpet {
    /*
    The `Carpet` class has following `public` double instance variables:
 `width, length, unitPrice, totalPrice` and a `public` boolean variable `isPersian` that is `true`
 if carpet object is Persian and `false` if it is not.
     */

    double width;
    double length;
    double unitPrice;
    double totalPrice;


    boolean isPersian;





public Carpet(){
    /**
     *  - sets default values for the Carpet object
     *   > Size is 300 x 300 and totalPrice for that is 200. And also it is not a Persian carpet. unitPrice is set as 0.
     */

    double width = 300.0;
    double length = 300.0;
    double unitPrice = 0.0;
    double totalPrice = 200.0;


    boolean isPersian = false;

}

public Carpet (double width,double length,double unitPrice,boolean isPersian){

    this.width= width;
    this.length = length;
    this.unitPrice = unitPrice;
    this.totalPrice = totalPrice;
    //totalPrice = (width+length)* unitPrice;


    if(!isPersian) {
       this.totalPrice = (width+length)*unitPrice;

    }else{
        this.totalPrice = (width+length)*unitPrice + 200.0;


    }


}
}
