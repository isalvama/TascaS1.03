package first_level.exercise3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class GameMachine {
    private ArrayList<String> countriesList;
    private HashMap<String, String> countriesCapitalsMap;
    private static final Scanner SC = new Scanner(System.in);
    private ArrayList<Game> playedGames = new ArrayList<>();
    private static final int N_QUESTIONS = 10;

    public List<Game> getPlayedGames() {
        return List.copyOf(playedGames);
    }

    public GameMachine(){
        this.countriesList = new ArrayList<String>();
        this.countriesCapitalsMap = new HashMap<String, String>();
        this.playedGames = new ArrayList<Game>();
    }

        public void program(){
        loadCountries();
        System.out.println("Please introduce your name");
        String name = SC.nextLine();
        System.out.println("Hi " + name + ", welcome to the capitals game!");
        Game game = new Game(name);
            int points = 0;
        for (int i = 0; i < N_QUESTIONS; i++){
            int index = (int)(Math.random() * countriesList.size());
            String questionCountry = countriesList.get(index);
            System.out.println("Which is the capital of " + questionCountry + " ?");
            String answer = SC.nextLine().toLowerCase();
            String formattedAnswer = answer.toLowerCase();
            if (formattedAnswer.equals(countriesCapitalsMap.get(questionCountry).toLowerCase())){
                points++;
                System.out.println("Congrats! You got the right answer! You now have " + points + " points.");
            } else {
            System.out.println("Your answer was not right. The right answer was: " + countriesCapitalsMap.get(questionCountry));
            }
        }
            System.out.println("Game over! You got " + points + " points.");
            game.setPoints(points);
            playedGames.add(game);
            seePlayedGames();
    }

    public void loadCountries(){
        String path = System.getProperty("user.dir") + File.separator + "countries.txt";
        File file = new File(path);

        if(!file.exists()){
            System.err.println("File not found");
        }
        try(BufferedReader br = new BufferedReader(new FileReader(file))){
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ");
                String country = parts[0].trim().replace('_',' ');
                String capital = parts[1].trim().replace('_',' ');;
                if (!country.isEmpty() && !capital.isEmpty()){
                    countriesCapitalsMap.put(country, capital);
                    countriesList.add(country);
                }
            }
        } catch (IOException e) {
            System.err.println("Error loading countries " + e.getMessage());
        }
    }


    public String seePlayedGames() {
        return "All the scores:\n" + List.copyOf(playedGames);
    }
}
