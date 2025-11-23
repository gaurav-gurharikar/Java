public class CheckSortedAndRotated {
    public static void main(String[] args) {
        int nums[] = {3,4,5,1,2};
        System.out.println(checkSortedAndRotated(nums));
    }
    public static boolean checkSortedAndRotated(int nums[]) {
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i]<=nums[(i+1)%nums.length]) {}
            else count++;
        }
        if(count>1) return false;
        else return true;
    }
}