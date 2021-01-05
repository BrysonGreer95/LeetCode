package main.java.Arrays.numberOfEvens;

// Given an array nums of integers, return how many of them contain an even number of digits.
class Solution2 {
    public int findNumbers(int[] nums) {
        int numOfEvens = 0;
        for (int num : nums) {
            int loopCounter = 0;
            while (num >= 10) {
                loopCounter++;
                num = num / 10;
            }
            ;
            if (loopCounter != 0 && loopCounter % 2 != 0) {
                numOfEvens++;
            }
        }
        return numOfEvens;
    }
}
