package ch12

fun main() {
    println(Singleton.a)
    Singleton.a = 10
    println(Singleton.a)
}

class Person private constructor(
    var name: String,
    var age: Int,
) {
    // 클래스와 동행하는 유일한 오브젝트
    companion object Factory : Log{
        private const val MIN_AGE = 0

        // 바로 호출 가능
        @JvmStatic
        fun newBady(name: String): Person {
            return Person(name, MIN_AGE)
        }

        override fun log() {
            println("나는 person 클래스의 동행 객체에요")
        }
    }
}

object Singleton {
    var a: Int = 0
}