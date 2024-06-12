package lv1

fun main() {
    // KOI 2017 딱지놀이 구현

    print("딱지놀이 총 라운드: ")
    val n = readLine()!!.toInt()

    val results = mutableListOf<String>()

    for (i in 1..n) {
        print("${i}라운드 A어린이 딱지: ")
        val a = readLine()!!.split(" ").drop(1).map { it.toInt() }
        print("${i}라운드 B어린이 딱지: ")
        val b = readLine()!!.split(" ").drop(1).map { it.toInt() }

        val result = compareCards(a, b)
        results.add(result)
    }
    println("결과")
    results.forEach { println(it) }
    // 최종결과도 구현해서 추가해보자
}

fun compareCards(a: List<Int>, b: List<Int>): String {
    val countA = IntArray(5)
    val countB = IntArray(5)

    for (card in a) {
        countA[card]++
    }
    for (card in b) {
        countB[card]++
    }

    for (card in 4 downTo 1) {
        if (countA[card] > countB[card]) {
            return "A"
        } else if (countA[card] < countB[card]) {
            return "B"
        }
    }
    return "D"
}

// 버퍼를 사용한 코드
//fun main() {
//    val reader = System.`in`.bufferedReader()
//    val writer = System.out.bufferedWriter()
//
//    val n = reader.readLine()!!.toInt()
//
//    for (i in 1..n) {
//        val a = reader.readLine().split(" ").drop(1).map { it.toInt() }
//        val b = reader.readLine().split(" ").drop(1).map { it.toInt() }
//
//        val result = compareCards(a, b)
//        writer.write(result)
//        writer.newLine()
//    }
//    writer.flush()
//}
//
//fun compareCards(a: List<Int>, b: List<Int>): String {
//    val countA = IntArray(5)
//    val countB = IntArray(5)
//
//    for (card in a) {
//        countA[card]++
//    }
//    for (card in b) {
//        countB[card]++
//    }
//
//    for (card in 4 downTo 1) {
//        if (countA[card] > countB[card]) {
//            return "A"
//        } else if (countA[card] < countB[card]) {
//            return "B"
//        }
//    }
//    return "D"
//}