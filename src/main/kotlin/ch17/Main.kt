package ch17

fun main() {
    val fruits = listOf(
        Fruit("사과", 1_000),
        Fruit("사과", 1_200),
        Fruit("사과", 1_200),
        Fruit("사과", 1_500),
        Fruit("바나나", 3_000),
        Fruit("바나나", 3_200),
        Fruit("바나나", 2_500),
        Fruit("수박", 10_000),
    )

    // 이름 없는 함수
    // 변수 타입은 : (Fruit) -> Boolean
    val isApple: (Fruit) -> Boolean = fun(fruit: Fruit): Boolean {
        return fruit.name == "사과"
    }

    val isApple2: (Fruit) -> Boolean = { fruit: Fruit -> fruit.name == "사과" }

    isApple(fruits[0])
    isApple.invoke(fruits[0])

    filterFruits(fruits, isApple)

    filterFruits(fruits, { fruit: Fruit -> fruit.name == "사과" })

    filterFruits(fruits)  { it.name == "사과" }

}

private fun filterFruits(
    fruits: List<Fruit>,
    filter: (Fruit) -> Boolean
): List<Fruit> {
    val results = mutableListOf<Fruit>()
    for (fruit in fruits) {
        if (filter(fruit)) {
            results.add(fruit)
        }
    }
    return results
}


class Fruit(
    val name: String,
    val price: Int,
)
