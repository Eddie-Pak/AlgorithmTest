package lv1

fun main(args: Array<String>) {
    val t = readLine()!!.toInt()
    var maxArea = 0

    for (i in 1..t) {
        val (w, h) = readLine()!!.split(" ").map { it.toInt() }
        val area = w * h
        if (area > maxArea) {
            maxArea = area
        }
    }

    println(maxArea)
}