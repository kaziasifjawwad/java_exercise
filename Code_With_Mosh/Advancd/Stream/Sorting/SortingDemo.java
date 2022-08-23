package Code_With_Mosh.Advancd.Stream.Sorting;

import Code_With_Mosh.Advancd.Stream.Impreative_Vs_Functional_Programming.Movie;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class SortingDemo {
    public static void main(String[] args) {

        var movies = List.of(
                new Movie(10, "a"),
                new Movie(20, "b"),
                new Movie(30, "c")
        );

        //sorting
        movies.stream()
                .sorted((a, b) -> a.getTitle().compareTo(b.getTitle()))
                .forEach(movie -> System.out.println(movie.getTitle()));

        //More simplified way

        movies.stream()
                .sorted(Comparator.comparing(m -> m.getTitle()))
                .forEach(m -> System.out.println(movies));

        //More more simplified way
        movies.stream()
                .sorted(Comparator.comparing(Movie::getTitle))
                .forEach(movie -> System.out.println(movie.getTitle()));
    }

}
