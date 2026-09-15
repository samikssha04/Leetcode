class solution{
    public void printColumnWise(int [][ ] arr){
        for(int j=0; j<arr[0].length; j++){
            for (int i=0;i<arr.length; i++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}