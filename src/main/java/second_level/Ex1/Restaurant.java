package second_level.Ex1;

/*
Crea una classe anomenada Restaurant amb dos atributs: nom (String) i puntuació (int).
Implementa els mètodes necessaris (equals() i hashCode()) perquè no es puguin introduir
objectes Restaurant amb el mateix nom i la mateixa puntuació dins un HashSet.


Exercici 2 — Ordenació múltiple
A partir de la classe Restaurant del programa anterior, implementa la funcionalitat
necessària perquè els objectes es puguin ordenar alfabèticament pel nom i, en cas que coincideixin,
per puntuació en ordre descendent.

Pots fer-ho implementant la interfície Comparable o mitjançant un Comparator, segons consideris més adient.
 */

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
 }
