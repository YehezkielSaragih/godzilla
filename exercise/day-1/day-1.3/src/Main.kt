fun main() {

    // Bagian 1
    println("\nBagian 1")
    val score = 82
    print("Nilai $score adalah ")
    if (score >= 90) {
        println("Nilai A")
    } else if (score >= 75) {
        println("Nilai B")
    } else if (score >= 60) {
        println("Nilai C")
    } else {
        println("Tidak lulus")
    }

    // Bagian 2
    println("\nBagian 2")
    fun oddEven(num: Int): String {
        return if (num % 2 == 0) {
            "Genap"
        } else {
            "Ganjil"
        }
    }
    print("Masukkan angka: ")
    val input = readln().toInt()
    println("$input adalah ${oddEven(input)}")

    // Bagian 3
    println("\nBagian 3")
    val day = 3
    print("Hari $day adalah hari ")
    when (day) {
        1 -> println("Senin")
        2 -> println("Selasa")
        3 -> println("Rabu")
        4 -> println("Kamis")
        5 -> println("Jumat")
        6 -> println("Sabtu")
        7 -> println("Minggu")
        else -> println("Hari tidak valid")
    }

    // Bagian 4
    println("\nBagian 4")
    val grade = 'B'
    print("Grade $grade ")
    when (grade) {
        'A', 'B' -> println("Lulus dengan baik")
        'C' -> println("Lulus pas-pasan")
        'D', 'E' -> println("Tidak lulus")
        else -> println("Nilai tidak valid")
    }

    // Bagian 5
    println("\nBagian 5")
    val month = 10
    val season = when (month) {
        12, 1, 2 -> "Musim Hujan"
        3, 4, 5 -> "Musim Semi"
        6, 7, 8 -> "Musim Panas"
        9, 10, 11 -> "Musim Gugur"
        else -> "Bulan tidak valid"
    }
    println("Bulan $month adalah musim $season")
}
