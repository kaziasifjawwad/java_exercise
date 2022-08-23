package Code_With_Mosh.Advancd.Stream.Filtering_Elements;

import Code_With_Mosh.Advancd.Stream.Impreative_Vs_Functional_Programming.Movie;

import java.util.List;
import java.util.function.Predicate;

public class StreamDemo {
    public static void main(String[] args) {
        var movies = List.of(
                new Movie(10,"a"),
                new Movie(20,"20"),
                new Movie(30,"c")
        );

        Predicate<Movie> isPresicate =   m-> m.getLikes()>10;

        movies.stream()
                .filter(isPresicate)
                .forEach(m-> System.out.println(m.getTitle()));
    }
}
