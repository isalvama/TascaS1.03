package first_level.ex1;

import java.util.ArrayList;
import java.util.HashMap;
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

        System.out.println(monthArrayList);

        monthArrayList.add(7, august);
        System.out.println(monthArrayList);

        HashSet<Month> monthHashSet  = convertMonthArrayListToHashSet(monthArrayList);

        // Print monthHashSet content
        System.out.println(monthHashSet);

        // Add to monthHashSet an object that already contained
        monthHashSet.add(august);

        // Print monthHashSet content to test the addition of the object
        System.out.println(monthHashSet);

        Month inventedMonth = new Month("Invented Month");

        // Add to monthHashSet a new object
        monthHashSet.add(inventedMonth);

        // Print monthHashSet content to test the addition of the object
        System.out.println(monthHashSet);

        // Loop through the collection with a for loop and an Iterator.
        System.out.println("------- loop with a for--------");
        for (Month month : monthHashSet){
            System.out.println(month);
        }

        // Create Iterator of Month objects
        Iterator<Month> monthIterator = monthHashSet.iterator();

        // Loop through the collection an Iterator.
        System.out.println("------- loop with an Iterator--------");
        while (monthIterator.hasNext()){
            System.out.println(monthIterator.next());
        }




    }
    public static HashSet<Month> convertMonthArrayListToHashSet(ArrayList<Month> monthsArrayInput){
        return new HashSet<>(monthsArrayInput);

    }
}
