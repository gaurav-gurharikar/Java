import java.util.*;

public class Union {
    public static void main(String[] args) {
        int[] arr1 = {1,1,2,3,4,5}; 
        int[] arr2 = {2,3,4,4,5,6};
        int[] union = union(arr1, arr2);
        for(int element:union) System.out.println(element);
    }
    public static int[] union(int[] arr1, int[] arr2) {
        ArrayList<Integer> union = new ArrayList<>();
        int i=0, j=0;
        while(i<arr1.length && j<arr2.length) {
            if(arr1[i]<=arr2[j]) {
                if(union.size()==0 || union.get(union.size()-1) != arr1[i]) {
                    union.add(arr1[i]);
                }
                i++;
            }
            else {
                if(union.size()==0 || union.get(union.size()-1) != arr2[j]) {
                    union.add(arr2[j]);
                }
                j++;
            }
        }
        while(i<arr1.length) {
            if(union.get(union.size()-1) != arr1[i]) {
                union.add(arr1[i]);
            }
            i++;
        }
        while(j<arr2.length) {
            if(union.get(union.size()-1) != arr2[j]) {
                union.add(arr2[j]);
            }
            j++;
        }
        int[] result = new int[union.size()];
        for(int k=0; k<union.size(); k++) {
            result[k] = union.get(k);
        }
        return result; 
    }
    // public static int[] union(int[] arr1, int[] arr2) {
    //     Set<Integer> set = new TreeSet<>();
    //     for(int i = 0; i < arr1.length; i++) set.add(arr1[i]);
    //     for(int i = 0; i < arr2.length; i++) set.add(arr2[i]);
    //     int[] union = new int[set.size()];
    //     int i = 0;
    //     for(int element : set) {
    //         union[i] = element;
    //         i++;
    //     }
    //     return union;
    // }
}
