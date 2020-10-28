package programmers

object Brute_Force_Level1_Mock_Exam {

    fun solution(answers: IntArray): IntArray {
        var p1 = intArrayOf(1, 2, 3, 4, 5)
        var p2 = intArrayOf(2, 1, 2, 3, 2, 4, 2, 5)
        var p3 = intArrayOf(3, 3, 1, 1, 2, 2, 4, 4, 5, 5)

        var map = hashMapOf<Int, Int>(Pair(1, 0), Pair(2, 0), Pair(3, 0))

        var x = 0
        var y = 0
        var z = 0

        for ((index, answer) in answers.withIndex()) {
            if (answer == p1[index]) map.put(1, map[1]!! + 1)
            if (answer == p2[index]) map.put(2, map[2]!! + 1)
            if (answer == p3[index]) map.put(3, map[3]!! + 1)
            x = if (x < 4) x + 1 else 0
            y = if (y < 7) y + 1 else 0
            z = if (z < 9) z + 1 else 0
        }

        var max = map.maxBy { it.value }?.value
        for (index in 1..map.size) {
            if (map[index] != max) {
                map.remove(index)
            }
        }

        return map.toList().sortedWith(compareBy { it.first }).toMap().keys.toIntArray()
    }


    @JvmStatic
    fun main(args: Array<String>) {

        val array = solution(intArrayOf(1, 3, 2, 4, 2))

        for (value in array) {
            println(value)
        }
    }
}