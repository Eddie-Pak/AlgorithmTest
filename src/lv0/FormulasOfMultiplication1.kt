package lv0

fun main() {
    print("첫번째 숫자: ")
    val a = readLine()!!.toInt()
    print("두번째 숫자: ")
    val b = readLine()!!

    println("ㅡㅡㅡㅡㅡ")

    val b1 = b[2].toString().toInt()
    val b2 = b[1].toString().toInt()
    val b3 = b[0].toString().toInt()

    println(a * b1)
    println(a * b2)
    println(a * b3)
    println(a * b.toInt())
}