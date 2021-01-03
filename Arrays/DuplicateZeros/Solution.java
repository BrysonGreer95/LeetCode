// This isn't right yet, but it's my work in progress, and I wanted to make at least 1 commit today.

class Solution {
    public void duplicateZeros(int[] arr) {
        for ( int originalNumber : arr ) {
            if ( originalNumber == 0 ) {
                for (int i = arr[originalNumber]; i < (arr.length-1); i++ ) {
                    arr[i+1] = arr[i];
                    //arr[originalNumber+1] = 0;
                }
            }
        }
    }
}