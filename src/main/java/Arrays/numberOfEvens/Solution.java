package main.java.Arrays.numberOfEvens;

// Given an array nums of integers, return how many of them contain an even number of digits.
class Solution {
    public int findNumbers(int[] nums) {
        int numOfEvens = 0;
        for (int num : nums) {
            if (num < 10) {
                continue;
            } else if (num < 100) {
                numOfEvens++;
            } else if (num < 1000) {
                continue;
            } else if (num < 10000) {
                numOfEvens++;
            } else if (num < 100000) {
                continue;
            } else if (num < 1000000) {
                numOfEvens++;
            }
        }
        return numOfEvens;
    }
}
