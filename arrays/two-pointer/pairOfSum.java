public static void main(String args[]){
    int arr[] = {1, 3, 4, 5, 7, 10, 11};
    int target = 14;
    findPair(arr,target);
    }
static void findPair(int arr[] , int target){
    int left = 0;
    int right = arr.length-1;
    while(left<right){
        int add = arr[left]+arr[right];
        if(add == target){
            System.out.println("the pair is "+left+" , "+right);
            return ;
        }
        else if(add < target){
            left++;
        }
        else{
            right--;
        }
    }
    
}