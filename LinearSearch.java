public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {5,2,3,7,9,1,8};
        int target = 9;
        System.out.println("Element found at index "+linearSearch(arr, target));
    }
    public static int linearSearch(int[] arr, int target) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == target) return i;
        }
        return -1;
    }
}
