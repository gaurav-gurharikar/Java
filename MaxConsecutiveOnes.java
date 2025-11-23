public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0, max = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i]==0) {
                count = Math.max(count, max);
                max = 0;
            }
            else max++;
        }
        return Math.max(count, max);


        // Set<Integer> set = new TreeSet<>();
        // int count=0;
        // for(int i=0; i<nums.length; i++) {
        //     if(nums[i]==0) {
        //         set.add(count);
        //         count=0;
        //     }
        //     else count++;
        // }
        // set.add(count);
        // Iterator<Integer> it = set.iterator();
        // int max = 0;
        // while(it.hasNext()) max = it.next();
        // return max;
    }
}
