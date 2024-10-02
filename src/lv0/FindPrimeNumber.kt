package lv0

import java.util.*

fun finPrimeNumber(number: Int): Int {
    var primeCount = 0

    for (i in 2..number) {
        var isPrime = true

        for (j in 2 until i) {
            if (i % j == 0) {
                isPrime = false
                break
            }
        }

        if (!isPrime) {
            continue
        } else {
            primeCount++
        }
    }

    return primeCount
}

fun main(args: Array<String>) {
    print("upTo: ")
    val upTo = Scanner(System.`in`).nextInt()
    val primeCount = finPrimeNumber(upTo)
    println()
    println("1~$upTo 사이 소수는 $primeCount 개")
}