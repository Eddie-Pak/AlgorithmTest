package lv0

fun main() {
    val dummy = listOf(
        intArrayOf(1, 3, 6, 4, 1, 2),  // 예상 결과: 5
        intArrayOf(1, 2, 3),          // 예상 결과: 4
        intArrayOf(-1, -3),           // 예상 결과: 1
        intArrayOf(1, 2, 0),          // 예상 결과: 3
        intArrayOf(-5, -10, 0, 1, 3)   // 예상 결과: 2
    )

    for ((index, dummy) in dummy.withIndex()) {
        println("Test Index - ${index + 1}")
        println("결과: ${solution(dummy)}")
        println()
    }

}

fun solution(A: IntArray): Int {
    val sortedDistinct = A.filter { it > 0 }.sorted().distinct()

    var smallInt = 1

    for (num in sortedDistinct) {
        if (num != smallInt) {
            return smallInt
        }
        smallInt++
    }

    return smallInt
}