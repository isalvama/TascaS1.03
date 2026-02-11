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

        // Create and add 11 Month objects to an ArrayList, leaving "August" object out
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

        // Add "August" Month object in its place and check the order of months in the ArrayList
        monthArrayList.add(7, august);
        System.out.println("monthArrayList after adding 'August' in position 7: " + monthArrayList);

        HashSet<Month> monthHashSet = convertMonthArrayListToHashSet(monthArrayList);

        // Print monthHashSet content
        System.out.println("monthHashSet: " + monthHashSet);

        // Add to monthHashSet an object that already contained
        monthHashSet.add(august);

        // Print monthHashSet content to test the addition of the object
        System.out.println("monthHashSet after adding duplicate august: " + monthHashSet);

        Month inventedMonth = new Month("Invented Month");

        // Add to monthHashSet a new object
        monthHashSet.add(inventedMonth);

        // Print monthHashSet content to test the addition of the object
        System.out.println("monthHashSet after adding invented month: " + monthHashSet);

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
