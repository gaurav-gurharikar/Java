import java.util.*;
public class Intersection {
    public static void main(String[] args) {
        int[] arr1 = {1,1,2,3,4,5}; 
        int[] arr2 = {2,3,4,4,5,6};
        int[] intersection = intersection(arr1, arr2);
        for(int element:intersection) System.out.println(element);
    }
    public static int[] intersection(int[] arr1, int[] arr2) {
        ArrayList<Integer> intersection = new ArrayList<>();
        int i=0, j=0;
        while(i<arr1.length && j<arr2.length) {
            if(arr1[i]==arr2[j]) {
                if(intersection.size()==0 || intersection.get(intersection.size()-1)!=arr1[i]) {
                    intersection.add(arr1[i]);
                }
                i++;
                j++;
            }
            else if(arr1[i]<arr2[j]) i++;
            else j++;
        }
        int[] result = new int[intersection.size()];
        for(int k=0; k<intersection.size(); k++) {
            result[k] = intersection.get(k);
        }
        return result;
    }
    // public static int[] intersection(int[] arr1, int[] arr2) {
    //     ArrayList<Integer> intersection = new ArrayList<>();
    //     for(int i=0; i<arr1.length; i++) {
    //         for(int j=0; j<arr2.length; j++) {
    //             if(arr1[i]==arr2[j]) {
    //                 intersection.add(arr1[i]);
    //                 break;
    //             }
    //             if(arr2[j] > arr1[i]) break;
    //         }
    //     }
    //     int[] result = new int[intersection.size()];
    //     for(int k=0; k<intersection.size(); k++) {
    //         result[k] = intersection.get(k); 
    //     }
    //     return result;
    // }
}
