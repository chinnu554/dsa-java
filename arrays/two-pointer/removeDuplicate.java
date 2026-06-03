class removeDuplicate{
    public static void main(String args[]){
        int arr[] = {1,1,2,3,3,4,4,5};
        int result =  eraseDuplicate(arr);
        for(int i=0;i<result;i++){
            System.out.print(arr[i]+" ");
        }

    }
    public static int eraseDuplicate(int arr[]){
        int i = 0;
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=arr[i]){
                i++;
                arr[i] = arr[j];
            }
        }
        return i+1;
    }
}