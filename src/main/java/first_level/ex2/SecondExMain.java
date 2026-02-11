package first_level.ex2;

import java.util.*;

public class SecondExMain {
    public static void main(String[] args){
        // Create a List<Integer> and add elements
        List<Integer> listA= List.of(1, 2, 3, 4);

        System.out.println(listA);

        // Create a new ArrayList to insert the elements of listA in reverse order
        List<Integer> listB = new ArrayList<>();

        // Create a list iterator over the elements in the listA (in proper sequence), placing the cursor at the last position in the list.
        ListIterator<Integer> listIterator = listA.listIterator(listA.size());

        // Add the elements of listA in listB in reverse order: while there is an element behind, the previous element is being added in listB
        while(listIterator.hasPrevious()){
            listB.add(listIterator.previous());
        }

        System.out.println(listB);
    }
}
