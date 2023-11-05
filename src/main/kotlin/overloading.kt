fun main() {
//    repeat("hello world")
//    repeat("hello world", useNewLine = false)  // named argument 빌더의 장점을 그대로 사용할 수 잇다.

    // ,로 구분하는 경우는 바로 넣으면된다.
    printAll("A", "B", "C", "D")

    // 배열을 바로 넣는 대신 스프레드 연산자(*)를 붙여줘야 한다.
    val array = arrayOf("A", "B", "C")
    printAll(*array)
}

// 디폴트 파라미터.
fun repeat(
    str: String,
    num: Int = 3,
    useNewLine: Boolean = true
) {
    for (i in 1..num) {
        if (useNewLine) {
            println(str)
        } else {
            print(str)
        }
    }
}

// vararg는 가변인자 자바 ...과 같다.
fun printAll(vararg strings: String) {
    for (str in strings) {
        println(str)
    }
}