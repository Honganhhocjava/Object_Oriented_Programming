package hus.oop.countrylistmanager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {
    private static final String COMMA_DELIMITER = ",";

    public static void main(String[] args) {
        /* TODO */
        // Viết code cho các hàm test.
        // Kết quả chạy chương trình lưu vào file <Mã số sinh viên>CountryListManager.txt và nộp cùng source code.
        System.out.println("Filter Continent - Asia:");
        testFilterContinent();
        System.out.println();

        System.out.println("Filter Highest GDP Countries:");
        testFilterHighestGdpCountries();
        System.out.println();

        System.out.println("Filter Largest Area Countries:");
        testFilterLargestAreaCountries();
        System.out.println();

        System.out.println("Filter Least Populous Countries:");
        testFilterLeastPopulousCountries();
        System.out.println();

        System.out.println("Filter Lowest GDP Countries:");
        testFilterLowestGdpCountries();
        System.out.println();

        System.out.println("Filter Most Populous Countries:");
        testFilterMostPopulousCountries();
        System.out.println();

        System.out.println("Original Data:");
        testOriginalData();
        System.out.println();

        System.out.println("Sort Decreasing By Area:");
        testSortDecreasingByArea();
        System.out.println();

        System.out.println("Sort Decreasing By GDP:");
        testSortDecreasingByGdp();
        System.out.println();

        System.out.println("Sort Decreasing By Population:");
        testSortDecreasingByPopulation();
        System.out.println();

        System.out.println("Sort Increasing By Area:");
        testSortIncreasingByArea();
        System.out.println();

        System.out.println("Sort Increasing By GDP:");
        testSortIncreasingByGdp();
        System.out.println();

        System.out.println("Sort Increasing By Population:");
        testSortIncreasingByPopulation();
        System.out.println();

        System.out.println("Filter Smallest Area Countries:");
        testFilterSmallestAreaCountries();
    }

    public static void readListData(String filePath) {
        BufferedReader dataReader = null;
        try {
            String line;
            //dataReader = new BufferedReader(new FileReader("data/nations1.csv"));
            dataReader = new BufferedReader(new FileReader(filePath));

            // How to read file in java line by line?
            while ((line = dataReader.readLine()) != null) {
                List<String> dataList = parseDataLineToList(line);
                if (dataList.size() != 6) {
                    continue;
                }

                if (dataList.get(0).equals("code")) {
                    continue;
                }

                CountryData newCountryData = new CountryData.CountryDataBuilder(dataList.get(0))
                        .setName(dataList.get(1))
                        .setPopulation(Integer.parseInt(dataList.get(2)))
                        .setArea(Double.parseDouble(dataList.get(3)))
                        .setGdp(Double.parseDouble(dataList.get(4)))
                        .build();

                /* TODO */
                // Tạo đối tượng Country sử dụng CountryFactory,
                // sau đó cho vào CountryListManager để quản lý.
                AbstractCountry country = CountryFactory.getInstance().createCountry(dataList.get(5), newCountryData);
                CountryListManager.getInstance().append(country);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (dataReader != null)
                    dataReader.close();
            } catch (IOException crunchifyException) {
                crunchifyException.printStackTrace();
            }
        }
    }

    public static List<String> parseDataLineToList(String dataLine) {
        List<String> result = new ArrayList<String>();
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
        String filePath = "data/countries2.csv";
        readListData(filePath);
    }

    // In ra code của các nước theo định dạng, ví dụ
    // [CHN IND USA IDN BRA PAK NGA BGD RUS MEX JPN DEU FRA GBR ITA ARG DZA CAN AUS KAZ SGP DNK NLD ESP SWE THA UKR VNM CHE QAT NZL]
    public static void testOriginalData() {
        init();
        String codes = CountryListManager.getInstance().codeOfCountriesToString(CountryListManager.getInstance().getCountryList());
        System.out.print(codes);
    }

    // In ra code của các nước theo định dạng, ví dụ
    // [CHN IND USA IDN BRA PAK NGA BGD RUS MEX JPN DEU FRA GBR ITA ARG DZA CAN AUS KAZ SGP DNK NLD ESP SWE THA UKR VNM CHE QAT NZL]
    public static void testSortIncreasingByPopulation() {
        init();
        List<AbstractCountry> countries = CountryListManager.getInstance().sortIncreasingByPopulation();
        String codeString = CountryListManager.getInstance().codeOfCountriesToString(countries);
        System.out.print(codeString);
    }

    // In ra code của các nước theo định dạng, ví dụ
    // [CHN IND USA IDN BRA PAK NGA BGD RUS MEX JPN DEU FRA GBR ITA ARG DZA CAN AUS KAZ SGP DNK NLD ESP SWE THA UKR VNM CHE QAT NZL]
    public static void testSortDecreasingByPopulation() {
        init();
        List<AbstractCountry> countries = CountryListManager.getInstance().sortDecreasingByPopulation();
        String codeString = CountryListManager.getInstance().codeOfCountriesToString(countries);
        System.out.print(codeString);
    }

    // In ra code của các nước theo định dạng, ví dụ
    // [CHN IND USA IDN BRA PAK NGA BGD RUS MEX JPN DEU FRA GBR ITA ARG DZA CAN AUS KAZ SGP DNK NLD ESP SWE THA UKR VNM CHE QAT NZL]
    public static void testSortIncreasingByArea() {
        /* TODO */
        init();
        List<AbstractCountry> countries = CountryListManager.getInstance().sortIncreasingByArea();
        String codeString = CountryListManager.getInstance().codeOfCountriesToString(countries);
        System.out.print(codeString);
    }

    // In ra code của các nước theo định dạng, ví dụ
    // [CHN IND USA IDN BRA PAK NGA BGD RUS MEX JPN DEU FRA GBR ITA ARG DZA CAN AUS KAZ SGP DNK NLD ESP SWE THA UKR VNM CHE QAT NZL]
    public static void testSortDecreasingByArea() {
        /* TODO */
        init();
        List<AbstractCountry> countries = CountryListManager.getInstance().sortDecreasingByArea();
        String codeString = CountryListManager.getInstance().codeOfCountriesToString(countries);
        System.out.print(codeString);
    }

    // In ra code của các nước theo định dạng, ví dụ
    // [CHN IND USA IDN BRA PAK NGA BGD RUS MEX JPN DEU FRA GBR ITA ARG DZA CAN AUS KAZ SGP DNK NLD ESP SWE THA UKR VNM CHE QAT NZL]
    public static void testSortIncreasingByGdp() {
        /* TODO */
        init();
        List<AbstractCountry> countries = CountryListManager.getInstance().sortIncreasingByGdp();
        String codeString = CountryListManager.getInstance().codeOfCountriesToString(countries);
        System.out.print(codeString);
    }

    // In ra code của các nước theo định dạng, ví dụ
    // [CHN IND USA IDN BRA PAK NGA BGD RUS MEX JPN DEU FRA GBR ITA ARG DZA CAN AUS KAZ SGP DNK NLD ESP SWE THA UKR VNM CHE QAT NZL]
    public static void testSortDecreasingByGdp() {
        /* TODO */
        init();
        List<AbstractCountry> countries = CountryListManager.getInstance().sortDecreasingByGdp();
        String codeString = CountryListManager.getInstance().codeOfCountriesToString(countries);
        System.out.print(codeString);
    }

    // In ra code của các nước theo định dạng, ví dụ
    // [CHN IND USA IDN BRA PAK NGA BGD RUS MEX JPN DEU FRA GBR ITA ARG DZA CAN AUS KAZ SGP DNK NLD ESP SWE THA UKR VNM CHE QAT NZL]
    public static void testFilterMostPopulousCountries() {
        /* TODO */
        init();
        List<AbstractCountry> countries = CountryListManager.getInstance().filterMostPopulousCountries(10);
        String codeString = CountryListManager.getInstance().codeOfCountriesToString(countries);
        System.out.print(codeString);
    }

    // In ra code của các nước theo định dạng, ví dụ
    // [CHN IND USA IDN BRA PAK NGA BGD RUS MEX JPN DEU FRA GBR ITA ARG DZA CAN AUS KAZ SGP DNK NLD ESP SWE THA UKR VNM CHE QAT NZL]
    public static void testFilterLeastPopulousCountries() {
        /* TODO */
        init();
        List<AbstractCountry> countries = CountryListManager.getInstance().filterLeastPopulousCountries(10);
        String codeString = CountryListManager.getInstance().codeOfCountriesToString(countries);
        System.out.print(codeString);
    }

    // In ra code của các nước theo định dạng, ví dụ
    // [CHN IND USA IDN BRA PAK NGA BGD RUS MEX JPN DEU FRA GBR]
    public static void testFilterContinent() {
        /* TODO */
        init();
        List<AbstractCountry> countries = CountryListManager.getInstance().filterContinent("Asia");
        String codeString = CountryListManager.getInstance().codeOfCountriesToString(countries);
        System.out.print(codeString);
    }

    // In ra code của các nước theo định dạng, ví dụ
    // [CHN IND USA IDN BRA PAK NGA BGD RUS MEX JPN DEU FRA GBR]
//    public static void testFilterMostPopulousCountries() {
//        /* TODO */
//        init();
//        List<AbstractCountry> countries = CountryListManager.getInstance().filterMostPopulousCountries(10);
//        String codeString = CountryListManager.getInstance().codeOfCountriesToString(countries);
//        System.out.print(codeString);
//    }

    // In ra code của các nước theo định dạng, ví dụ
    // [CHN IND USA IDN BRA PAK NGA BGD RUS MEX JPN DEU FRA GBR]
//    public static void testFilterLeastPopulousCountries() {
//        /* TODO */
//        init();
//        List<AbstractCountry> countries = CountryListManager.getInstance().filterLeastPopulousCountries(10);
//        String codeString = CountryListManager.getInstance().codeOfCountriesToString(countries);
//        System.out.print(codeString);
//
//    }

    // In ra code của các nước theo định dạng, ví dụ
    // [CHN IND USA IDN BRA PAK NGA BGD RUS MEX JPN DEU FRA GBR]
    public static void testFilterLargestAreaCountries() {
        /* TODO */
        init();
        List<AbstractCountry> countries = CountryListManager.getInstance().filterLargestAreaCountries(10);
        String codeString = CountryListManager.getInstance().codeOfCountriesToString(countries);
        System.out.print(codeString);
    }

    // In ra code của các nước theo định dạng, ví dụ
    // [CHN IND USA IDN BRA PAK NGA BGD RUS MEX JPN DEU FRA GBR]
    public static void testFilterSmallestAreaCountries() {
        /* TODO */
        init();
        List<AbstractCountry> countries = CountryListManager.getInstance().filterSmallestAreaCountries(10);
        String codeString = CountryListManager.getInstance().codeOfCountriesToString(countries);
        System.out.print(codeString);
    }

    // In ra code của các nước theo định dạng, ví dụ
    // [CHN IND USA IDN BRA PAK NGA BGD RUS MEX JPN DEU FRA GBR]
    public static void testFilterHighestGdpCountries() {
        /* TODO */
        init();
        List<AbstractCountry> countries = CountryListManager.getInstance().filterHighestGdpCountries(10);
        String codeString = CountryListManager.getInstance().codeOfCountriesToString(countries);
        System.out.print(codeString);
    }

    // In ra code của các nước theo định dạng, ví dụ
    // [CHN IND USA IDN BRA PAK NGA BGD RUS MEX JPN DEU FRA GBR]
    public static void testFilterLowestGdpCountries() {
        /* TODO */
        init();
        List<AbstractCountry> countries = CountryListManager.getInstance().filterLowestGdpCountries(10);
        String codeString = CountryListManager.getInstance().codeOfCountriesToString(countries);
        System.out.print(codeString);
    }

}
