class moveZero{
    public static void main(String args[]){
        int arr[] = {0, 1, 0, 3, 12};
        lastZero(arr);
        printArr(arr);
    }
    public static void lastZero(int arr[]){
        int i=0;
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=0){
                arr[i] = arr[j];
                i++;
            }
            
        }
        while(i<arr.length){
            arr[i] = 0;
            i++;
        }
        
    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
}