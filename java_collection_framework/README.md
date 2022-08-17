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
