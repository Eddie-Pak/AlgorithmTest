package lv0

fun main() {
    print("테스트 케이스 갯수: ")
    val n = readLine()!!.toInt()
    val result = mutableListOf<Int>()

    for (i in 1..n) {
        print("$i 번째 테스트 케이스: ")
        val (a, b) = readLine()!!.split(" ").map {it.toInt()}
        result.add(a + b)
    }

    println("-결과-")

    for (num in result) {
        println(num)
    }
}