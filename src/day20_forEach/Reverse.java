package day20_forEach;

import utilities.ArraysUtility;

import java.util.Arrays;

public class Reverse {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18};

        int[] reverse = new int[array.length];

        for (int i = array.length-1, j = 0 ; i >= 0 ; i-- , j++) {

            reverse[j] = array[i];

        }

        System.out.println(Arrays.toString(reverse));

        System.out.println("--------------------------------------------------------------------");

        int[] nums = {100,200,300,400,500};
        nums = ArraysUtility.reverse(nums);

        System.out.println(Arrays.toString(nums));




    }

}
