package lv1

fun main() {
    print("거래 횟수: ")
    val n = readLine()!!.toInt()

    var totalMoney = 0

    println("수입과 지출을 in, out으로 입력해주세요.")

    for (i in 1..n) {
        val transaction = readLine()!!.split(" ")
        val type = transaction[0]
        val amount = transaction[1].toInt()

        when (type) {
            "in" -> totalMoney += amount
            "out" -> totalMoney -= amount
        }
    }
    println()
    println("저축 결과")

    if (totalMoney > 0) {
        println("success")
    } else {
        println("fail")
    }
}