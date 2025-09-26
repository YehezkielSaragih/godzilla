fun main(){

    // Bagian 1
    println("Bagian 1")
    val studentName: String = "Yehezkiel"
    println("Student Name: $studentName")
    val age: Int = 22
    println("Age: $age")
    val temperature: Float = 36.7f
    println("Temperature: $temperature")
    val isGraduated: Boolean = false
    println("Graduated: $isGraduated")
    val grade: Char = 'A'
    println("Grade: $grade")

    // Bagian 2
    println("\nBagian 2")
    val population: Long = 273_000_000
    val smallNumber: Short = 32000
    val tinyValue: Byte = 127
    println("Population: $population, Small Number: $smallNumber, Tiny Value: $tinyValue")

    // Bagian 3
    println("\nBagian 3")
    var nickname: String? = null
    println("Nickname (awal): $nickname")
    nickname = "Yehez"
    println("Nickname (setelah diisi): $nickname")

    // Bagian 4
    println("\nBagian 4")
    // Array
    val numbers = arrayOf(1, 2, 3, 4, 5)
    println("Array numbers:")
    for (num in numbers) {
        println(num)
    }
    // List
    val listOfFruits: List<String> = listOf("Apple", "Banana", "Mango")
    println("List: $listOfFruits")
    // Mutable list
    val mutableListOfScores: MutableList<Int> = mutableListOf(80, 85, 90)
    mutableListOfScores.add(95)
    println("Mutable List: $mutableListOfScores")
    // Set
    val setOfNumbers = setOf(1, 2, 2, 3, 3, 4)
    println("Set: $setOfNumbers")
    println("Set otomatis menghapus elemen duplikat.")
    // Map
    val mapOfStudent = mapOf("Math" to 90, "Science" to 85)
    println("Map:")
    for ((subject, score) in mapOfStudent) {
        println("$subject: $score")
    }

    // Bagian 5
    println("\nBagian 5")
    val city = "Jakarta"
    val year = 2025
    val pi = 3.14159
    println("City: $city, Year: $year, Pi: $pi")
    var isLoggedIn = false
    println("Before: $isLoggedIn")
    isLoggedIn = true
    println("After: $isLoggedIn")
    val charList: Array<Char> = arrayOf('Y', 'E', 'H', 'E', 'Z', 'K', 'I', 'E', 'L')
    println("Char List: ${charList.joinToString(" ")}")

    // Bagian 6
    println("\nBagian 6")
    val studentInfo: MutableMap<String, Any> = mutableMapOf(
        "name" to "Yehezkiel",
        "age" to 22,
        "score" to 92.5
    )
    studentInfo["isGraduated"] = false
    println("Student Info: $studentInfo")
    val grades = arrayOf('A', 'B', 'C', 'D', 'E')
    println("First grade: ${grades.first()}, Last grade: ${grades.last()}")
    val hobbies = mutableListOf("Gym", "Badminton", "Billiards")
    hobbies.remove("Billiards")
    println("Hobbies: $hobbies")
}