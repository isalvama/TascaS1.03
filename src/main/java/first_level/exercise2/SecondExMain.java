package first_level.exercise2;

import java.util.*;

public class SecondExMain {
    public static void main(String[] args){
        List<Integer> listA = List.of(1, 2, 3, 4);
        System.out.println("list A: " + listA);

        List<Integer> listB = sortInReverseOrder(listA);
        System.out.println("list B: " + listB);
    }

    public static List<Integer> sortInReverseOrder(List<Integer> listA){
        List<Integer> listB = new ArrayList<>();
        ListIterator<Integer> listIterator = listA.listIterator(listA.size());
        while(listIterator.hasPrevious()){
            listB.add(listIterator.previous());
        }
        return listB;
    }
}
