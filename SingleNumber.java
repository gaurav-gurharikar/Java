import java.util.*;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {1,2,4,1,2};
        System.out.println(singleNumber(nums));
    }
    public static int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            if(map.containsKey(nums[i])) map.put(nums[i], map.get(nums[i])+1);
            else map.put(nums[i], 1);
        }
        for(Map.Entry<Integer, Integer> e : map.entrySet()) {
            if(e.getValue() == 1) return e.getKey();
        }
        return 0;


        // for(int i=0; i<nums.length; i++) {
        //     int count = 0;
        //     for(int j=0; j<nums.length; j++) {
        //         if(nums[i]==nums[j]) count++;
        //     }
        //     if(count==1) return nums[i];
        // }
        // return 0;
    }
}
