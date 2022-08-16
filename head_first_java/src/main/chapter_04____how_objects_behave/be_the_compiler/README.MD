## Be the compiler
Each of the Java files on this page represents a complete source file.
Your job is to play compiler and determine whether each of these files
will compile. If they won’t compile, how would you fix them, and if they
do compile, what would be their output?

## `A`
```java
class XCopy {
    public static void main(String[] args) {
        int orig = 42;
        XCopy x = new XCopy();
        int y = x.go(orig);
        System.out.println(orig + " " + y);
    }

    int go(int arg) {
        arg = arg * 2;
        return arg;
    }
}
```
## `Solution`
> The above code contains one class named XCopy. This class also have a main method
> and additional one public method go [contains one parameter] . In the main method
> there is a variable named `orig` which is initialized with 42. and a variable
> named x contains one instance of this class `XCopy`. in variable `y` ,
> this instance of this class `x` called it's method go and passed parameter 
> `orig` . this will return return value `84` . The last line of the main 
> method will then print result : <br><br>**42 84**

## `B`
```java
class Clock {
    String time;

    void setTime(String t) {
        time = t;
    }

    void getTime() {
        return time;
    }
}

class ClockTestDrive {
    public static void main(String[] args) {
        Clock c = new Clock();
        c.setTime("1245");
        String tod = c.getTime();
        System.out.println("time: " + tod);
    }
}
```
## `Solution`
> In the above code there are two class . `ClockTestDrive` class has a main function.
> In this main function a instance of class `Clock` was created and stored in variable
> `c` . In the second last line of this class, c was tried to call `getTime()` of
> `Clock` class. However, it tried to store a value in variable  `told`. On the
> other hand, getTime is a void method. So, it will not return anything. That's 
> why this code will throw a compiled time error.