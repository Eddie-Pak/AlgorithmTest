package lv0

fun main() {
    print("첫번째 숫자: ")
    val a = readLine()!!.toInt()
    print("두번째 숫자: ")
    val b = readLine()!!

    println("ㅡㅡㅡㅡㅡ")

    for (i in b.indices.reversed()) {
        val digit = b[i].toString().toInt()
        println(a * digit)
    }

    println(a * b.toInt())
}