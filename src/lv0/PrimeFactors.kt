package lv0

class PrimeFactors {
    fun solution(n: Int): IntArray {
        var answer: IntArray = intArrayOf()

        val primeFactors = mutableSetOf<Int>()

        var num = n
        var divisor = 2

        while( num > 1 ) {
            if( num % divisor == 0 ) {
                primeFactors.add(divisor)
                num /= divisor
            } else {
                divisor ++
            }
        }

        answer = primeFactors.sorted().toIntArray()

        return answer
    }
}