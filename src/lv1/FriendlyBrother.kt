package lv1

import kotlin.math.ceil

fun main() {
    var (a, b) = readLine()!!.split(" ").map { it.toInt() }
    val n = readLine()!!.toInt()

    for (i in 1..n) {
        if (i % 2 != 0) {
            val half = ceil(a / 2.0).toInt()
            a -= half
            b += half
        } else {
            val half = ceil(b / 2.0).toInt()
            a += half
            b -= half
        }
    }

    println("$a $b")
}