package lv0

fun main() {
    println("바구니 갯수와 공을 바꿀 횟수를 입력해 주세요.")
    val (N, M) = readLine()!!.split(" ").map { it.toInt() }

    val baskets = IntArray(N) { 0 }

    for (m in 1..M) {
        println("$m 번째 처례입니다.")
        println("공을 바꿀 구간과 공번호를 입력해 주세요.")
        val (i, j, k) = readLine()!!.split(" ").map { it.toInt() }
        for (index in i-1 until j) {
            baskets[index] = k
        }
    }

    println(baskets.joinToString(" "))
}