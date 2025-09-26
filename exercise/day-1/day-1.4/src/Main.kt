//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    // Bagian 1
    println("Bagian 1")
    val arr = arrayOf(70, 85, 90, 60, 75)
    fun sum(arr: Array<Int>): Int {
        var result = 0
        for (i in arr) {
            result += i
        }
        return result
    }
    println("Array = ${arr.toList()}")
    println("Array sum result = ${sum(arr)}")

    // Bagian 2
    println("\nBagian 2")
    val list = listOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println("List = ${list}")
    fun printEven(list: List<Int>){
        print("Angka genap = ")
        for (num in list){
            if(num%2==0){
                print("${num} ")
            }
        }
        println()
    }
    printEven(list)

    // Bagian 3
    println("\nBagian 3")
    val fruits = listOf("Apple", "Banana", "Mango", "Orange", "Grapes")
    println("List = ${list}")
    for (fruit in fruits) {
        if (fruit == "Mango") {
            println("Mango ditemukan!")
            break
        }
    }

    // Bagian 4
    println("\nBagian 4")
    var num = 10
    while (num >= 1) {
        print(num)
        num--
    }
    println("Selesai!")

    // Bagian 5
    println("\nBagian 5")
    val students = listOf("Andi", "Budi", "Cici", "Dedi")
    for ((index, name) in students.withIndex()) {
        println("${index + 1}. $name")
    }

}