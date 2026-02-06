# HashMap in Java (Key–Value Store / Frequency Map)

## Definition:
A **HashMap** is a collection that stores data in **key–value pairs**.  
Each key is **unique**, and each key maps to exactly one value.  
It is commonly used to **count occurrences** or **store mappings** like dictionaries.

HashMap belongs to the `java.util` package.

---

## When to Use:
Use a **HashMap** when:
- You need to store data in **key–value** form
- You want to **count things** (frequency counting)
- Fast lookup of values using keys is required

**Example:**  
`Color → Count` (Red → 4 socks)

---

## Syntax (Usage in main method):

```java
import java.util.HashMap;

HashMap<String, Integer> map = new HashMap<>();
```
## Commonly Used Methods:
### 1. put()
  map.put(key, value)
  Stores a key–value pair in the HashMap.

  map.put("Apple", 3);
  
### 2. get()
  map.get(key)
  Returns the value associated with the key.
  
  int count = map.get("Apple");
  
### 3. containsKey()
  map.containsKey(key)
  Checks whether the specified key exists in the map.
  
  boolean exists = map.containsKey("Apple");
  
### 4. remove()
  map.remove(key)
  Removes the key–value pair from the map.
  
  map.remove("Apple");
  
### 5. size()
  map.size()
  Returns the number of key–value pairs in the map.
  
  int size = map.size();
  
Java 8 Pro Tip (Frequency Counting):
map.put(key, map.getOrDefault(key, 0) + 1);
💡 This single line is commonly used to count frequencies efficiently.
