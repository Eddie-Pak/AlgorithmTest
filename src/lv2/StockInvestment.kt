package lv2

import java.io.BufferedWriter
import java.io.OutputStreamWriter
import kotlin.math.floor

fun main() {
    // bufferedWriter, OutputStreamWriter를 사용하여 타임아웃을 막고
    // floor()를 사용하여 소숫점자리를 반올림 하고 날리는게아닌 아예 절사해보리는 방법으로 정확도를 올림
    print("가지고있는 해외주식의 갯수: ")
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine()!!.toInt()
    val stocks = mutableListOf<Pair<Double, Int>>()

    for (i in 1..n) {
        print("${i}번째 회사의 보유 주식수, 주식가격: ")
        val (v, w) = readLine()!!.split(" ").map { it.toDouble() }
        val stockPrice = v * w

        val doubleStockPrice = floor(stockPrice * 10.0) / 10.0

        stocks.add(Pair(doubleStockPrice, i))
    }

    stocks.sortByDescending { it.first }

    val result = stocks.joinToString(" ") { it.second.toString() }

    println()
    println("주식 판매 순서")

    bw.write(result)
    bw.flush()
    bw.close()
}

//    처음에는 밑에와 같은 코드를 사용하였는데 타임아웃이 하나가 안잡히게됨
//    출력일때에 join을 하게되면 오래걸릴수도 있다하여 그 전단계로 올려서 시간을 좀더 단축시킴
//    val result = stocks.map { it.second }
//
//    bw.write(result.joinToString(" "))
//    bw.flush()
//    bw.close()

/**
타임아웃과 많은 소숫점의수 같은것을 받으면 감당을 못해 에러가 나는거 같음

fun main() {
val n = readLine()!!.toInt()
val stocks = mutableListOf<Pair<Double, Int>>()

for (i in 1..n) {
val (v, w) = readLine()!!.split(" ").map { it.toDouble() }
val stockPrice = v * w

val doubleStockPrice = "%.1f".format(stockPrice).toDouble()

stocks.add(Pair(doubleStockPrice, i))
}

stocks.sortByDescending {it.first}

val result = stocks.map {it.second}

println(result.joinToString(" "))
}
 **/

/**
 다른이가 한 방법
import java.util.Scanner
import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main(args: Array<String>) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    (1..readLine()!!.toInt())
        .mapIndexed { index, _ ->
            val (v, w) = readLine()!!.split(" ")
            val price = (v.toDouble() * w.toDouble() * 10).toInt()
            Pair(price, index + 1)
        }
        .sortedBy { -it.first }
        .forEach { bw.write("${it.second} ") }

    bw.flush()
    bw.close()
}
**/