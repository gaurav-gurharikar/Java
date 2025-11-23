public class RecursiveBubbleSort {
    public static void main(String[] args) {
        int arr[] = {13,46,24,52,20,9};
        recursiveBubbleSort(arr, arr.length);
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void recursiveBubbleSort(int[] arr, int n) {
        if(n==1) return;
        int flag = 0;
        for(int j = 0; j < n-1; j++) {
            if(arr[j] > arr[j+1]) {
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                flag=1;
            }
        }
        if(flag==0) return;
        recursiveBubbleSort(arr, n-1);
    }
}

