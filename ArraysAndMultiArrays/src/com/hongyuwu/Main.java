package com.hongyuwu;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Arrays
	    int [] numbers = new int [5];
	    numbers[0] = 1;
	    numbers[1] = 2;
        System.out.println(Arrays.toString(numbers));

        int [] nums = { 5, 2, 3, 1, 4 };
        Arrays.sort(nums);
        System.out.println(nums.length);
        System.out.println(Arrays.toString(nums));

        // Multidimensional Arrays
        int [][] numbers2 = new int [2][3];
        numbers2[0][0] = 1;
        System.out.println(Arrays.deepToString(numbers2));

        int [][] nums2 = { {1, 2, 3}, {1, 2, 3} };
        System.out.println(Arrays.deepToString(nums2));
    }
}
