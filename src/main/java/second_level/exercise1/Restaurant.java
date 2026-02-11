package second_level.exercise1;

 public class Restaurant implements Comparable<Restaurant> {
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
    public boolean equals(Object object){
        if (this == object) return true;
        if(!(object instanceof Restaurant)) return false;

        Restaurant otherObj = (Restaurant) object;
        boolean nameEquals = (this.name == null && otherObj.getName() == null) || (this.name != null &&  this.name.equals(otherObj.name));
        return this.punctuation == otherObj.getPunctuation() && nameEquals;
    }

     @Override
     public int hashCode() {
         int hash = 7;
         hash = 31 * hash + (int) punctuation;
         hash = 31 * hash + (name == null ? 0 : name.hashCode());
         return hash;
     }

     @Override
     public String toString() {
         return "Restaurant{" +
                 "name='" + name + '\'' +
                 ", punctuation=" + punctuation +
                 '}';
     }

     @Override
     public int compareTo(Restaurant r) {
        return this.punctuation - r.punctuation;
     }
 }
