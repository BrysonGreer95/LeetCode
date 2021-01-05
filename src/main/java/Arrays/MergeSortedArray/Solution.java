package main.java.Arrays.MergeSortedArray;

import java.util.Arrays;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int loopCounter = 0;
        for (int i = m; i < nums1.length; i++) {
            if (nums1[i] == 0) {
                nums1[i] = nums2[loopCounter];
            }
            loopCounter++;
        }
        Arrays.sort(nums1);
    }
}
