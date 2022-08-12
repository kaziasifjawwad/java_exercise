# Be the compiler
***
Each of the Java files on this page represents a complete source file.
Your job is to play compiler and determine whether each of these files
will compile. If they won’t compile, how would you fix them?

## A
```java
class Exercise1a {
    public static void main(String[] args) {
        int x = 1;
        while (x < 10) {
            if (x > 3) {
                System.out.println("big x");
                }
            }
        }
    }
```

## `Solution`
There is a while loop in the above code. 
The loop starts with the value of x = 1 and the condition is `while(x<10)`
However the loops did not stop thus causes an infinite loop condition. So the modified
code whould be like this :

```java
class Exercise1a {
    public static void main(String[] args) {
        int x = 1;
        while (x < 10) {
            if (x > 3) {
                System.out.println("big x");
            }
            x++;
        }
    }
}
```
The output whould be like this :

| Output |
|:------:|
| big x  |
| big x  |
| big x  |
| big x  |
| big x  |



## B
```java
class Exercise1c {
    int x = 5;
    while (x > 1) {
        x = x - 1;
        if (x < 3) {
            System.out.println("small x");
        }  
    }
}
```
## `Solution`
This above  class does not any method. To execute this code properly we need at least
one method that describes all the logic and return condition. Or, we have to
 write the code inside the main method. The modified code would be like this :

```java
class Exercise1c {
    public static void main(String[] args) {
        int x = 5;
        while (x > 1) {
            x = x - 1;
            if (x < 3) {
                System.out.println("small x");
            }
        }
    }
}
```
The output would be like this :

| Output |
|:------:|
| small x  |
| small x  |
