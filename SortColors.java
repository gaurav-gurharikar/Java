public class SortColors {
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        sortColors(nums);
        for(int num:nums) System.out.println(num);
    }
    public static void sortColors(int[] nums) {
        int count0=0, count1=0, count2=0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i]==0) count0++;
            else if(nums[i]==1) count1++;
            else count2++;
        }
        int k = 0;
        while(count0>0) {
            nums[k] = 0;
            k++;
            count0--;
        }
        while (count1>0) {
            nums[k] = 1;
            k++;
            count1--;
        }
        while (count2>0) {
            nums[k] = 2;
            k++;
            count2--;
        }

        // int k=0;
        // for(int i=0; i<3; i++) {
        //     for(int j=0; j<nums.length; j++) {
        //         if(nums[j] == i) {
        //             int temp = nums[j];
        //             nums[j] = nums[k];
        //             nums[k] = temp;
        //             k++;
        //         }
        //     }
        // }
    }
}
