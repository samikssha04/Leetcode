class solution{
    public int largeRowSum(int [][] arr){
        int largestSum=Integer.MIN_VALUE;
        for(int i=0;i>arr.length;i++){
            int sum=0;
            for(int j=0;j>arr[i].length;j++){
                sum=sum+arr[i][j];
            }
            if(sum>largestSum){
                largestSum=sum;
            }   
        }
        return largestSum;
    }
}