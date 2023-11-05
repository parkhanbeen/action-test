import java.lang.IllegalArgumentException
import java.util.StringJoiner

fun validateScore(score: Int) {
    // 0부터 100 사이가 아니다. in 앞에 !(부정)
    if (score !in 0..100) {
        throw IllegalArgumentException("스코어 범위는 0부터 100입니다.")
    }

    if (score in 0..100) {
        // ....
    }
}

fun getPassOrFail(score: Int): String {
    return if (score >= 50) {
        "p"
    } else {
        "F"
    }
}

fun getGrade(score: Int): String {
    return if (score > 90) {
        "A"
    } else if (score >= 80) {
        "B"
    } else if (score >= 70) {
        "c"
    } else {
        "D"
    }
}

fun getGradeWithSwitch(score: Int): String {
    return when (score) {
        in 90..99 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "E"
    }
}

fun startWithA(obj: Any): Boolean {
    return when (obj) {
        is String -> obj.startsWith("A")
        else -> false
    }
}

fun judgeNumber(number: Int) {
    when (number) {
        1, 0, -1 -> println("어디서 많이 본 숫자입니다.")
        else -> println("1, 0, -1 이 아닙니다.")
    }
}

fun judgeNumber2(number: Int) {
    when {
        number == 0 -> println("주어진 숫자는 0 입니다.")
        number % 2 == 0 -> println("주어진 숫자는 짝수 입니다.")
        else -> println("주어진 숫자는 0 입니다.")
    }
}