import java.util.*;
public class HashSetBasics {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        
        //Insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(1);
        
        //Search 
        System.out.println(set.contains(1));
        System.out.println(set.contains(9));

        //Delete
        set.remove(1);

        //Size
        System.out.println(set.size());

        //Print all
        System.out.println(set);

        //Iterator
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
