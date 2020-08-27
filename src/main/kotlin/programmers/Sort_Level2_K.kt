package programmers

object Sort_Level2_K {

    //https://programmers.co.kr/learn/courses/30/lessons/42748

    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {


        return commands.map { command ->
            array.slice(IntRange(command[0] - 1, command[1] - 1)).sorted()[command[2] - 1]
        }
            .toIntArray()
    }

    @JvmStatic
    fun main(args: Array<String>) {
        for(value in solution(
            array = intArrayOf(1, 5, 2, 6, 3, 7, 4),
            commands = arrayOf(intArrayOf(2, 5, 3), intArrayOf(4, 4, 1), intArrayOf(1, 7, 3))
        )) {
            println(value)
        }


    }
}