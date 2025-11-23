import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int[] index = twoSum(nums, 9);
        System.out.println(index[0] + " " + index[1]);
    }
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(map.containsKey(target-nums[i])) return new int[] {i,map.get(target-nums[i])};
            map.put(nums[i], i);
        }
        return new int[] {};

        
        // for(int i = 0; i < nums.length; i++) {
        //     for(int j = i+1; j < nums.length; j++) {
        //         if(nums[i]+nums[j] == target) {
        //             return new int[] {i,j};
        //         }
        //     }
        // }
        // return new int[] {};
    }
}