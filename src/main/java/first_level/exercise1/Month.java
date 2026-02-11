package first_level.exercise1;

public class Month {
    private String name;

    public Month(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Month{" +
                "name='" + name + '\'' +
                '}';
    }
}
