class solution{
    public double[] averageofeachrow(int [][] arr) {
      
        double[] result = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            result[i] = (double)sum / arr[i].length;
        }
        return result;
    }
}
