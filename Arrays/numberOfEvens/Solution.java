package Arrays.numberOfEvens;

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