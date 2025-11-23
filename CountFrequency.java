import java.util.*;
public class CountFrequency {
    public static void main(String args[]){  
        int arr[] = {10,5,10,15,10,5};
        HashMap<Integer, Integer> map = countFrequency(arr);
        for(Map.Entry<Integer, Integer> e : map.entrySet()) {
            System.out.println(e.getKey()+" "+e.getValue());
        }
    }
    public static HashMap<Integer,Integer> countFrequency(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i])+1);
            }
            else map.put(arr[i], 1);
        }
        return map;
    }
}
