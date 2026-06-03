class reverseArray{
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5};
        printArr(arr);
        System.out.println();
        reverse(arr);
        printArr(arr);
    }
    public static void reverse(int arr[]){
        int left = 0;
        int right = arr.length-1;
        while(left < right){
            int temp = arr[right];
            arr[right] = arr[left];
            arr[left] = temp;
            left++;
            right--;
        }
    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
}