fun main() {
    forex()
    println("=========")
    forex1()
    println("=========")
    forex2()
}

fun forex() {
    val numbers = listOf(1L, 2L, 3L, 4L)
    for (number in numbers) {
        println(number)
    }
}

fun forex1() {
    for (i in 1..3) {
        println(i)
    }
}

fun forex2() {
    for (i in 1..5 step 2) {
        println(i)
    }
}