/**
 * 고양이 클래스.
 */
class Cat(
    species: String,
) : Animal(species, 4) {

    /**
     * 고양이가 사뿐 사뿐 걸어가는 함수.
     */
    override fun move() {
        println("고양이가 사뿐 사뿐 걸어가~~")
    }
}