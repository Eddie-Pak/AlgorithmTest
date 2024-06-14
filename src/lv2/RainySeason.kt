package lv2

fun main() {
    print("집 수와 장마기간을 입력해주세요.: ")
    val (houseCount, rainCount) = readLine()!!.split(" ").map { it.toInt() }
    print("집들의 높이를 입력해주세요.: ")
    val houseHeight = readLine()!!.split(" ").map { it.toInt() }.toMutableList()
    val rains = Array(rainCount) { Pair(0, 0) }

    for (i in 0 until rainCount) {
        println("${i+1}일째에 비가 내리는 구역을 입력해주세요.")
        val (startCount, endCount) = readLine()!!.split(" ").map { it.toInt() - 1 }
        rains[i] = Pair(startCount, endCount)
    }

    simulateRain(houseHeight, rains, rainCount)

    println("장마가 지난후 집들의 높이는 다음과 같습니다.")
    println(houseHeight.joinToString(" "))
}

fun simulateRain(houseHeight: MutableList<Int>, rains: Array<Pair<Int, Int>>, rainCount: Int) {
    val drainageTargets = mutableSetOf<Int>()
    for (day in 0 until rainCount) {
        val (startCount, endCount) = rains[day]
        for (i in startCount..endCount) {
            houseHeight[i]++
            drainageTargets.add(i)
        }

        if ((day + 1) % 3 == 0) {
            simulateDrain(houseHeight, drainageTargets)
        }
    }
}

fun simulateDrain(houseHeight: MutableList<Int>, drainageTargets: MutableSet<Int>) {
    drainageTargets.forEach { index ->
        if (index in houseHeight.indices) {
            houseHeight[index]--
        }
    }
    drainageTargets.clear()
}