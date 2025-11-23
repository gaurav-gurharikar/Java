public class RecursiveInsertionSort {
    public static void main(String[] args) {
        int arr[] = {14,9,15,12,6,8,13};
        recursiveInsertionSort(arr,0);
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void recursiveInsertionSort(int[] arr, int i) {
        if(i==arr.length) return;
        int j = i;
        while(j > 0 && arr[j-1] > arr[j]) {
            int temp = arr[j];
            arr[j] = arr[j-1];
            arr[j-1] = temp;
            j--;
        }
        recursiveInsertionSort(arr, i+1);
    }
}
