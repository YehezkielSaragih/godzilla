//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    fun calculateStats(numbers: List<Int>): Map<String, Any> {
        if (numbers.isEmpty()) {
            return mapOf(
                "Total" to 0 as Any,
                "Rata-rata" to 0.0 as Any,
                "Max" to "N/A" as Any,
                "Min" to "N/A" as Any
            )
        }
        var total = 0
        var max = numbers[0]
        var min = numbers[0]
        for (num in numbers) {
            total += num
            if (num > max) max = num
            if (num < min) min = num
        }
        val average = total.toDouble() / numbers.size
        return mapOf(
            "Total" to total,
            "Rata-rata" to average,
            "Max" to max,
            "Min" to min
        )
    }
    println("\nNo1")
    val no1 = listOf<Int>(70, 85, 90, 60)
    println("List ${no1}")
    val stats = calculateStats(no1)
    stats.forEach { (key, value) ->
        println("$key = $value")
    }

    fun printTriangleStar(n: Int){
        if(n<1) return println("No triangle star can be made from ${n}")
        println("Triangle star from ${n}")
        for (i in 1..n) {
            for (j in 1..i) {
                print("*")
            }
            println()
        }
    }
    println("\nNo2")
    printTriangleStar(5)

    fun isPalindrome(text: String): Boolean {
        return text == text.reversed()
    }
    println("\nNo3")
    println("level is palindrome ${isPalindrome("level")}")
    println("kotlin is palindrome ${isPalindrome("level")}")

    fun findSecondLargest(numbers: List<Int>): Int? {
        if (numbers.size < 2) return null
        var max1 = 0
        var max2 = 0
        for (num in numbers) {
            if (num > max1) {
                max2 = max1
                max1 = num
            } else if (num > max2 && num < max1) {
                max2 = num
            }
        }
        return if (max2 == Int.MIN_VALUE) null else max2
    }
    println("\nNo4")
    val no3 = listOf<Int>(10, 30, 20, 50, 40)
    println("List [${no3}] second largest is ${findSecondLargest(no3)}")

    fun countWords(sentence: String): Int {
        if (sentence.isBlank()) return 0
        var count = 1
        for (ch in sentence) {
            if (ch == ' ') {
                count++
            }
        }
        return count
    }
    println("\nNo5")
    val no5 = "Belajar Kotlin itu mudah"
    println("${no5} -> ${countWords(no5)}")

    fun addMatrix(A: Array<IntArray>, B: Array<IntArray>): Array<IntArray>? {
        // Check Input
        if (A.size != B.size) {
            println("Matrix row doesn't matched")
            return null
        }
        // Check column size
        for (i in 0 until A.size) {
            if (A[i].size != B[i].size){
                println("Matrix column doesn't matched")
                return null
            }
        }
        // Setup result size
        val rows = A.size
        val cols = A[0].size
        val result = Array(rows) { IntArray(cols) }
        // Logic
        for (i in 0 until rows) {
            for (j in 0 until cols) {
                result[i][j] = A[i][j] + B[i][j]
            }
        }
        return result
    }
    fun printMatrix(matrix: Array<IntArray>) {
        for (row in matrix) {
            for (value in row) {
                print("$value ")
            }
            println()
        }
    }
    println("\nNo6")
    val no6a = arrayOf(
        intArrayOf(1, 2, 3),
        intArrayOf(4, 5, 6)
    )
    println("Matrix A:")
    printMatrix(no6a)
    val no6b = arrayOf(
        intArrayOf(7, 8, 9),
        intArrayOf(1, 2, 3)
    )
    val no6 = addMatrix(no6a, no6b)
    println("Matrix B:")
    printMatrix(no6b)
    if (no6 != null) {
        println("Matrix A + Matrix B =")
        printMatrix(no6)
    }
}