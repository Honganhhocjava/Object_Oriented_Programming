package hus.oop.comparable;

import hus.oop.comparator.Movie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableTest {
    public static void main(String[] args) {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Force Awakens", 8.3, 2015));
        movies.add(new Movie("Star Wars", 8.7, 1977));
        movies.add(new Movie("Empire Strikes Back", 8.8, 1980));
        movies.add(new Movie("Return of the Jedi", 8.4, 1983));
        System.out.println("Movies before sorting: ");
        System.out.println(movies.toString());

        Collections.sort(movies);

        System.out.println("Movies after sorting: ");
        System.out.println(movies.toString());
    }
}
