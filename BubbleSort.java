public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {13,46,24,52,20,9};
        bubbleSort(arr);
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void bubbleSort(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            int flag = 0;
            for(int j = 0; j < arr.length-1-i; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = 1;
                }
            }
            if(flag == 0) break;
        }
    }
}
