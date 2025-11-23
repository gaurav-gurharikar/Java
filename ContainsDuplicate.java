import java.util.*;
public class ContainsDuplicate {
    public static void main(String[] args) {
        int nums[] = {1,2,3,1};
        System.out.println(containsDuplicate(nums));
    }
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        if(set.size()<nums.length) return true;
        return false;


        // HashMap<Integer, Integer> map = new HashMap<>();
        // for(int i = 0; i < nums.length; i++) {
        //     if(!map.containsKey(nums[i])) {
        //         map.put(nums[i], 1);
        //     }
        //     else {
        //         map.put(nums[i], map.get(nums[i])+1);
        //     }
        // }
        // for(Map.Entry<Integer, Integer> e : map.entrySet()) {
        //     if(e.getValue()>1) return true;
        // }
        // return false;


        // for(int i = 0; i < nums.length; i++) {
        //     for(int j = i+1; j < nums.length; j++) {
        //         if(nums[i] == nums[j]) return true;
        //     }
        // }
        // return false;
    }
}
