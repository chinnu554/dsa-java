class maximumWater {
    public static void main(String args[]) {
        int arr[] = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        mothamNeelu(arr);
    }

    public static void mothamNeelu(int arr[]) {
        int left = 0;
        int right = arr.length - 1;
        int maxWater = 0;

        while (left < right) {
            int width = right - left; 
            int height = Math.min(arr[left], arr[right]); 
            int currentWater = width * height;

            if (currentWater > maxWater) {
                maxWater = currentWater;
            }

            if (arr[left] < arr[right]) {
                left++;
            } else {
                right--;
            }
        }
        System.out.println("The maximum water is " + maxWater);
    }
}
