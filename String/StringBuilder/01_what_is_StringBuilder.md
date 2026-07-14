# StringBuilder in Java

## What is StringBuilder?

`StringBuilder` is a class in Java used to create and modify strings efficiently.

Unlike `String`, a `StringBuilder` object is **mutable**, which means its content **can be changed without creating a new object**.

It is mainly used when a string needs to be modified multiple times, such as appending, inserting, deleting, or replacing characters.

---

## Why do we need StringBuilder?

We already know that **Strings are immutable**.

Consider the following example:

```java
String str = "Hello";

str = str + " Java";
str = str + " Programming";
str = str + " Language";
```

Every time a new value is assigned:

- A **new String object** is created.
- The old String object remains unchanged.
- This consumes extra memory and decreases performance.

To avoid creating multiple String objects, Java provides the `StringBuilder` class.

---

## String vs StringBuilder

| Feature | String | StringBuilder |
|----------|---------|---------------|
| Mutable | ❌ No | ✅ Yes |
| Performance | Slower for frequent modifications | Faster |
| Thread Safe | Yes | No |
| Memory Usage | Creates multiple objects | Modifies the same object |

---

# Creating a StringBuilder

## Syntax

```java
StringBuilder sb = new StringBuilder();
```

You can also initialize it with a value.

```java
StringBuilder sb = new StringBuilder("Hello");
```

---

# Example Program

```java
public class StringBuilder_Demo {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Hello");

        System.out.println("Original String : " + sb);

        sb.append(" Java");

        System.out.println("After append() : " + sb);
    }
}
```

---

# Output

```text
Original String : Hello
After append() : Hello Java
```

---

# Common Methods of StringBuilder

## 1. append()

Adds text at the end of the existing String.

### Example

```java
StringBuilder sb = new StringBuilder("Java");

sb.append(" Programming");

System.out.println(sb);
```

### Output

```text
Java Programming
```

---

## 2. insert()

Inserts text at a specified position.

### Example

```java
StringBuilder sb = new StringBuilder("Jva");

sb.insert(1, "a");

System.out.println(sb);
```

### Output

```text
Java
```

---

## 3. replace()

Replaces characters between two indexes.

### Example

```java
StringBuilder sb = new StringBuilder("Hello Java");

sb.replace(6, 10, "World");

System.out.println(sb);
```

### Output

```text
Hello World
```

---

## 4. delete()

Deletes characters between two indexes.

### Example

```java
StringBuilder sb = new StringBuilder("Hello Java");

sb.delete(5, 10);

System.out.println(sb);
```

### Output

```text
Hello
```

---

## 5. reverse()

Reverses the String.

### Example

```java
StringBuilder sb = new StringBuilder("Java");

sb.reverse();

System.out.println(sb);
```

### Output

```text
avaJ
```

---

## 6. length()

Returns the number of characters.

### Example

```java
StringBuilder sb = new StringBuilder("Programming");

System.out.println(sb.length());
```

### Output

```text
11
```

---

## 7. charAt()

Returns the character at a specified index.

### Example

```java
StringBuilder sb = new StringBuilder("Java");

System.out.println(sb.charAt(2));
```

### Output

```text
v
```

---

## Memory Illustration

### String

```text
String s = "Hello";

s = s + " Java";
```

```
s
│
▼
"Hello"

↓

New Object Created

s
│
▼
"Hello Java"
```

A **new object** is created every time the String is modified.

---

### StringBuilder

```java
StringBuilder sb = new StringBuilder("Hello");

sb.append(" Java");
```

```
sb
│
▼
"Hello"

↓

Same Object Modified

sb
│
▼
"Hello Java"
```

The **same object** is modified, making it faster and more memory-efficient.

---

# Advantages of StringBuilder

- Mutable (modifiable).
- Faster than String for repeated modifications.
- Uses less memory because it modifies the same object.
- Provides many useful methods such as `append()`, `insert()`, `delete()`, `replace()`, and `reverse()`.

---

# When Should We Use StringBuilder?

Use `StringBuilder` when:

- Appending text repeatedly.
- Generating reports.
- Building SQL queries.
- Reading and modifying file content.
- Performing frequent string manipulations inside loops.

If the text never changes, use a normal **String**.

---

# 💡 Key Points

- `String` is **immutable**.
- `StringBuilder` is **mutable**.
- `append()` modifies the existing object.
- `StringBuilder` is faster than `String` for multiple modifications.
- `StringBuilder` is **not thread-safe**.

---

# ⚠️ Common Mistake

### ❌ Using String for repeated modifications

```java
String str = "";

for (int i = 1; i <= 1000; i++) {
    str += i;
}
```

This creates **1000+ String objects**.

### ✅ Better Approach

```java
StringBuilder sb = new StringBuilder();

for (int i = 1; i <= 1000; i++) {
    sb.append(i);
}

System.out.println(sb);
```

This modifies the **same object**, making the program much faster and more memory-efficient.
