package hus.oop.countryarraymanager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class App {
    private static final String COMMA_DELIMITER = ",";
    private static final CountryArrayManager countryManager = new CountryArrayManager();

    public static void main(String[] args) {
        init();
        System.out.println("SortIncreasingByPopulation: ");
        testSortIncreasingByPopulation();
        System.out.println();
        System.out.println("SortDecreasingByPopulation:");
        testSortDecreasingByPopulation();
        System.out.println();
        System.out.println("SortIncreasingByArea:");
        testSortIncreasingByArea();
        System.out.println();
        System.out.println("SortDecreasingByArea:");
        testSortDecreasingByArea();
        System.out.println();
        System.out.println("SortIncreasingByGdp:");
        testSortIncreasingByGdp();
        System.out.println();
        System.out.println("SortDecreasingByGdp:");
        testSortDecreasingByGdp();
        System.out.println();
        System.out.println("AfricaCountry:");
        testFilterAfricaCountry();
        System.out.println();
        System.out.println("AsiaCountry:");
        testFilterAsiaCountry();
        System.out.println();
        System.out.println("EuropeCountry:");
        testFilterEuropeCountry();
        System.out.println();
        System.out.println("NorthAmericaCountry:");
        testFilterNorthAmericaCountry();
        System.out.println();
        System.out.println("OceaniaCountry:");
        testFilterOceaniaCountry();
        System.out.println();
        System.out.println("SouthAmericaCountry:");
        testFilterSouthAmericaCountry();
        System.out.println();
        System.out.println("MostPopulousCountries:");
        testFilterMostPopulousCountries();
        System.out.println();
        System.out.println("LeastPopulousCountries:");
        testFilterLeastPopulousCountries();
        System.out.println();
        System.out.println("LargestAreaCountries:");
        testFilterLargestAreaCountries();
        System.out.println();
        System.out.println("SmallestAreaCountries:");
        testFilterSmallestAreaCountries();
        System.out.println();
        System.out.println("HighestGdpCountries:");
        testFilterHighestGdpCountries();
        System.out.println();
        System.out.println("LowestGdpCountries:");
        testFilterLowestGdpCountries();
    }

    public static void readListData(String filePath) {
        BufferedReader dataReader = null;
        try {
            dataReader = new BufferedReader(new FileReader(filePath));

            // Read file in java line by line.
            String line;
            while ((line = dataReader.readLine()) != null) {
                List<String> dataList = parseDataLineToList(line);

                if (dataList.get(0).equals("code")) {
                    continue;
                }

                if (dataList.size() != 6) {
                    continue;
                }

                Country newCountry = null;
                if(dataList.get(5).equals("Asia")) {
                    newCountry = new AsiaCountry(dataList.get(0) ,
                            dataList.get(1),
                            Integer.parseInt(dataList.get(2)),
                            Double.parseDouble(dataList.get(3)),
                            Double.parseDouble(dataList.get(4)));
                } else if (dataList.get(5).equals("Ocenia")) {
                    newCountry = new OceaniaCountry(dataList.get(0) ,
                            dataList.get(1),
                            Integer.parseInt(dataList.get(2)),
                            Double.parseDouble(dataList.get(3)),
                            Double.parseDouble(dataList.get(4)));
                } else if (dataList.get(5).equals("Africa")) {
                    newCountry = new AfricaCountry(dataList.get(0) ,
                            dataList.get(1),
                            Integer.parseInt(dataList.get(2)),
                            Double.parseDouble(dataList.get(3)),
                            Double.parseDouble(dataList.get(4)));
                }else if (dataList.get(5).equals("Europe")) {
                    newCountry = new EuropeCountry(dataList.get(0) ,
                            dataList.get(1),
                            Integer.parseInt(dataList.get(2)),
                            Double.parseDouble(dataList.get(3)),
                            Double.parseDouble(dataList.get(4)));
                }else if (dataList.get(5).equals("SouthAmerica")) {
                    newCountry = new SouthAmericaCountry(dataList.get(0) ,
                            dataList.get(1),
                            Integer.parseInt(dataList.get(2)),
                            Double.parseDouble(dataList.get(3)),
                            Double.parseDouble(dataList.get(4)));
                }else if (dataList.get(5).equals("NorthAmerica")){
                    newCountry = new NorthAmericaCountry(dataList.get(0) ,
                            dataList.get(1),
                            Integer.parseInt(dataList.get(2)),
                            Double.parseDouble(dataList.get(3)),
                            Double.parseDouble(dataList.get(4)));
                }

                if(newCountry!= null){
                    countryManager.append(newCountry);
                }

                /*

                 * TODO: create Country and append countries into
                 * CountryArrayManager here.
                 */
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (dataReader != null) {
                    dataReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static List<String> parseDataLineToList(String dataLine) {
        List<String> result = new ArrayList<>();
        if (dataLine != null) {
            String[] splitData = dataLine.split(COMMA_DELIMITER);
            for (int i = 0; i < splitData.length; i++) {
                result.add(splitData[i]);
            }
        }

        return result;
    }

    public static String[] parseDataLineToArray(String dataLine) {
        if (dataLine == null) {
            return null;
        }

        return dataLine.split(COMMA_DELIMITER);
    }

    public static void init() {
        String filePath = "data/countries.csv";
        readListData(filePath);
    }

    public static void testOriginalData() {
        String codesString = CountryArrayManager.codeOfCountriesToString(countryManager.getCountries());
        System.out.print(codesString);
    }

    public static void testSortIncreasingByPopulation() {
        Country[] countries = countryManager.sortByIncreasingPopulation();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
    }

    public static void testSortDecreasingByPopulation() {
        Country[] countries = countryManager.sortByDecreasingPopulation();
        String codeString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codeString);
    }

    public static void testSortIncreasingByArea() {
        Country[] countries = countryManager.sortByIncreasingArea();
        String codeString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codeString);
    }

    public static void testSortDecreasingByArea() {
        Country[] countries = countryManager.sortByDecreasingArea();
        String codeString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codeString);
    }

    public static void testSortIncreasingByGdp() {
        Country[] countries = countryManager.sortByIncreasingGdp();
        String codeString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codeString);
    }

    public static void testSortDecreasingByGdp() {
        Country[] countries = countryManager.sortByDecreasingGdp();
        String codeString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codeString);
    }

    public static void testFilterAfricaCountry() {
        Country[] countries = countryManager.filterAfricaCountry();
        String codeString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codeString);
    }

    public static void testFilterAsiaCountry() {
        Country[] countries = countryManager.filterAsiaCountry();
        String codeString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codeString);
    }

    public static void testFilterEuropeCountry() {
        Country[] countries = countryManager.filterEuropeCountry();
        String codeString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codeString);
    }

    public static void testFilterNorthAmericaCountry() {
        Country[] countries = countryManager.filterNorthAmericaCountry();
        String codeString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codeString);
    }

    public static void testFilterOceaniaCountry() {
        Country[] countries = countryManager.filterOceaniaCountry();
        String codeString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codeString);
    }

    public static void testFilterSouthAmericaCountry() {
        Country[] countries = countryManager.filterSouthAmericaCountry();
        String codeString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codeString);
    }

    public static void testFilterMostPopulousCountries() {
        Country[] countries = countryManager.filterMostPopulousCountries(5);
        String codeString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codeString);
    }

    public static void testFilterLeastPopulousCountries() {
        Country[] countries = countryManager.filterLeastPopulousCountries(5);
        String codeString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codeString);
    }

    public static void testFilterLargestAreaCountries() {
        Country[] countries = countryManager.filterLargestAreaCountries(5);
        String codeString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codeString);
    }

    public static void testFilterSmallestAreaCountries() {
        Country[] countries = countryManager.filterSmallestAreaCountries(5);
        String codeString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codeString);
    }

    public static void testFilterHighestGdpCountries() {
        Country[] countries = countryManager.filterHighestGdpCountries(5);
        String codeString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codeString);
    }

    public static void testFilterLowestGdpCountries() {
        Country[] countries = countryManager.filterLowestGdpCountries(5);
        String codeString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codeString);
    }
}
