package ch13

class House(
    private val address: String,
    private val livingRoom: LivingRoom,
) {

    // 기본적으로 바깥 클래스와 연결이 없는 클래스가 만들어짐.
    class LivingRoom(
        private val area: Double
    )
}


class House1(
    private val address: String,
    private val livingRoom: LivingRoom,
) {

    // 권장되지 않는 내부 클래스
    // 바깥 클래스를 참조하고 싶다면 inner 키워드를 추가한다.
    inner class LivingRoom(
        private val area: Double
    ) {
        val address: String
            get() = this@House1.address
    }
}