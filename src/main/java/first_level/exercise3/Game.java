package first_level.exercise3;

public class Game {
    private String userName;
    private int points;

    public Game(String userName) {
        this.userName = userName;
        this.points = 0;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getPoints() {
        return points;
    }

    public int setPoints(int points) {
        return this.points = points;
    }

    @Override
    public String toString() {
        return "Game{" +
                "userName='" + userName + '\'' +
                ", points=" + points +
                '}';
    }
}
