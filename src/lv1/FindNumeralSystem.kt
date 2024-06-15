package lv1

fun main() {
    println("n과 r진법으로 바꾼 t의 값을 입력해주세요.")
    val (n, t) = readLine()!!.split(" ")
    val nInt = n.toInt()

    println()

    for (r in 2..16) {
        try {
            if (nInt == t.toInt(r)) {
                println("r: $r")
                return
            }
        } catch (e: NumberFormatException) {

        }
    }
}