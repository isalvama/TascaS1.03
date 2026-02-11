package first_level.ex3;

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

    public void setCountriesList(ArrayList<String> countriesList) {
        this.countriesList = countriesList;
    }

    public void setCountriesCapitalsMap(HashMap<String, String> countriesCapitalsMap) {
        this.countriesCapitalsMap = countriesCapitalsMap;
    }

    public List<String> getCountriesList() {
        return copyOf(countriesList);
    }

    public HashMap<String, String> getCountriesCapitalsMap() {
        return countriesCapitalsMap;
    }

    @Override
    public String toString() {
        return "CountriesAndCapitalsData{" +
                "countriesList=" + countriesList +
                ", countriesCapitalsMap=" + countriesCapitalsMap +
                '}';
    }
}
