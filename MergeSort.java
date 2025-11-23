public class MergeSort {
    //static int temp[];
    public static void main(String[] args) {
        int arr[] = {5,7,2,9,1,4,3,6,8};
        //temp = new int[arr.length];
        mergeSort(arr, 0, arr.length-1);
        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void mergeSort(int[] arr, int low, int high) {
        if(low >= high) return;
        int mid = (low+high)/2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);
        merge(arr, low, mid, high);
    }
    public static void merge(int[] arr, int low, int mid, int high) {
        int temp[] = new int[high-low+1];
        int i = low;
        int j = mid+1;
        int k = 0; //int k = low;
        while(i<=mid && j<= high) {
            if(arr[i] <= arr[j]) {
                temp[k] = arr[i];
                i++;
            }
            else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i<=mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }
        while(j<=high) {
            temp[k] = arr[j];
            j++;
            k++;
        }
        for(i=0, j=low; i<temp.length; i++,j++) {
            arr[j] = temp[i];
        }
    }
}
