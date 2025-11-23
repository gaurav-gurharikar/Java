public class BinarySearch {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7,8,9};
        System.out.println(binarySearch(nums, 5));
    }
    public static int binarySearch(int nums[], int target) {
        int low = 0, high = nums.length - 1;
        while(low<=high) {
            int mid = (low+high)/2;
            if(nums[mid]==target) return mid;
            else if(target>nums[mid]) low = mid+1;
            else high = mid-1;
        }
        return -1;
    }
}
