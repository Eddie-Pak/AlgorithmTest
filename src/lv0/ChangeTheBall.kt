package lv0

fun main() {
    println("바구니 갯수와 공을 바꿀 횟수를 입력해주세요.")
    val (n, m) = readLine()!!.split(" ").map {it.toInt()}
    val baskets = IntArray(n) {it + 1}

    for (i in 1..m) {
        println("$i 번째 차례입니다.")
        println("공을 바꿀 두 바구니의 번호를 입력해 주세요.")
        val (a, b) = readLine()!!.split(" ").map {it.toInt()}
        baskets[a-1] = baskets[b-1].also {baskets[b-1] = baskets[a-1]}
    }

    println(baskets.joinToString(" "))
}

//fun main() {
//    val (N, M) = readLine()!!.split(' ').map { it.toInt() }
//    val baskets = MutableList(N) { it + 1 }
//
//    repeat(M) {
//        val (a, b) = readLine()!!.split(' ').map { it.toInt() }
//        val temp = baskets[a - 1]
//        baskets[a - 1] = baskets[b - 1]
//        baskets[b - 1] = temp
//    }
//
//    println(baskets.joinToString(" "))
//}