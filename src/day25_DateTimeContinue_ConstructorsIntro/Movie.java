package day25_DateTimeContinue_ConstructorsIntro;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;

public class Movie {

    public String country, title, director;

    ArrayList<String> genre;
    public LocalDate releaseDate;
    ArrayList<String> casts;

    public Movie(String country, String title, ArrayList<String> genre, LocalDate releaseDate, ArrayList<String> casts, String director){

        this.country = country;
        this.title = title;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.casts = casts;
        this.director = director;
    }

    public void addCast(String actor){

        this.casts.add(actor);

    }

    public void addCasts(String actors){

        this.casts.addAll(Arrays.asList(actors));
    }

    public void addGenre(String genre){


        this.genre.add(genre);
    }

    public String toString(){

        return "Movie:\n" +
                "Title: " + title + '\n' +
                "Country: " + country + '\n' +
                "Director: " + director + '\n' +
                "Genres: " + genre + '\n' +
                "ReleaseDate: " + releaseDate.format(DateTimeFormatter.ofPattern("MMMM/dd/y")) +  '\n' +
                "TotalNumberOfCasts: " + casts.size() +
                "\n";

    }

    public static void main(String[] args) {

        Movie movie = new Movie("USA", "Java Developer", new ArrayList<>(Arrays.asList("Adventure", "Comedy", "Thriller")), LocalDate.of(2021,04,18), new ArrayList<>(Arrays.asList("Ozzy", "Ali", "Muhtar and 5 more students from your group")), "Kuzzat Altay" );

        System.out.println(movie);
    }

}
/*

Task04:
    1. Create a custom class named  Movie:
        Attributes:
            country, title, Genre, releaseDate, director, casts (ArrayList<String>)

        Add a constructor to set the country, title, release date, and director of the Movie

        Actions
            addCast(String): adds the given string argument to the arrayList casts
            addCasts(String[]): adds the given string array argument to the arrayList casts
            toString(): returns the name of country, title, release date, and total number of casts

    2. create a class called TestMovieObjects
            1. create an object of the movie:
                    title: Java Developer: Zero to Hero
                    country: USA
                    Genre: Adventure, Comedy, Thriller
                    release date: 04/18/2021
                    director: Kuzzat Altay
                    Casts: Ozzy, Ali, Muhtar and 5 more students from your group

        print the full info of the movie



 */