package Arrays.numberOfEvens;

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
