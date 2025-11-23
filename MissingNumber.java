public class MissingNumber {
    public static void main(String[] args) {
        int[] nums= {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(nums));
    }
    public static int missingNumber(int[] nums) {
        int arraySum = 0, totalSum = 0;
        for(int i = 0; i < nums.length; i++) arraySum+=nums[i];
        for(int i = 0; i <= nums.length; i++) totalSum+=i;
        return totalSum-arraySum;


        // int[] hash = new int[nums.length+1];
        // for(int i = 0; i < nums.length; i++) {
        //     hash[nums[i]] += 1; 
        // }
        // for(int i = 0; i < hash.length; i++) {
        //     if(hash[i]==0) return i; 
        // }
        // return 0;

        // Arrays.sort(nums);
        // for(int i = 0; i < nums.length; i++) {
        //     if(nums[i] != i) return i;
        // }
        // return nums.length;
    }
}
