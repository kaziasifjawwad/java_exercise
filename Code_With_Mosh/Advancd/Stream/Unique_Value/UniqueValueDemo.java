package Code_With_Mosh.Advancd.Stream.Unique_Value;

import Code_With_Mosh.Advancd.Stream.Impreative_Vs_Functional_Programming.Movie;

import java.util.Comparator;
import java.util.List;

public class UniqueValueDemo {
    public static void main(String[] args) {

        var movies = List.of(
                new Movie(10, "a"),
                new Movie(10, "a"),
                new Movie(20, "b"),
                new Movie(20, "b"),
                new Movie(30, "c")
        );

        movies.stream()
                .map(Movie::getLikes)
                .distinct()
                .forEach(System.out::println);

    }
}
