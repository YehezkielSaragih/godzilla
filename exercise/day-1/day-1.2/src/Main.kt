fun main() {

    // Bagian 1
    println("Bagian 1")
    val length = 7
    val width = 4
    val area = length * width
    println("Luas persegi panjang = $area")
    val radius = 10
    val circumference = 2 * 3.14 * radius
    println("Keliling lingkaran = $circumference")
    val remainder = 200 % 7
    println("200 % 7 = $remainder")

    // Bagian 2
    println("\nBagian 2")
    val x = 100
    val y = 200
    println("x(25) < y(200) = ${x<y}")
    val temp = 36.5
    println("temp < 37.0 = ${temp==37.0}")
    val a = 50
    val b = 50
    println("a(50) < b(50) = ${a==b}")

    // Bagian 3
    println("\nBagian 3")
    val isSunny = true
    val isRaining = false
    println("Sunny ? ${isSunny && !isRaining}")
    val hasMoney = true
    val isStoreOpen = false
    println("Can shopping ? ${hasMoney && isStoreOpen}")
    val isWeekend = true
    val isHoliday = false
    println("Day off ? ${isWeekend || isHoliday}")

    // Bagian 4
    println("\nBagian 4")
    var num = 8
    num += 5
    num *= 2
    num -= 3
    num /= 5
    println("Num result = $num")
    var price = 1000
    price -= price * 20 / 100
    println("Price after dics = $price")

    // Bagian 5
    println("\nBagian 5")
    var counter = 10
    counter++
    counter++
    counter--
    counter--
    counter--
    println("Counter = $counter")
    var points = 0
    points++
    points++
    points++
    points++
    points++
    points--
    println("Points = $points")
}
