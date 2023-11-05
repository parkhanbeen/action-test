package ch12

fun main() {
    moveSameThing(object : Movable {
        override fun move() {
            println("무브 무브")
        }

        override fun fly() {
            println("날다 날다")
        }
    })
}

private fun moveSameThing(movable: Movable) {
    movable.move()
    movable.fly()
}