package com.opolo.dsa.geeks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Movie implements Comparable<Movie> {

    private String name;
    private int rating;

    public Movie(String name, int rating) {
        this.name = name;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public int compareTo(Movie m) {
        return this.rating - m.rating;
    }

}

// Driver class
public class ObjectEquivalenceComparable {

    public static void main(String[] args) {
        List<Movie> list = new ArrayList<Movie>();

        list.add(new Movie("Force Awakens", 8));
        list.add(new Movie("Star Wars", 9));
        list.add(new Movie("Empire Strikes Back", 7));
        list.add(new Movie("Return of the Jedi", 8));

        Collections.sort(list);

        list.stream().forEach(m -> System.out.println("Movie = " + m.getName() + ", rating = " + m.getRating()));
    }
}
