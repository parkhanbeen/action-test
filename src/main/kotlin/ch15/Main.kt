package ch15

fun main() {
    val array = arrayOf(100, 200)

    for (i in array.indices) {
        println("${i} ${array[i]}")
    }

    // 불변
    //    val numbers = listOf(100, 200)
    // 가변
    val numbers = mutableListOf(100, 200)
    val emptyList = emptyList<Int>()

    println(numbers.get(0))
    println(numbers[0])

    for (number in numbers) {
        println(number)
    }

    for ((index, value) in numbers.withIndex()) {
        println("${index} ${value}")
    }
}