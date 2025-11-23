public class MoveZeroes {
    public static void main(String[] args) {
        int nums[] = {0,1,3,0,12};
        moveZeroes(nums);
        for(int i = 0; i < nums.length; i++) System.out.println(nums[i]);
    }
    public static void moveZeroes(int nums[]) {
        int k = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i]!=0) {
                int temp = nums[i];
                nums[i] = nums[k];
                nums[k] = temp;
                k++;
            }
        }
    }
}
