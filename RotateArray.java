public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(nums, k);
        for(int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
    public static void reverse(int[] nums, int low, int high) {
        while(low<high) {
            int temp = nums[low];
            nums[low] = nums[high];
            nums[high] = temp;
            low++;
            high--;
        }
    }
    public static void rotate(int[] nums, int k) {
        k = k%nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);
        // k = k%nums.length;
        // int temp[] = new int[k];
        // int j = 0;
        // for(int i = nums.length-k; i < nums.length; i++) {
        //     temp[j] = nums[i];
        //     j++;
        // }
        // // j=0;
        // // for(int i = nums.length-k-1; i>=0; i--) {
        // //     nums[nums.length-j-1] = nums[i]; 
        // //     j++;
        // // }
        // for(int i = nums.length-k-1; i>=0; i--) {
        //     nums[i+k] = nums[i]; 
        // }
        // for(int i = 0; i < temp.length; i++) {
        //     nums[i] = temp[i];
        // }

        // // for(int i = 0; i < k; i++) {
        // //     int temp = nums[nums.length-1];
        // //     for(int j = nums.length-1; j >= 0; j--) {
        // //         if(j==0) nums[j] = temp;
        // //         else {
        // //             nums[j] = nums[j-1];
        // //         }
        // //     }
        // // }
    }
}
