### **Instructions:**

- For **optional questions**, select the correct answer.
- For **short answer questions**, provide a concise response.
- For **yes/no questions**, simply answer “yes” or “no.”
- For **correct-the-code questions**, review the provided code snippet, identify the mistake, and write the corrected version.

---

### **Pretest + Posttest Questions**

#### **Optional (Choose the correct answer):**

1. Which of the following is the correct way to declare a variable in Kotlin?

   **- a) `var x = 10`**
   - b) `let x = 10`
   - c) `dim x as 10`
   - d) `declare x = 10`

2. What keyword is used to declare a constant in Kotlin?

   - a) `let`
   **- b) `const`**
   - c) `final`
   - d) `val`

3. How do you define a function in Kotlin?

   - a) `function myFunction() {}`
   - b) `def myFunction() {}`
   **- c) `fun myFunction() {}`**
   - d) `lambda myFunction() {}`

4. What is the result of `5 % 2` in Kotlin?

   - a) `2.5`
   **- b) `1`**
   - c) `0`
   - d) `5`

5. Which data type in Kotlin represents a true or false value?
   - a) `Int`
   - b) `String`
   **- c) `Boolean`**
   - d) `Float`

---

#### **Short Answer:**

6. What is the difference between `var` and `val` in Kotlin?
- var bersifat mutable dimana nilainya bisa diubah.
- val bersifat immutable dimana nilainya tidak bisa diubah setelah diberikan.
7. How do you create a list in Kotlin?
- Menggunakan listOf(...) atau mutableListOf(...)
8. Write a simple `if-else` statement in Kotlin.
```
val x = 10
if (x > 5) {
    println("x lebih besar dari 5")
} else {
    println("x kurang dari atau sama dengan 5")
}
```
9. How do you handle nullability in Kotlin?
```kotlin
var name: String? = null
println(name?.length) // safe call operator
val length = name?.length ?: 0 // elvis operator
```
10. What is a lambda function in Kotlin?
- Anonymous function yang bisa disimpan dalam variabel atau dipakai langsung
11. How do you define a class in Kotlin?
```kotlin
class Person(val name:String, var age: int){
    fun greet(){
        println("Hello")
    }
}
```
12. How do you use a `for` loop to iterate through a list in Kotlin?
```kotlin
val items = listOf("apple", "banana", "cherry")
for (item in items) {
    println(item)
}
```
13. What does the `when` statement do in Kotlin?
Switch case in java
```kotlin
val x = 2
when (x) {
    1 -> println("One")
    2 -> println("Two")
    else -> println("Other")
}
```
14. How do you check if a number is even in Kotlin?
```kotlin
val number = 10
if (number % 2 == 0) {
    println("Even")
} else {
    println("Odd")
}
```
15. How do you declare an array in Kotlin?
```kotlin
val numbers = arrayOf(1, 2, 3, 4, 5)
```
---

#### **Yes/No Questions:**

16. Can `val` be reassigned to a new value after its initial assignment?
    **No**
17. Does Kotlin support operator overloading?
    **Yes**
18. Is Kotlin fully interoperable with Java?
    **Yes**
19. Can a function in Kotlin return a value using `return` keyword?
    **Yes**
20. Can Kotlin's `when` statement be used as an expression to return values?
    **Yes**
---

#### **Correct the Code (with Answers):**

21. **Incorrect code:**

    ```kotlin
    var x = "Hello" // should be using var not val when want reasigned variable
    x = "World"
    ```

22. **Incorrect code:**

    ```kotlin
    fun sum(a: Int, b: Int): Int {
        return a + b
    sum(5, 10)
    ```

    - **Correction**:

    ```kotlin
    fun sum(a: Int, b: Int): Int {
        return a + b
    }
    sum(5, 10)
    ```

23. **Incorrect code:**

    ```kotlin
    val myList = mutableListOf(1, 2, 3) // immutable when using listOf
    myList.add(4)
    ```

24. **Incorrect code:**

    ```kotlin
    val name: String? = null // nullable problem, must use ?
    ```

25. **Incorrect code:**

    ```kotlin
    if (x > 5) { // dont forget to () the if statement
        println("x is greater than 5")
    }
    ```

26. **Incorrect code:**

    ```kotlin
    when (x) {
        1 -> println("One")
        2 -> println("Two")
        else -> println("Other") // also use arrows
    }
    ```

27. **Incorrect code:**

    ```kotlin
    fun greet(name: String) { // passing parameter and dont forget the string quote
        println("Hello, $name")
    }
    ```

28. **Incorrect code:**

    ```kotlin
    val myVar = "10"
    val result = myVar.toInt() + 5 
    // add string to integer gonna make the result into string (105) except when cast the string first
    ```

29. **Incorrect code:**

    ```kotlin
    val numbers = arrayOf(1, 2, 3)
    println(numbers[2]) // error Array Index is Out of Range (index start from zero 
    ```

30. **Incorrect code:**
    ```kotlin
    class Person(val name: String, val age: Int) {
        fun greet() {
            println("Hello, my name is $name and I'm $age")
        }
    }
    ```

---

### **Story-based Question (with Failed Code)**

#### **Story:**

Imagine you are building a ticket booking system for a movie theater. Each customer can reserve a seat by providing their name and the seat number. The seat numbers are stored in an array, and the program should check if the seat is available. If available, the seat will be reserved, and if not, a message will be displayed to the user that the seat is taken.

Here’s the failed code:

```kotlin
fun reserveSeat(name: String, seatNumber: Int) {
    val availableSeats = arrayOf(1, 2, 3, 4, 5)

    if (availableSeats.contains(seatNumber)) {
        availableSeats[seatNumber] = 0  // Mark the seat as reserved by setting it to 0
        println("$name reserved seat $seatNumber.")
    } else {
        println("Seat $seatNumber is already reserved.")
    }
}

fun main() {
    reserveSeat("John", 2)
    reserveSeat("Sarah", 2)
}
```
problem
- availableSeats selalu dibuat ulang di dalam fungsi (setiap pemanggilan ulang, seat kembali tersedia.)
- availableSeats[seatNumber] = 0 salah indexing (seatNumber nilainya 2, artinya akses index ke-2 (seat ke-3)).
```kotlin
val availableSeats = listOf(1, 2, 3, 4, 5)
val reservedSeats = mutableSetOf<Int>()

fun reserveSeat(name: String, seatNumber: Int) {
    if (seatNumber in availableSeats && seatNumber !in reservedSeats) {
        reservedSeats.add(seatNumber)
        println("$name reserved seat $seatNumber.")
    } else {
        println("Seat $seatNumber is already reserved or invalid.")
    }
}

fun main() {
    reserveSeat("John", 2)
    reserveSeat("Sarah", 2)
    println("Reserved: $reservedSeats")
    println("Available: ${availableSeats - reservedSeats}")
}
```