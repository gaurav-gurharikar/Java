public class SearchInsertPosition {
    public static void main(String[] args) {
        int nums[] = {1,3,5,6};
        int index = searchInsertPosition(nums, 5);
        System.out.println(index);
    }
    public static int searchInsertPosition(int nums[], int target) {
        int low = 0, high = nums.length-1,mid = -1;
        while(low <= high) {
            mid = (low+high)/2;
            if(nums[mid]==target) return mid;
            else if(target<nums[mid]) high = mid-1;
            else low = mid+1;
        }
        return low;
    }
}
