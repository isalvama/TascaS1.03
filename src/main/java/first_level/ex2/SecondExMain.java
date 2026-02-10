package first_level.ex2;

import java.util.*;

public class SecondExMain {
    public static void main(String[] args){
        List<Integer> listA= List.of(1, 2, 3, 4);

        System.out.println(listA);

        // Create a list iterator over the elements in the listA (in proper sequence), starting at the last position in the list. An initial call to previous would return the element with the specified index minus one.
        ListIterator<Integer> listIterator = listA.listIterator(listA.size());
        List<Integer> listB = new ArrayList<>();

        while(listIterator.hasPrevious()){
            listB.add(listIterator.previous());
        }

        System.out.println(listB);





    }
}
