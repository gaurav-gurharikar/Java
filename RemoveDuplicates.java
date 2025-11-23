public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = {1,1,2,3,4,4};
        int k = removeDuplicates(nums);
        int[] expectedNums = {1,2,3,4};
        assert k == expectedNums.length;
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
        }
        for (int i = 0; i < k; i++) {
            System.out.println(nums[i]);;
        }
    }
    public static int removeDuplicates(int[] nums) {
        int k = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[k]!=nums[i]) {
                k++;
                nums[k]=nums[i];
            }
        }
        return k+1;
    }
}
