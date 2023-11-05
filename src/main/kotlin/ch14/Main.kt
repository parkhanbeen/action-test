package ch14

fun main() {
    val dto1 = PersonDto("박한빈", 100)
    val dto2 = PersonDto("박한빈", 100)
    println(dto1 == dto2)
}

/**
 * data 클래스는 equals, hashcode, toString 자동 생성.
 * named arg를 사용하면 builder까지 모두 가능.
 */
data class PersonDto(
    val name: String,
    val age: Int,
)