class solution{
    public int maximumRowSum(int [][] arr){
        int maxsum=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            int sum=0;
            for(int j=0; j<arr[i].length; j++){
                sum+=arr[i][j];
            }
            if(sum>maxsum){
                maxsum=sum;
            }
        }
        return maxsum;
    }
}