package first_level.exercise3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static java.util.List.copyOf;

public class CountriesAndCapitalsData {
    private ArrayList<String> countriesList;
    private HashMap<String, String> countriesCapitalsMap;

    public CountriesAndCapitalsData() {
        this.countriesCapitalsMap= new HashMap<>();
        this.countriesList = new ArrayList<>();
    }

    public HashMap<String, String> getCountriesCapitalsMap() {
        return countriesCapitalsMap;
    }

    public List<String> getCountriesList() {
        return copyOf(countriesList);
    }

    public void setCountriesCapitalsMap(HashMap<String, String> countriesCapitalsMap) {
        this.countriesCapitalsMap = countriesCapitalsMap;
    }

    public void setCountriesList(ArrayList<String> countriesList) {
        this.countriesList = countriesList;
    }


    @Override
    public String toString() {
        return "CountriesAndCapitalsData{" +
                "countriesList=" + countriesList +
                ", countriesCapitalsMap=" + countriesCapitalsMap +
                '}';
    }
}
