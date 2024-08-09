/**
 * In this create Linkedlist using 
 * java Colections framework
 */

package _26_LinkedList;

import java.util.LinkedList;
public class _2_Sigular_Use_Coll_Fra {
    public static void main(String args[]){
        LinkedList<Integer> list = new LinkedList<>();

        // add -first
        list.addFirst(5);
        list.addFirst(4);
        System.out.println(list);

        // add - default last
        list.add(40);
        System.out.println(list);

        // add - last
        list.addLast(12);
        System.out.println(list);

        // size
        System.out.println("Size is : " + list.size());

        // get
        for(int i = 0; i < list.size(); i++){
            System.out.println("Element at " + i + "  : " +list.get(i));
        }

        // remove - fisrt , default, last
        list.remove();   // delete last
        System.out.println(list);

        list.removeFirst();
        System.out.println(list);

        list.removeLast();
        System.out.println(list);

        // clear list
        list.clear();
        System.out.println(list);

    }
}
