package lv1

fun main() {
    println("좌표를 입력해주세요.")
    print("좌표: ")
    val (a, b, c, d) = readLine()!!.split(" ").map { it.toInt() }

    val distances = listOf(
        manhatDistance(a, b, c, d),
        manhatDistance(a, c, b, d),
        manhatDistance(a, d, b, c)
    )

    println("최장 거리는: ${distances.maxOrNull()}")
}

fun manhatDistance(x1: Int, x2: Int, y1: Int, y2: Int): Int {
    return Math.abs(x1 - x2) + Math.abs(y1 - y2)
}