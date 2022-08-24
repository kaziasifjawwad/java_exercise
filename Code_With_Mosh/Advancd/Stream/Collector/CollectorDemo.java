package Code_With_Mosh.Advancd.Stream.Collector;

import Code_With_Mosh.Advancd.Stream.Impreative_Vs_Functional_Programming.Movie;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectorDemo {
    public static void main(String[] args) {
        var movies = List.of(
                new Movie(10, "a"),
                new Movie(10, "b"),
                new Movie(20, "c"),
                new Movie(20, "d"),
                new Movie(30, "e")
        );

        var result = movies.stream()
                .filter(m -> m.getLikes() > 5)
                .collect(Collectors.toMap(
                        Movie::getTitle, Function.identity()
                ));
        
        System.out.println(result);
    }
}
