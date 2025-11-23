import java.util.*;
public class ArrayListBasics {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        //Add
        list.add(10);
        list.add(20);
        System.out.println(list);

        //Get
        System.out.println(list.get(0));
        System.out.println(list.get(1));

        //Add element in between
        list.add(1,15);
        System.out.println(list);

        //Change or update element
        list.set(0, 9);
        System.out.println(list);

        //Delete
        list.remove(2);
        System.out.println(list);

        //Size
        System.out.println(list.size());

        //Iteration
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }

        //Sorting
        Collections.sort(list);
    }
} 