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
                BufferedReader br = new BufferedReader(new FileReader(filePath))){

            String line;
            while ((line = br.readLine()) != null) {

                String[] parts = line.split(" ");

                String country = parts[0].trim();
                String capital = parts[1].trim();

                if (!country.isEmpty() && !capital.isEmpty()){
                    countriesCapitalsMap.put(country, capital);
                    countriesArrayList.add(country);
                }
            }
        }
        CountriesAndCapitalsData data = new CountriesAndCapitalsData();

        data.setCountriesCapitalsMap(countriesCapitalsMap);
        data.setCountriesList(countriesArrayList);
        return data;
    }

}
