package first_level.ex3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

interface FileReading {

    public static CountriesAndCapitalsData readFile(String filePath) throws IOException {
        try(BufferedReader br = new BufferedReader(new FileReader(filePath))){
            HashMap<String, String> countriesCapitalsMap = new HashMap<>();
            ArrayList<String> countriesArrayList = new ArrayList<>();
            String line = null;
            CountriesAndCapitalsData data = new CountriesAndCapitalsData();
            while ((line = br.readLine()) != null) {

                // split the line by white space in two parts
                String[] parts = line.split(" ");
//                if (Arrays.stream(parts).count() > 1){
//                    return data;
//                }

                String country = parts[0].trim();
                String capital = parts[1].trim();

                if (!country.isEmpty() && !capital.isEmpty()){
                    countriesCapitalsMap.put(country, capital);
                    countriesArrayList.add(country);

                }
//                line = br.readLine();
            }
            data.setCountriesCapitalsMap(countriesCapitalsMap);
            data.setCountriesList(countriesArrayList);
            return data;
        }
    }


}
