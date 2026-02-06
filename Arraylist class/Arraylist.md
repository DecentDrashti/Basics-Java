# ArrayList in Java (Dynamic Array)

## Definition:
An **ArrayList** is a resizable array implementation in Java.  
It allows **duplicate elements**, maintains **insertion order**, and provides **index-based access**.  
It belongs to the `java.util` package.

---

## When to Use:
Use an **ArrayList** when:
- You need to store a list of elements
- You want to access elements using an **index**
- The size of the list can change dynamically

---

## Syntax (Usage in main method):

```java
import java.util.ArrayList;

ArrayList<String> list = new ArrayList<>();
```

## Commonly Used ArrayList Methods:

### 1. add() Adds an element to the end of the ArrayList. i.e. list.add(value). 

### 2. add(index, value) Inserts an element at a specific index. i.e. list.add(index, value)

### 3. get() Returns the element at the given index. i.e. list.get(index)

### 4. set() Updates the element at the specified index. i.e. list.set(index, value)

### 5. remove() Removes the element at the given index. i.e. list.remove(index)

### 6. size() Returns the number of elements in the ArrayList. i.e. list.size()

### 7. contains() Checks whether an element exists in the ArrayList. i.e. list.contains(value)

### 8. clear() Removes all elements from the ArrayList. i.e.list.clear()
