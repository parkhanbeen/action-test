package ch14

fun main() {
    handleCar(Avante())
}

private fun handleCar(car: HyundaiCar) {
    when (car) {
        is Avante -> TODO()
        is Sonata -> TODO()
        is Gradeur -> TODO()
    }
}

sealed class HyundaiCar(
    val name: String,
    val price: Long,
)

class Avante : HyundaiCar("아반떼", 1_000L)
class Sonata : HyundaiCar("소나타", 2_000L)
class Gradeur : HyundaiCar("그렌저", 3_000L)