package day29_nestedLoop_arrays;

public class ArrayIntro {
    public static void main(String[] args) {
        int num = 10;// single variable
        int[] nums = new int[3];//array variable
        nums[0] =5;
        nums[1] =10;
        nums[2] = 7;
        System.out.println("value at index 0 = " + nums[0]);//index 0
        System.out.println("value at index 1 = " + nums[1]);
        System.out.println("value at index 2 = " + nums[2]);

        //we can also use int variable to specify index number
        int i = 0;
        System.out.println(nums[i]); //5
        i++;
        System.out.println(nums[i]); //10

        //how to find out the size of the array.
        System.out.println("number of elements = " + nums.length);
        //store length of array into len variable


    }
}
