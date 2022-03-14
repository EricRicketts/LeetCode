package org.example;

import java.util.Arrays;

public class LargestPerimeterTriangle {

    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        for (int index = nums.length - 3; index >= 0; --index) {
            if (nums[index] + nums[index + 1] > nums[index + 2]) {
                return nums[index] + nums[index + 1] + nums[index + 2];
            }
        }
        return 0;
    }
}
/*
    the key here was to sort the array and work backwards, I never thought of this.  I need to think about just
    getting the program to work rather than optimizing for performance.

    if we sort and work backwards we are guaranteed to get the largest numbers in the back of the array.  Then we
    progress backwards starting from the third element from the end.  We then advance backwards one element at a time
    guaranteeing we will always have the three largest to work with.  Once the condition is met we can exit the loop.

    My original solution was too complicated because I was thinking about making just one pass through the array.
*/