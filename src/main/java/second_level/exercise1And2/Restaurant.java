package second_level.exercise1And2;

import java.util.Objects;

public class Restaurant {
    private String name;
    private int punctuation;

    public Restaurant (String name, int punctuation){
        this.name = name;
        this.punctuation = punctuation;
    }

     public String getName() {
         return name;
     }

     public int getPunctuation() {
         return punctuation;
     }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Restaurant that = (Restaurant) o;
        return punctuation == that.punctuation && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, punctuation);
    }

    @Override
     public String toString() {
         return "Restaurant{" +
                 "name='" + name + '\'' +
                 ", punctuation=" + punctuation +
                 '}';
     }

 }
