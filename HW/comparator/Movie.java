package hus.oop.comparator;

public class Movie implements Comparable<Movie> {
    private String name;
    private double rating;
    private int year;

    // Constructor
    public Movie(String name, double rating, int year) {
        this.name = name;
        this.rating = rating;
        this.year = year;
    }

    // Implementing compareTo method to sort movies by year
    public int compareTo(Movie m) {
        return (this.year - m.year);
    }

    // Getter methods for accessing private data
    public double getRating() {
        return rating;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Movie[" +
                "name='" + name + '\'' +
                ", rating=" + rating +
                ", year=" + year +
                ']';
    }
}

