package first_level.ex1;

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
