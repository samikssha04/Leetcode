class solution{
    public int[] evenNumbersInRow(int[][] arr) {
        int[] evenCount = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] % 2 == 0) {
                    count++;
                }
            }
            evenCount[i] = count;
        }
        return evenCount;
    }
}