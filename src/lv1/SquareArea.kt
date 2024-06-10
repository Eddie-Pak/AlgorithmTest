package lv1

fun main(args: Array<String>) {
    print("사각형 갯수: ")
    val t = readLine()!!.toInt()
    var maxArea = 0

    println("사각형의 가로, 세로를 순서대로 입력해주세요.")

    for (i in 1..t) {
        val (w, h) = readLine()!!.split(" ").map { it.toInt() }
        val area = w * h
        if (area > maxArea) {
            maxArea = area
        }
    }

    println("사각형 넓이의 최댓값: $maxArea")
}