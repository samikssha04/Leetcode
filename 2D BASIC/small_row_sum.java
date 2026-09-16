class soltion {
    public int smallRowSum(int [][] arr){
        int smallsum=Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            int sum=0;
            for(int j=0; j<arr[i].length; j++){
                sum+=arr[i][j];
            }
            if(sum<smallsum){
                smallsum=sum;
            }
        }
        return smallsum;
    }

}