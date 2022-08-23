package Code_With_Mosh.Advancd.Stream.Mpping_Element;

import Code_With_Mosh.Advancd.Stream.Impreative_Vs_Functional_Programming.Movie;

import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {

        var movies = List.of(
                new Movie(10, "a"),
                new Movie(20, "b"),
                new Movie(30, "c")
        );

        movies.stream()
                .map(movie -> movie.getTitle())
                .forEach(name -> System.out.println(name));

        var stream = Stream.of(
                List.of(1, 2, 3),
                List.of(4, 5, 6)
        );
    }

}
