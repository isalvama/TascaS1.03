package second_level.exercise1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Main {
    public static void main(String[] args){

        // Exercise 1 instructions
        Restaurant rest1 = new Restaurant("restA", 3);
        Restaurant rest2 = new Restaurant("restA", 3);
        Restaurant rest3 = new Restaurant("restC", 4);
        Restaurant rest4 = new Restaurant("restD", 5);
        Restaurant rest5 = new Restaurant("restD", 5);
        Restaurant rest6 = new Restaurant("restA", 2);
        Restaurant rest7 = new Restaurant("restD", 4);
        Restaurant rest8 = new Restaurant("restD", 3);



        HashSet<Restaurant> restaurantsSet = new HashSet<>();
        restaurantsSet.add(rest1);
        restaurantsSet.add(rest3);
        restaurantsSet.add(rest2);
        restaurantsSet.add(rest4);
        restaurantsSet.add(rest5);
        restaurantsSet.add(rest6);
        restaurantsSet.add(rest7);
        restaurantsSet.add(rest8);

        System.out.println(restaurantsSet);

        // Exercise 2 instructions
        ArrayList<Restaurant> restaurantArrayList = new ArrayList<>(restaurantsSet);

        Collections.sort(restaurantArrayList, new NameCompare());
        System.out.println(restaurantArrayList);



    }
}
