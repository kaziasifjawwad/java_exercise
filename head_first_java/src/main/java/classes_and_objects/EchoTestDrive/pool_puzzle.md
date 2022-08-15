# Pool Puzzle

<p align="center">
  <img src="../../../resources/img_pp_1.png" />
</p>

> Your job is to take code snippets from the pool and place them into the blank
lines in the code. You may use the same snippet more than once, and you
won’t need to use all the snippets. Your goal is to make classes that will
compile and run and produce the output listed below. Some of the exercises
and puzzles in this book might have more than one correct answer. If you find
another correct answer, give yourself bonus points!
> Output
> ![img.png](../../../resources/img_pp_2.png)
![img.png](../../../resources/img_pp_3.png)
![img.png](../../../resources/img_pp_4.png)

# `Solution`
```java

public class EchoTestDrive {
    public static void main(String[] args) {
        Echo e1 = new Echo();
        Echo e2 = new Echo();
        int x = 0;
        while (x < 4) {
            e1.hello();
            e1.count = e1.count + 1;
            if (x == 3) {
                e2.count = e2.count + 1;
            }
            if (x > 0) {
                e2.count = e2.count + e1.count;
            }
            x = x + 1;
        }
        System.out.println(e2.count);
    }
}

class Echo {
    int count = 0;

    void hello() {
        System.out.println("helloooo... ");
    }
}
```
