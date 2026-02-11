package second_level.exercise1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Main {
    public static void main(String[] args){

        // Exercise 1 instructions
        Restaurant rest1 = new Restaurant("rest1", 3);
        Restaurant rest2 = new Restaurant("rest1", 3);
        Restaurant rest3 = new Restaurant("rest3", 4);
        Restaurant rest4 = new Restaurant("rest4", 5);
        Restaurant rest5 = new Restaurant("rest4", 5);

        HashSet<Restaurant> restaurantsSet = new HashSet<>();
        restaurantsSet.add(rest1);
        restaurantsSet.add(rest3);
        restaurantsSet.add(rest2);
        restaurantsSet.add(rest4);
        restaurantsSet.add(rest5);
        System.out.println(restaurantsSet);

        // Exercise 2 instructions
        ArrayList<Restaurant> restaurantArrayList = new ArrayList<>(restaurantsSet);

        Collections.sort(restaurantArrayList);
        System.out.println(restaurantArrayList);



    }
}
