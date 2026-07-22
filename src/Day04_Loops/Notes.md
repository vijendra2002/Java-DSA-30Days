# Day 04 - Loops

## Topics Covered

- for loop
- while loop
- do-while loop
- break statement
- continue statement
- nested loops

---

## Syntax

### for loop

```java
for (initialization; condition; update) {
    // code
}
```

### while loop

```java
while (condition) {
    // code
}
```

### do-while loop

```java
do {
    // code
} while (condition);
```

---

## Difference

### for loop

- Used when number of iterations is known.
- Initialization, condition and update are written together.

### while loop

- Used when number of iterations is not known.
- Condition is checked before execution.

### do-while loop

- Executes at least one time.
- Condition is checked after execution.

---

## break

- Exits the loop immediately.

Example:

```java
for(int i = 1; i <= 10; i++) {
    if(i == 5)
        break;

    System.out.println(i);
}
```

---

## continue

- Skips the current iteration.
- Control moves to the next iteration.

Example:

```java
for(int i = 1; i <= 5; i++) {
    if(i == 3)
        continue;

    System.out.println(i);
}
```

---

## Programs Practiced

- Print 1 to N
- Sum of N natural numbers
- Multiplication Table
- Reverse Number
- Even/Odd using loop
- break
- continue

---

## Important Interview Points

- for loop is used when iterations are fixed.
- while loop is used when iterations are unknown.
- do-while executes at least once.
- break terminates the loop.
- continue skips only one iteration.

---

## Time Complexity

- Single loop → O(n)
- Nested loop → O(n²)

---

## Doubts

-
-
-
