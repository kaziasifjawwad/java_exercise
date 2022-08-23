package Code_With_Mosh.Advancd.Stream.Creating_A_Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class CreatingStreamDemo {
    public static void main(String[] args) {
        var list = new ArrayList<>();
        int[] numbers = {1,2,3,4,5,6};
        Arrays.stream(numbers).forEach(n-> System.out.println(n));

        Stream.of(1,2,3,4,5,6,7,8,9,10);

        //Infinite number of random number
        //lazy evaluation
        var stream = Stream.generate(()->Math.random());
        stream.limit(5).forEach(x-> System.out.println(x));

        //Another approach to generate infinite number
        Stream.iterate(1, n->n+1)
                .limit(20)
                .forEach(n-> System.out.println(n));
    }
}
