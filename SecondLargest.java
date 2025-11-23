public class SecondLargest {
    public static void main(String[] args) {
        int arr[] = {9,1,3,8,2,5,7,6,4};
        int max=arr[0], max2=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++) {
            if(arr[i] > max) {
                max2=max;
                max=arr[i];
            }
            else if(arr[i]>max2 && arr[i]!=max) {
                max2=arr[i];
            }
        }
        System.out.println("Max: "+max);
        System.out.println("Second max: "+max2);
    }
}
