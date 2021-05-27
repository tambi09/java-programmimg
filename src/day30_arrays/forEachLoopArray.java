package day30_arrays;

public class forEachLoopArray {
    public static void main(String[] args) {
        int[] data = {32, 87, 98, 7, 9876, 973, 728, 7279,};
        for(int eachNum : data){
            System.out.println(eachNum);
        }
        for(int n : data){
            System.out.println(n+ " ");
        }
        System.out.println("-----------FOR LOOP-----------");
        for(int i =0; i < data.length; i++){
            System.out.println(data[i]);
        }
        System.out.println("last value: " + data[data.length - 1]);

        for(int idx = data.length -1; idx>=0; idx--){
            System.out.println(data[idx] + " ");
        }
    }
}
