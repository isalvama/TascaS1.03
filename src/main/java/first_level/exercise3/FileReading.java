package first_level.exercise3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class FileReading {

    public static CountriesAndCapitalsData readFile(String filePath) throws IOException {
        HashMap<String, String> countriesCapitalsMap = new HashMap<>();
        ArrayList<String> countriesArrayList = new ArrayList<>();

        try(
                // Create a buffering character-input stream of the file data red with an instance of FileReader
                BufferedReader br = new BufferedReader(new FileReader(filePath))){

            String line;
            // The code is executed while there is a line to read
            while ((line = br.readLine()) != null) {

                // split the line by white space in two parts
                String[] parts = line.split(" ");

                // Add the first part in country and the second in capital variables
                String country = parts[0].trim();
                String capital = parts[1].trim();

                // If they are not empty, country and capital are added in CountriesCapitalMap HashMap and countriesArrayList
                if (!country.isEmpty() && !capital.isEmpty()){
                    countriesCapitalsMap.put(country, capital);
                    countriesArrayList.add(country);
                }
            }
        }
        // Create a new CountriesAndCapitalsData instance
        CountriesAndCapitalsData data = new CountriesAndCapitalsData();

        // Add data as value attributes of CountriesAndCapitalsData instance
        data.setCountriesCapitalsMap(countriesCapitalsMap);
        data.setCountriesList(countriesArrayList);
        return data;
    }

}
