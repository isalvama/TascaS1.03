package second_level.exercise1;
import java.util.HashSet;

public class Main {
    public static void main(String[] args){
        Restaurant rest1 = new Restaurant("rest1", 3);
        Restaurant rest2 = new Restaurant("rest1", 5);
        Restaurant rest3 = new Restaurant("rest3", 4);

        HashSet<Restaurant> restaurantsSet = new HashSet<>();
        restaurantsSet.add(rest1);
        restaurantsSet.add(rest1);
        restaurantsSet.add(rest2);
        restaurantsSet.add(rest3);
        restaurantsSet.add(rest3);
        System.out.println(restaurantsSet);



    }
}
