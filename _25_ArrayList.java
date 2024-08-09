import java.util.ArrayList;
import java.util.Collections;

public class _25_ArrayList {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        // ArrayList<String> list1 = new ArrayList<String>();

        // operation of arraylist
        // add
        list.add(1);
        list.add(8);
        list.add(80);
        list.add(54);
        System.out.println(list);

        // add on specific index
        list.add(2, 22);
        System.out.println(list);

        // get/ read element
        System.out.println(list.get(3));

        // set element/ replace element
        list.set(2, 44);
        System.out.println(list);

        // size
        System.out.println(list.size());

        // delete element
        list.remove(4);
        System.out.println(list);

        // emty
        System.out.println(list.isEmpty());

        // loops
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // sorting
        Collections.sort(list);
        System.out.println(list);

        // clear list
        list.clear();
        System.out.println(list);
    }
}
