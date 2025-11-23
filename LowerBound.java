public class LowerBound {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,4,4,5,5,6,7,7,7,7,8,9,9};
        int index = lowerBound(arr, 9);
        System.out.println("Lower Bound: "+index);
    }
    public static int lowerBound(int arr[], int target) {
        int low = 0, high = arr.length-1;
        int ans = arr.length;
        while(low<=high) {
            int mid = (low+high)/2;
            if(arr[mid]>=target) {
                ans = mid;
                high = mid-1;
            }
            else low = mid+1;
        }
        return ans;
    }
}
