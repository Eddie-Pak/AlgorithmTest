package lv0

class Solution {
    fun solution(n: Int): Int {
        val answer: Int = factorial(n)

        return answer
    }

    private fun factorial(n: Int): Int {
        var factorial = 1

        for (i in 1..n) {
            factorial *= i

            if (factorial > n) {
                return i - 1
            }
        }

        return n
    }
}