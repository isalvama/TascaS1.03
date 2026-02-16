package second_level.exercise1And2;

import java.util.Comparator;

public class NameCompare implements Comparator<Restaurant> {

    @Override
    public int compare(Restaurant rest1, Restaurant rest2) {
        if (!(rest1.getName().equals(rest2.getName()))){
           return rest1.getName().compareTo(rest2.getName());
        }
        return Integer.compare(rest2.getPunctuation(), rest1.getPunctuation());
    }

}
