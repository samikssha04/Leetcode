class solution{
    public int sumOfElements(int [][] arr){
        int sum=0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                sum+=arr[i][j];
            }
        }
        return sum;
    }
}
