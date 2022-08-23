package Code_With_Mosh.Advancd.Stream.Impreative_Vs_Functional_Programming;

import java.util.List;

public class StreamsDemo {
    public static void main(String[] args) {
        List<Movie> movies = List.of(
                new Movie(10,"a"),
               new Movie(15,"b"),
                new Movie(20,"c")
        );

        //Imperative programming
        int count1 =0;
        for(var movie  : movies)
            if(movie.getLikes()>10)
                count1++;

        //Declarative programming
        var count2 = movies.stream()
                .filter(movie-> movie.getLikes()>10)
                .count();
    }
}
