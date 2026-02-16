package first_level.exercise1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class FirstExMain {
    public static void main (String[] args){
        Month january = new Month("January");
        Month february = new Month("February");
        Month march = new Month("March");
        Month april = new Month("April");
        Month may = new Month("May");
        Month june = new Month("June");
        Month july = new Month("July");
        Month august = new Month("August");
        Month september = new Month("September");
        Month october = new Month("October");
        Month november = new Month("November");
        Month december = new Month("December");

        ArrayList<Month> monthArrayList = new ArrayList<>();
        monthArrayList.add(january);
        monthArrayList.add(february);
        monthArrayList.add(march);
        monthArrayList.add(april);
        monthArrayList.add(may);
        monthArrayList.add(june);
        monthArrayList.add(july);
        monthArrayList.add(september);
        monthArrayList.add(october);
        monthArrayList.add(november);
        monthArrayList.add(december);

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
    public static HashSet<Month> convertMonthArrayListToHashSet(ArrayList<Month> monthsArrayInput){
        return new HashSet<>(monthsArrayInput);

    }
}
