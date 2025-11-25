public class RearrangeArrayElementsBySign {
    public static void main(String[] args) {
        int[] nums = {3,1,-2,-5,2,-4};
        int[] rearranged = rearrangeArray(nums);
        for(int element:rearranged) System.out.println(element);
    }
    public static int[] rearrangeArray(int[] nums) {
        int[] rearranged = new int[nums.length];
        int posIndex=0, negIndex=1;
        for(int i=0; i<nums.length; i++) {
            if(nums[i]>0) {
                rearranged[posIndex] = nums[i];
                posIndex+=2;
            }
            else {
                rearranged[negIndex] = nums[i];
                negIndex+=2;
            }
        }
        return rearranged;
    }
    // public static int[] rearrangeArray(int[] nums) {
    //     int[] rearranged = new int[nums.length];
    //     int k=0;
    //     for(int i=0; i<nums.length; i++) {
    //         if(nums[i]>0) {
    //             rearranged[k] = nums[i];
    //             k+=2;
    //         }
    //     }
    //     k=1;
    //     for(int i=0; i<nums.length; i++) {
    //         if(nums[i]<0) {
    //             rearranged[k] = nums[i];
    //             k+=2;
    //         }
    //     }
    //     return rearranged;
    // }
}
