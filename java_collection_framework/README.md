### Java Collection framework

![img.png](rsource/java_collection_map.png)

#### Important interface of collection framework .
Classes and interfaces of java collection framework are present
in ```java.util``` package.<br>
Let us know about collection interface.<br>
`This classes and interfaces are generic . So they will support andy
object or class.`


|             method             | Description                                                                                                                                       |
|:------------------------------:|---------------------------------------------------------------------------------------------------------------------------------------------------|
|           `add(E e)`           | It will add an element.<br/>It can be object of any class                                                                                         |
|   `addAll(Collection<E> c)`    | We can pass another collection object contains.                                                                                                   |
|       `remove(Object c)`       | It will remove the object from the collection.<br/>It will return boolean result. If the object is removed, <br/>it will return true, else false. |
|  `removeAll(Collection<E> c`   | It will remove all the element of the collection `c`.                                                                                             |
|  `retainAll(Collection<E> c`   | In contrast to `removeAll(Collection<E> c)`. That means, remove all the objects except the objects of `c`.                                        |
|           `clear()`            | It will remove all the elements of the collection. The collection will be empty.                                                                  |
|          `isEmpty()`           | It will check if the collection is empty or not.                                                                                                  |
|      `contains(object o)`      | It will check of the object `c` is present or not in the collection.                                                                              |
| `containsAll(Collection<E> c)` | It will check if all the element of collection `c` is present or not in the collection.                                                           |
|            `size()`            | Returns the size of the collection.                                                                                                               |
|          `iterator()`          | It returns an interface of iterator.                                                                                                              |
|          `toArray()`           | It will return an array contains all the element of the collection.                                                                               |









### List interface

```java
interface List extends Collection
```
List represents ordered collection of elements, means there should be index number. It also supports duplicate 
element.
`List interface extends from collection interface.`  So, whatever methods are presented in collection 
interface are also presented in list interface and some additional extra method. 

|                method                 | Description                                                                                                                                                                                                               |
|:-------------------------------------:|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
|         `add(int index, E e)`         | It will add an element at the index position of the collection.                                                                                                                                                           |
| `addAll(int index, Collecttion<E> e)` | It will add a collection of elements at the index position of the collection.                                                                                                                                             |
|          `remove(int index)`          | used to remove an element from the specified index from a List container and returns the element after removing it                                                                                                        |
|           `get(int index)`            | used to get and element from the specified index. It does not delete or modify the object.                                                                                                                                |
|         `set(int index, E e)`         | It will replace the element at the specified index with new element `e`.                                                                                                                                                  |
|      `sublist(int from, int to)`      | It will return a list of objects that are situated in between `from` and `to`.                                                                                                                                            |
|          `indexOf(Object o)`          | It will return the index of the object `o` from the list. If the object is not present in the list, it will return `-1`. This will start searching from left to right side.                                               |
|        `lastIndexOf(Object o)`        | Let's say I have duplicate element in my list. In this case there should be multiple index of the same element.This method will return the last index of this element. This will start searching from right to left side. |
|           `listIterator()`            | `iterator()` from the collection interface allows us to access the element from left to right side. On the other hand, `listIterator()` allows us to access the element in both direction.                                |
|       `listIterator(int index)`       | It allows us to access the element from any any index.                                                                                                                                                                    |


## Set interface
The set interface does not have any additional method. It only extends the Collection interface.
```java
interface Set extends Collection
```
|              Set               |
|:------------------------------:|
| Unordered collection of object |
|  Unique collection of object   |


## Queue interface
This interface supports `FIFO` mechanism. First in first out mechanism. So, elements and objects
are inserted in one end, and deleted in another end. 

|                  method                  | Description                                                                                                                                                            |
|:----------------------------------------:|------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
|                `add(E e)`                | It will add new element. It will not ask the index number because it needs to maintain fifo mechanism. So, it will add the new element at the end of the last element. |
|                 `poll()`                 | It will remove the first object only. If the queue is empty , this method will return `null` .                                                                         |
| `remove() throws NoSuchElementException` | Same mechanism as poll() except it will throw exception if the queue is empty.                                                                                         |
|                 `peek()`                 | Return the first element of the queue. It will not remove or modify the element. If the queue is empty, it will return null.                                           |
|            `element() throws`            | Same as peek except it will throw exception if the queue is empty.                                                                                                     |


## ArrayList in java
Let us see a demonstration of ArrayList in java. We need to create an object of `ArrayList` first.

```java
import java.util.ArrayList;
public class ListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> al1  = new ArrayList<>();
    }
}
```
As the ArrayList is a generic class, we can define what type of data the list should contain.
I've defined Integer in my list. If we want to store primitive type of data, we should use wrapper 
class for this.

If we want to initialize the size of an arraylist, we can pass the size in the constructor as well.

```java
import java.util.ArrayList;
public class ListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> al1  = new ArrayList<>(50);
    }

}
```

> let us store some data in this arraylist.

```java
import java.util.ArrayList;
public class ListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> al1  = new ArrayList<>(50);
        al1.add(10);
        al1.add(45);
        al1.add(55);
        al1.add(65);
        System.out.println(al1);
    }
}
```
The output of this above could is :<br>
`[10, 45, 55, 65]`

we can also define the index number before adding any element.
```java
import java.util.ArrayList;
public class ListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> al1  = new ArrayList<>(50);
        al1.add(10);
        al1.add(45);
        al1.add(55);
        al1.add(65);
        al1.add(0,59);
        System.out.println(al1);
    }
}
```
The output of this above could is :<br>
`[59, 10, 45, 55, 65]`

We can see that 59 is inserted at 0th index of the al1 arraylist.

We also have `addAll` method that will add all the element of another arraylist. Let's create
an additional arraylist.
```java
import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> al1  = new ArrayList<>(50);

        ArrayList<Integer> al2 = new ArrayList<>(
                List.of(88,99,66,55,44)
        );
        al1.add(10);
        al1.add(45);
        al1.add(55);
        al1.add(65);
        al1.add(0,59);
        al1.addAll(al2);
        System.out.println(al1);
    }
}
```
We've created an arraylist named `al2`.Then we added this arraylist in our previous arraylist
al1 using `allAll` method.

The output will be look like this :

`[59, 10, 45, 55, 65, 88, 99, 66, 55, 44]`

If we wanted to add this arraylist at any index number, we could use this method :
```java
import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> al1  = new ArrayList<>(50);

        ArrayList<Integer> al2 = new ArrayList<>(
                List.of(88,99,66,55,44)
        );
        al1.add(10);
        al1.add(45);
        al1.add(55);
        al1.add(65);
        al1.add(0,59);
        al1.addAll(5,al2);
        System.out.println(al1);
    }
}
```
Now the output will look like this :

`[59, 10, 88, 99, 66, 55, 44, 45, 55, 65]`

We can also check if any element is present in this list or not.
```java
al1.contains(989)
```
this will return false as 989 is not present in the list.

### Using iterator to iterate through the list
If we want to iterate through a list, we can use iterator to do the job.
```java
import java.util.ArrayList;
import java.util.Iterator;

public class ListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> al1  = new ArrayList<>(50);
        al1.add(10);
        al1.add(45);
        al1.add(55);
        al1.add(65);
        al1.add(0,59);

        Iterator<Integer> it = al1.iterator();
        while(it.hasNext()){
            Integer number = it.next();
            System.out.println(number);
        }
    }
}
```
The iterator is only unidirectional. If we want a bidirectional iterator, we should use `ListIteraot`
instead.

```java
public class ListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> al1  = new ArrayList<>(50);
        al1.add(10);
        al1.add(45);
        al1.add(55);
        al1.add(65);
        al1.add(0,59);
        
        ListIterator<Integer> it2 = al1.listIterator(al1.size());
        System.out.println(it2.previous());
        while(it2.hasPrevious()){
            Integer number = it2.previous();
            System.out.println(number);
        }
    }
}
```
listIterator will set the pointer to the first element if we do not pass any argument. However,
if we pass any index, it will set the pointer to that index.

## LinkedList

LinkedList have the same method as ArrayList. In this section, we will see extra two method that  linkedlist provide.

```java
import java.util.LinkedList;
public class ListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> al1  = new LinkedList<>();
        al1.add(10);
        al1.add(45);
        al1.add(55);
        al1.add(65);
        al1.add(0,59);

        System.out.println("Before adding 78 and 656 : " + al1);

        al1.addFirst(78);
        al1.addLast(656);

        System.out.println("After adding 78 and 656 : " + al1);
    }
}
```
>addFirst() method will add the element at the fist position of the linkedlis,
> on the other hand, addLast() will add the element at the last position of the linkedlist.
> The output will be look like this :

`Before adding 78 and 656 : [59, 10, 45, 55, 65]` <br>
` After adding 78 and 656 : [78, 59, 10, 45, 55, 65, 656]`

We can also get the first and the last element of the linked-list as well. 
```java
public class ListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> al1  = new LinkedList<>(
                List.of(10,45,55,65 )
        );

        al1.add(0,59);
        Integer firstElement = al1.getFirst();
        Integer lastElement = al1.getLast();
        System.out.println("first element : "+
                firstElement+
                "\nLast element : "+lastElement);
    }
}
```
output :<br>
`first element : 59` <br>
`Last element : 65`

`getFirst()` works same as like `peekFirst()` but the main difference is that, `peekfirst()` will
return `null` rather throwing `NoSuchElement` exception. This helps developer to reduce Exception
Handling while development.


