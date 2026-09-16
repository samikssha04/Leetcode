class solution  {
    public boolean searchElement(int [][] arr, int target){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j]==target){
                    return true;
                }
            }
        }
        return false;
    }
    
}
