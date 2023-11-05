package ch20

import ch12.Person

// 사람 프린트
fun printPerson(person: Person?) {
    // scope function
    person?.let {
        println(it.name)
        println(it.age)
    }


//    if (person != null) {
//        println(person.name)
//        println(person.age)
//    }
}


// 사람
class Person(
    val name: String,
    val age: Int,
)
