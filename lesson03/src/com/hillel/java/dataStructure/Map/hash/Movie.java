package com.hillel.java.dataStructure.Map.hash;

import java.util.Objects;

/**
 * Created by Ramzes on 13.05.2015.
 */
public class Movie {
    private int year;
    private String name;
    private Long budget;


    public Movie(int year, String name,Long budget) {
        this.year = year;
        this.name = name;
        this.budget = budget;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "year=" + year +
                ", name='" + name + '\'' +
                ", budget=" + budget +
                '}';
    }

/* by hand
    @Override
    // use for hashCode contract
    public boolean equals(Object obj) {
        if (!(obj instanceof Movie)) {
            return false;
        }

        Movie other = (Movie) obj;
        return this.year == other.year && name.equals(other.name);
    }


    //for hash set
    @Override
    public int hashCode() {
        //return year+name.hashCode();
    }
    */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Movie movie = (Movie) o;

        if (year != movie.year) return false;
        if (!name.equals(movie.name)) return false;
        return budget.equals(movie.budget);

    }

    @Override
    public int hashCode() {
        int result = year;
        result = 31 * result + name.hashCode();
        result = 31 * result + budget.hashCode();
        return result;
    }
}
