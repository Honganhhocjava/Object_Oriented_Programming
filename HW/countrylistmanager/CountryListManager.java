package hus.oop.countrylistmanager;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class CountryListManager {

    // Singleton pattern
    private static CountryListManager instance;

    private List<AbstractCountry> countryList;

    private CountryListManager() {
        countryList = new LinkedList<>();
    }

    public static CountryListManager getInstance() {
        /* TODO */
        if (instance == null) {
            instance = new CountryListManager();
        }
        return instance;
    }

    public List<AbstractCountry> getCountryList() {
        return this.countryList;
    }

    public void append(AbstractCountry country) {
        /* TODO */
        countryList.add(country);
    }

    public void add(AbstractCountry country, int index) {
        /* TODO */
        if (index >= 0 && index <= countryList.size()) {
            countryList.add(index, country);
        } else {
            throw new IndexOutOfBoundsException("Index out of range.");
        }
    }

    public void remove(int index) {
        /* TODO */
        if (index >= 0 && index < countryList.size()) {
            countryList.remove(index);
        } else {
            throw new IndexOutOfBoundsException("Index out of range.");
        }
    }

    public void remove(AbstractCountry country) {
        /* TODO */
        countryList.remove(country);
    }

    public AbstractCountry countryAt(int index) {
        /* TODO */
        if (index >= 0 && index < countryList.size()) {
            return countryList.get(index);
        } else {
            throw new IndexOutOfBoundsException("Index out of range.");
        }
    }

    public List<AbstractCountry> sortIncreasingByPopulation() {
        List<AbstractCountry> newList = new LinkedList<>(this.countryList);
        Collections.sort(newList, new Comparator<AbstractCountry>() {
            @Override
            public int compare(AbstractCountry left, AbstractCountry right) {
                return left.getPopulation() - right.getPopulation();
            }
        });
        return newList;
    }

    public List<AbstractCountry> sortDecreasingByPopulation() {
        List<AbstractCountry> newList = new LinkedList<>(this.countryList);
        Collections.sort(newList, new Comparator<AbstractCountry>() {
            @Override
            public int compare(AbstractCountry left, AbstractCountry right) {
                return right.getPopulation() - left.getPopulation();
            }
        });
        return newList;
    }

    public List<AbstractCountry> sortIncreasingByArea() {
        /* TODO */
        List<AbstractCountry> newList = new LinkedList<>(this.countryList);
        Collections.sort(newList, new Comparator<AbstractCountry>() {
            @Override
            public int compare(AbstractCountry left, AbstractCountry right) {
                return Double.compare(left.getArea(), right.getArea());
            }
        });
        return newList;
    }

    public List<AbstractCountry> sortDecreasingByArea() {
        /* TODO */
        List<AbstractCountry> newList = new LinkedList<>(this.countryList);
        Collections.sort(newList, new Comparator<AbstractCountry>() {
            @Override
            public int compare(AbstractCountry left, AbstractCountry right) {
                return Double.compare(right.getArea(), left.getArea());
            }
        });
        return newList;
    }

    public List<AbstractCountry> sortIncreasingByGdp() {
        /* TODO */
        List<AbstractCountry> newList = new LinkedList<>(this.countryList);
        Collections.sort(newList, new Comparator<AbstractCountry>() {
            @Override
            public int compare(AbstractCountry left, AbstractCountry right) {
                return Double.compare(left.getGdp(), right.getGdp());
            }
        });
        return newList;
    }

    public List<AbstractCountry> sortDecreasingByGdp() {
        /* TODO */
        List<AbstractCountry> newList = new LinkedList<>(this.countryList);
        Collections.sort(newList, new Comparator<AbstractCountry>() {
            @Override
            public int compare(AbstractCountry left, AbstractCountry right) {
                return Double.compare(right.getGdp(), left.getGdp());
            }
        });
        return newList;
    }

    public List<AbstractCountry> filterContinent(String continent) {
        /* TODO */
        List<AbstractCountry> filteredList = new LinkedList<>();
//        for (AbstractCountry country : countryList) {
//            if (country.getContinent().equalsIgnoreCase(continent)) {
//                filteredList.add(country);
//            }
//        }
        return filteredList;

    }

    public List<AbstractCountry> filterMostPopulousCountries(int howMany) {
        /* TODO */
        List<AbstractCountry> sortedList = sortDecreasingByPopulation();
        return sortedList.subList(0, Math.min(howMany, sortedList.size()));
    }

    public List<AbstractCountry> filterLeastPopulousCountries(int howMany) {
        /* TODO */
        List<AbstractCountry> sortedList = sortIncreasingByPopulation();
        return sortedList.subList(0, Math.min(howMany, sortedList.size()));
    }

    public List<AbstractCountry> filterLargestAreaCountries(int howMany) {
        /* TODO */
        List<AbstractCountry> sortedList = sortDecreasingByArea();
        return sortedList.subList(0, Math.min(howMany, sortedList.size()));
    }

    public List<AbstractCountry> filterSmallestAreaCountries(int howMany) {
        /* TODO */
        List<AbstractCountry> sortedList = sortIncreasingByArea();
        return sortedList.subList(0, Math.min(howMany, sortedList.size()));
    }

    public List<AbstractCountry> filterHighestGdpCountries(int howMany) {
        /* TODO */
        List<AbstractCountry> sortedList = sortDecreasingByGdp();
        return sortedList.subList(0, Math.min(howMany, sortedList.size()));
    }

    public List<AbstractCountry> filterLowestGdpCountries(int howMany) {
        /* TODO */
        List<AbstractCountry> sortedList = sortIncreasingByGdp();
        return sortedList.subList(0, Math.min(howMany, sortedList.size()));
    }

    public static String codeOfCountriesToString(List<AbstractCountry> countryList) {
        StringBuilder codeOfCountries = new StringBuilder();
        codeOfCountries.append("[");
        for (AbstractCountry country : countryList) {
            codeOfCountries.append(country.getCode()).append(" ");
        }
        return codeOfCountries.toString().trim() + "]";
    }

    public static void print(List<AbstractCountry> countryList) {
        StringBuilder countriesString = new StringBuilder();
        countriesString.append("[");
        for (AbstractCountry country : countryList) {
            countriesString.append(country.toString()).append("\n");
        }
        System.out.print(countriesString.toString().trim() + "]");
    }
}
