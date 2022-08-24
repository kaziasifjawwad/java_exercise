package Code_With_Mosh.Advancd.Stream.Reducer;

import Code_With_Mosh.Advancd.Stream.Impreative_Vs_Functional_Programming.Movie;

import java.util.Comparator;
import java.util.List;

public class ReducerDemo {
    public static void main(String[] args) {

        var movies = List.of(
                new Movie(10, "a"),
                new Movie(10, "a"),
                new Movie(20, "b"),
                new Movie(20, "b"),
                new Movie(30, "c")
        );


        System.out.println(movies.stream()
                .anyMatch(m -> m.getLikes() > 20)
        );


        System.out.println(movies.stream()
                .allMatch(m -> m.getLikes() > 20)
        );


        System.out.println(movies.stream()
                .noneMatch(m -> m.getLikes() > 20)
        );


        System.out.println(movies.stream()
                .findFirst()
                .get()
        );


        System.out.println(movies.stream()
                .findAny()
                .get()
        );


        System.out.println(movies.stream()
                .max(Comparator.comparing(Movie::getLikes))
                .get()
        );


        System.out.println(
                movies.stream().count()
        );



    }
}
