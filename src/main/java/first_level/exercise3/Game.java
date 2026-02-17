package first_level.exercise3;

public class Game {
    private String userName;
    private int points;

    public Game(String userName) {
        this.userName = userName;
        this.points = 0;
    }

    public void setPoints(int points) {this.points = points;
    }

    @Override
    public String toString() {
        return "Game{" +
                "userName='" + userName + '\'' +
                ", points=" + points +
                '}';
    }
}
