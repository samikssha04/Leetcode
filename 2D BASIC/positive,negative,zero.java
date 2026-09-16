class Solution {
    public int[] countPositiveNegativeZero(int[][] arr) {
        int positive = 0;
        int negative = 0;
        int zero = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > 0) {
                    positive++;
                } 
                else if (arr[i][j] < 0) {
                    negative++;
                } 
                else {
                    zero++;
                }
            }
        }

        return new int[]{positive, negative, zero};
    }
}