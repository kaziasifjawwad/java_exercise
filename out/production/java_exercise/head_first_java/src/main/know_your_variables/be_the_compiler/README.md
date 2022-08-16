### Each of the Java files on this page represents a complete source file. Your job is to play compiler and determine whether each of these files will compile and run without exception. If they won’t, how would you fix them?

```java
class Books {
    String title;
    String author;
}

class BooksTestDrive {
    public static void main(String[] args) {
        Books[] myBooks = new Books[3];
        int x = 0;
        myBooks[0].title = "The Grapes of Java";
        myBooks[1].title = "The Java Gatsby";
        myBooks[2].title = "The Java Cookbook";
        myBooks[0].author = "bob";
        myBooks[1].author = "sue";
        myBooks[2].author = "ian";
        while (x < 3) {
            System.out.print(myBooks[x].title);
            System.out.print(" by ");
            System.out.println(myBooks[x].author);
            x = x + 1;
        }
    }
}
```
### `Solution`
***
There are two classes in the above code.
- Books
- BooksTestDrive

> #### Books
> This class contains two attributes.
> - title  [String]
> - author [String]

Now, On the BooksTestDrive  class, there is a  main function that 
mainly initialize the code.
In this main method, an array of type Books was declared with size 3. This will create
an empty array of Book with length 3. Each slot of this array will be initialized with
null value.So, the myBooks array would look something like this :

```java
myBooks = {null, null, null, null};
```
If we access any of the value of this array, it will return us null value. Now,
when we will try to execute any of this statement,
```java
 myBooks[0].title = "The Grapes of Java";
```
What actually happen would be something like this :
```java
 null.title = "The Grapes of Java";
```
This will throw a nullpoint exception. Since null type does not have anything known as `title`