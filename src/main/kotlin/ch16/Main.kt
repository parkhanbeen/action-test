package ch16

fun main() {
    val str = "ABC"
    println(str.lastChar())
}

/**
 * 확장 함수.
 * 클래스에 잇는 private proteced 를 가져올 수 없다.
 */
fun String.lastChar(): Char {
    return this[this.length - 1]
}