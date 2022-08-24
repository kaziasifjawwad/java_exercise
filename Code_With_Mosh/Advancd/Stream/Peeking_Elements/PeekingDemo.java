package Code_With_Mosh.Advancd.Stream.Peeking_Elements;

import Code_With_Mosh.Advancd.Stream.Impreative_Vs_Functional_Programming.Movie;

import java.util.List;

public class PeekingDemo {

    public static void main(String[] args) {

        var movies = List.of(
                new Movie(10, "a"),
                new Movie(20, "b"),
                new Movie(30, "c")
        );

        movies.stream()
                .filter(m->m.getLikes()>10)
                .peek(m-> System.out.println("before map -->  "+m.getTitle())) //peek
                .map(Movie::getTitle)
                .peek(m-> System.out.println("after map -->  "+m))
                .forEach(System.out::println);

    }
}
