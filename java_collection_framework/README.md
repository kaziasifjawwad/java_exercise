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
|         `add(int index, E e)`         | It will add an element at the index position of the collection. `                                                                                                                                                         |
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

