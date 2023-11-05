package ch20

import ch12.Person

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

class Person(
    val name: String,
    val age: Int,
)
