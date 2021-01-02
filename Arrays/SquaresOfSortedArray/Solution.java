
/* Given an integer array nums sorted in non-decreasing order,
return an array of the squares ofeach number sorted in non-decreasing order. */

import java.util.Arrays;

class Solution {
    public int[] sortedSquares(int[] nums) {
        int squaredNum = 0;
        int[] squaredNums = nums;
        for (int i = 0; i < nums.length; i++) {
            int currentNum = nums[i];
            squaredNum = currentNum * currentNum;
            squaredNums[i] = squaredNum;
        }
        Arrays.sort(squaredNums);
        return squaredNums;
    }
}