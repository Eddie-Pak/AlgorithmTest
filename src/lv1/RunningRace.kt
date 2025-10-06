package lv1

class RunningRace {
    fun solution(players: Array<String>, callings: Array<String>): Array<String> {
        val playerToRankMap = mutableMapOf<String, Int>()
        val rankToPlayerMap = mutableMapOf<Int, String>()

        players.forEachIndexed { index, player ->
            playerToRankMap[player] = index
            rankToPlayerMap[index] = player
        }

        callings.forEach { calledPlayer ->
            val currentRank = playerToRankMap[calledPlayer]!!

            val frontPlayer = rankToPlayerMap[currentRank - 1]!!

            playerToRankMap[calledPlayer] = currentRank - 1
            playerToRankMap[frontPlayer] = currentRank

            rankToPlayerMap[currentRank - 1] = calledPlayer
            rankToPlayerMap[currentRank] = frontPlayer
        }

        return rankToPlayerMap.values.toTypedArray()
    }
}