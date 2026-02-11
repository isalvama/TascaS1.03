package first_level.exercise3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

interface GameProgram {
    Scanner sc = new Scanner(System.in);
    ArrayList<Game> playedGames = new ArrayList<>();

    static Game program(){
        System.out.println("Please introduce your name");
        String name = sc.nextLine();
        System.out.println("Hi " + name + ", welcome to the capitals game!");
        Game game = new Game(name);

        try {CountriesAndCapitalsData data = FileReading.readFile("/Users/ines/IdeaProjects/TascaS1.03/src/other/countries.txt");
            int points = 0;
        for (int i = 0; i < 10; i++){
            int index = (int)(Math.random() * data.getCountriesList().size());
            String questionCountry = data.getCountriesList().get(index);
            System.out.println("Which is the capital of " + questionCountry + " ?");
            String answer = sc.nextLine();
            // Format the answer in case the user introduced the response without capital letter
            String formattedAnswer = answer.substring(0, 1).toUpperCase() + answer.substring(1);
            if (formattedAnswer.equals(data.getCountriesCapitalsMap().get(questionCountry))){
                points++;
                System.out.println("Congrats! You got the right answer! You now have " + points + " points.");
            } else {
            System.out.println("Your answer was not right. The right answer was: " + data.getCountriesCapitalsMap().get(questionCountry));
            }
        }
            System.out.println("Game over! You got " + " points.");

            game.setPoints(points);

        } catch (IOException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
        playedGames.add(game);
        return game;
    }
}
