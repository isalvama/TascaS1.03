package first_level.ex3;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

interface GameProgram {
    Scanner sc = new Scanner(System.in);

    static Game program(){
        System.out.println("Please introduce your name");
        String name = sc.nextLine();
        Game game = new Game(name);
        try {CountriesAndCapitalsData data = FileReading.readFile("/Users/ines/IdeaProjects/TascaS1.03/src/other/countries.txt");
            System.out.println(data);
        for (int i = 0; i < 10; i++){
//            countriesHashMap.get()
        }


        } catch (IOException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
        return game;
    }
}
