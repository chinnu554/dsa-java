class checkPalindrome{
    public static void main(String args[]){
        int arr[] = {1, 2, 3, 4, 5};
        checkPalin(arr);
    }
    public static void checkPalin(int arr[]){
        int left = 0;
        int right = arr.length-1;
        while(left < right){
            if(arr[left] != arr[right]){
                System.out.println("Not Palindrome");
                return ;
            }
            left++;
            right--;
        }
        System.out.println("Palindrome");
    }
}