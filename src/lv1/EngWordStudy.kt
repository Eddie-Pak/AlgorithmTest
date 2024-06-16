package lv1

fun main() {
    val input = readLine()!!.toUpperCase()
    val frequency = IntArray(26)

    for (char in input) {
        frequency[char - 'A'] ++
    }

    var maxFreq = 0
    var maxChar = '?'

    for (i in frequency.indices) {
        if (frequency[i] > maxFreq) {
            maxFreq = frequency[i]
            maxChar = 'A' + i
        } else if (frequency[i] == maxFreq) {
            maxChar = '?'
        }
    }

    println(maxChar)
}