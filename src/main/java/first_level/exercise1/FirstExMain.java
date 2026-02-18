package first_level.exercise1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class FirstExMain {
    public static void main (String[] args){

        Month august = new Month("August");

        List<Month> monthArrayList = new ArrayList<>(List.of(new Month("January"), new Month("February"), new Month("March"), new Month("April"), new Month("May"), new Month("June"), new Month("July"), new Month("September"),
        new Month("October"),
        new Month("November"),
        new Month("December")));
        System.out.println("monthArrayList without 'August': " + monthArrayList);

        monthArrayList.add(7, august);
        System.out.println("monthArrayList after adding 'August' in position 7: " + monthArrayList);

        HashSet<Month> monthHashSet = convertMonthArrayListToHashSet(monthArrayList);
        System.out.println("monthHashSet: " + monthHashSet);

        monthHashSet.add(august);
        System.out.println("monthHashSet after adding duplicate august: " + monthHashSet);

        Month inventedMonth = new Month("Invented Month");
        monthHashSet.add(inventedMonth);
        System.out.println("monthHashSet after adding invented month: " + monthHashSet);

        System.out.println("------- loop with a for--------");
        for (Month month : monthHashSet){
            System.out.println(month);
        }

        Iterator<Month> monthIterator = monthHashSet.iterator();

        System.out.println("------- loop with an Iterator--------");
        while (monthIterator.hasNext()){
            System.out.println(monthIterator.next());
        }

    }
    public static HashSet<Month> convertMonthArrayListToHashSet(List<Month> monthsArrayInput){
        return new HashSet<>(monthsArrayInput);

    }
}
