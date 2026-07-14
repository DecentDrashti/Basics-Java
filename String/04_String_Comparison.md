# String Comparison in Java

There are three common ways to compare Strings in Java:

1. `==` Operator
2. `equals()` Method
3. `equalsIgnoreCase()` Method

---

## 1. `==` Operator

- Compares the **memory address (reference)** of two String objects.
- It checks whether both variables point to the **same object in memory**.

---

## 2. `equals()` Method

- Compares the **actual content (value)** of two Strings.
- Returns `true` if both Strings contain the same sequence of characters.

---

## 3. `equalsIgnoreCase()` Method

- Also compares the **content** of two Strings.
- Ignores uppercase and lowercase differences while comparing.

---

# Example Program

```java
public class String_Comparison {

    public static void main(String[] args) {

        String s1 = "Java";
        String s2 = "Java";
        String s3 = new String("Java");
        String s4 = "JAVA";

        System.out.println("Using == operator");
        System.out.println("s1 == s2 : " + (s1 == s2));
        System.out.println("s1 == s3 : " + (s1 == s3));

        System.out.println();

        System.out.println("Using equals()");
        System.out.println("s1.equals(s2) : " + s1.equals(s2));
        System.out.println("s1.equals(s3) : " + s1.equals(s3));
        System.out.println("s1.equals(s4) : " + s1.equals(s4));

        System.out.println();

        System.out.println("Using equalsIgnoreCase()");
        System.out.println("s1.equalsIgnoreCase(s4) : "
                + s1.equalsIgnoreCase(s4));

    }
}
```

---

# Output

```text
Using == operator
s1 == s2 : true
s1 == s3 : false

Using equals()
s1.equals(s2) : true
s1.equals(s3) : true
s1.equals(s4) : false

Using equalsIgnoreCase()
s1.equalsIgnoreCase(s4) : true
```

---

# Explanation

## `s1 == s2`

```java
String s1 = "Java";
String s2 = "Java";
```

Both variables refer to the **same String object**.

```text
        s1
         │
         ▼
      "Java"
         ▲
         │
        s2
```

Therefore,

```java
s1 == s2
```

returns

```text
true
```

---

## `s1 == s3`

```java
String s3 = new String("Java");
```

Using the `new` keyword always creates a **new String object**.

```text
s1 ─────► "Java"

s3 ─────► "Java"
```

Although both objects contain the same text (`"Java"`), they are stored at different memory locations.

Therefore,

```java
s1 == s3
```

returns

```text
false
```

---

## `s1.equals(s2)`

```java
s1.equals(s2)
```

Both Strings contain the same value.

Result:

```text
true
```

---

## `s1.equals(s3)`

```java
s1.equals(s3)
```

Even though they are different objects, their content is the same.

Result:

```text
true
```

---

## `s1.equals(s4)`

```java
String s4 = "JAVA";
```

Java compares Strings **character by character**.

```text
Java
JAVA

J == J ✔
a != A ✖
```

Since lowercase `a` and uppercase `A` are different characters,

Result:

```text
false
```

---

## `s1.equalsIgnoreCase(s4)`

`equalsIgnoreCase()` ignores uppercase and lowercase differences.

```text
Java
JAVA
```

Both Strings are treated as equivalent.

Result:

```text
true
```

---

# Summary Table

| Comparison Method | Compares | Case Sensitive | Result |
|------------------|----------|:--------------:|--------|
| `==` | Memory reference (object location) | N/A | `true` only if both variables refer to the same object |
| `equals()` | String content | ✅ Yes | `true` if the content is the same |
| `equalsIgnoreCase()` | String content | ❌ No | `true` if the content is the same, ignoring case |

---

# 💡 Key Points

- `==` compares **references (memory addresses)**.
- `equals()` compares the **actual content** of Strings.
- `equalsIgnoreCase()` compares the **content without considering letter case**.
- In most real-world applications, use `equals()` to compare String values.

---

# ⚠️ Common Mistake

### ❌ Incorrect

```java
if (username == "Admin") {
    System.out.println("Welcome Admin");
}
```

The `==` operator compares object references, **not the actual text**.

---

### ✅ Correct

```java
if (username.equals("Admin")) {
    System.out.println("Welcome Admin");
}
```

---

### ✅ Best Practice

To avoid a `NullPointerException` when `username` might be `null`, write:

```java
if ("Admin".equals(username)) {
    System.out.println("Welcome Admin");
}
```

This is considered a safer and recommended approach.
