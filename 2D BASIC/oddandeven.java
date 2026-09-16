class solution {
    public int[] oddAndEven(int [][] arr){
        int odd=0;
        int even=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0; j<arr[i].length;j++){
                if(arr[i][j]%2==0){
                    even++;
                }
                else{
                    odd++;
                }
            }
        }
        return new int[]{odd,even};
    }
    
}
