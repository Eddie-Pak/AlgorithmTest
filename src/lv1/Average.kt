package lv1

fun main() {
    val n = readLine()!!.toInt()
    val input = readLine()!!.split(" ").map { it.toDouble() }

    val maxScore = input.maxOrNull() ?: 0.0
    val newScores = input.map { it/ maxScore * 100 }

    val average = newScores.average()

    println(average)
}