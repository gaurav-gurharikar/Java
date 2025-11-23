public class QuickSort {
    public static void main(String[] args) {
        int arr[] = {2,1,4,5,7,9,6,3};
        quickSort(arr,0,arr.length-1);
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void quickSort(int arr[], int low, int high) {
        if(low<high) {
            int p = partition(arr,low,high);
            quickSort(arr, low, p-1);
            quickSort(arr, p+1, high);
        }
    }
    public static int partition(int arr[], int low, int high) {
        int i=low-1;
        int j=low;
        int pivot=arr[high];
        while(j<high) {
            if(arr[j]<pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            j++;
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i+1;
    }
}
