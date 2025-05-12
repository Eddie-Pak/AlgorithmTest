package lv0

class CloseNum {
    fun solution(array: IntArray, n: Int): Int {

        var answer: Int = 0

        val sortArray = array.sorted()

        answer = sortArray[0]

        var minDiff = Math.abs(n - answer)

        for (num in sortArray) {
            val diff = Math.abs(n - num)

            if ( diff < minDiff) {
                minDiff = diff
                answer = num
            }
        }

        return answer
    }
}