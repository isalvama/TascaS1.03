package first_level.ex3;

import java.io.IOException;
import java.util.Scanner;

interface GameProgram {
    Scanner sc = new Scanner(System.in);

    static Game program(){
        System.out.println("Please introduce your name");
        String name = sc.nextLine();
        System.out.println("Hi " + name + " welcome to the capitals game!");
        Game game = new Game(name);

        try {CountriesAndCapitalsData data = FileReading.readFile("/Users/ines/IdeaProjects/TascaS1.03/src/other/countries.txt");
            System.out.println(data);
            int points = 0;
        for (int i = 0; i < 10; i++){
            int index = (int)(Math.random() * data.getCountriesList().size());
            String questionCountry = data.getCountriesList().get(index);
            System.out.println("Which is the capital of " + questionCountry + " ?");
            String answer = sc.nextLine();
            String formattedAnswer = answer.substring(0, 1).toUpperCase() + answer.substring(1);
            if (formattedAnswer.equals(data.getCountriesCapitalsMap().get(questionCountry))){
                points++;
                System.out.println("Congrats! You got the right answer! You now have " + points + " points.");
            } else {
            System.out.println("Your answer was not right. The right answer was: " + data.getCountriesCapitalsMap().get(questionCountry));
            }
        }
            game.setPoints(points);

        } catch (IOException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
        System.out.println(game);
        return game;
    }
}
