package com.opolo.dsa.geeks;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Movie1 implements Comparable<Movie1> {

    private String name;
    private double rating;
    private LocalDate year;

    public Movie1(String name, double rating, LocalDate year) {
        this.name = name;
        this.rating = rating;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public LocalDate getYear() {
        return year;
    }

    public void setYear(LocalDate year) {
        this.year = year;
    }

    @Override
    public int compareTo(Movie1 m) {
        return this.year.compareTo(m.year);
    }

}

class NameComparator implements Comparator<Movie1> {

    @Override
    public int compare(Movie1 m1, Movie1 m2) {
        return m1.getName().compareTo(m2.getName());
    }

}

class RatingComparator implements Comparator<Movie1> {

    @Override
    public int compare(Movie1 m1, Movie1 m2) {
        if (m1.getRating() > m2.getRating())
            return 1;
        if (m1.getRating() < m2.getRating())
            return -1;
        else
            return 0;
    }

}

public class ObjectEquivalenceComparator {

    public static void main(String[] args) {
        List<Movie1> list = new ArrayList<>();
        list.add(new Movie1("Force Awakens", 8.9, LocalDate.of(2021, 9, 1)));
        list.add(new Movie1("Star Wars", 8.7, LocalDate.of(2021, 9, 2)));
        list.add(new Movie1("Empire Strikes Back", 8.8, LocalDate.of(2021, 9, 3)));
        list.add(new Movie1("Return of the Jedi", 8.4, LocalDate.of(2021, 9, 4)));

        System.out.println("----Sorted by rating----");
        Collections.sort(list, new RatingComparator());
        list.stream().forEach(m -> System.out
                .println("Movie = " + m.getName() + ", rating = " + m.getRating() + ", year = " + m.getYear()));

        System.out.println("----Sorted by name-----");
        Collections.sort(list, new NameComparator());
        list.stream().forEach(m -> System.out
                .println("Movie = " + m.getName() + ", rating = " + m.getRating() + ", year = " + m.getYear()));

        System.out.println("----Sorted by date-----");
        Collections.sort(list);
        list.stream().forEach(m -> System.out
                .println("Movie = " + m.getName() + ", rating = " + m.getRating() + ", year = " + m.getYear()));
    }

}
