package day31_arrays;
import java.util.*;
public class arrayEquals {
    public static void main(String[] args) {
        int[] nums1 = {4, 5, 2, 10};
        int[] nums2 = {4, 5, 2, 10};
        int[] nums3 = {10, 4, 5, 2};
        int[] nums4 = {4, 5, 2, 10, 90};
        int[] nums5 = {54, 23, 54, 123, 54};

        String[] cars1 = {"Toyota","Honda", "Tesla","BMW", "Dodge"};
        String[] cars2 = {"Toyota","Honda", "Tesla","BMW", "Dodge"};
        String[] cars3 = {"toyota","honda", "tesla","bmw", "dodge"};
        String[] cars4 = {"Toyota","Honda", "Tesla"};

        System.out.println("num1 == num2-" + Arrays.equals(nums1, nums2) );
        System.out.println(nums1 == nums2);

        if(Arrays.equals(nums1, nums2)) {
            System.out.println("nums1 and nums2 match ");
        }else{
            System.out.println("nums1 and nums2 mis-match");
        }

        System.out.println("cars1 == cars2 --> " + Arrays.equals(cars1,cars2));
        System.out.println("cars2 == cars3 --> " + Arrays.equals(cars2,cars3));
    }
}
