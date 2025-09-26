//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    fun calculateRectangleArea(length: Int, width: Int): Int{
        return length * width
    }
    println(calculateRectangleArea(8,5))

    fun checkEvenOdd(number: Int): String{
        return if(number % 2 == 0) "Genap" else "Ganjil"
    }
    println(checkEvenOdd(7))

    fun sayHi(name: String = "Guest"){
        println("Hi ${name}")
    }
    sayHi()
    sayHi("Andi")

    fun square(n: Int) = n * n
    println(square(9))

    fun sumList(numbers: List<Int>): Int{
        return numbers.sum()
    }
    val numbers = listOf(1, 2, 3, 5)
    println(sumList(numbers))
}