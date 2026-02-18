package second_level.exercise1And2;
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
        Collections.addAll(restaurantsSet, rest1, rest2, rest3, rest4, rest5, rest6, rest7, rest8);
        System.out.println(restaurantsSet);

        // Exercise 2 instructions
        ArrayList<Restaurant> restaurantArrayList = new ArrayList<>(restaurantsSet);

        restaurantArrayList.sort(new NameCompare());
        System.out.println(restaurantArrayList);
    }
}
