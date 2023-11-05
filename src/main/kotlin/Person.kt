import java.lang.IllegalArgumentException

fun main() {
    val person = Person("hanbeen", 31)
    println(person.name)
    person.age = 33
    println(person.age)

    val person2 = Person("최번개")
    println(person2.name)
    println(person2.age)

    val person3 = Person("최번개", -1)
    println(person3.name)
    println(person3.age)
}

// 클래스 옆에는 주생성자 반드시 존재해야함.
// 주생성자에 파라미터가 하나도 없다면 생략가능.
class Person(
    val name: String,
    var age: Int
) {

    // field 무한 루프를 막기 위한 자기 자신을 가르키는 예약어(backing field).
    // 사용하는 경우가 거의 없음.
//    val name = name
//        get() = field.uppercase()

//    fun getUppercaseName(): String = this.name.uppercase()

    val uppercaseName: String
        get() = this.name.uppercase()

    init {
        if (age <= 0) {
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다.")
        }
    }

    // 부생성자는 body를 가질수 있다.
    constructor(name: String): this(name, 1) {
        println("부생성자 : ${name}")
    }

    // 커스텀 getter
    val isAdult: Boolean
        get() = this.age >= 20
}
