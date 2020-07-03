package programmers

object Sort_Level2_H_Index {

    fun solution(citations: IntArray): Int {

        var answer = 0

        for ((index, citation) in citations.sortedDescending().withIndex()) {
            if(citation >= index +1){   // 인용된 횟수는 index + 1이므로 조건을 만족하는 것이 인용된 횟수이다.
                answer = index + 1
            }
        }

        return answer
        // 6 5 3 1 0
        // 0 1 2 3 4


    }

    @JvmStatic
    fun main(args: Array<String>) {
        println(solution(intArrayOf(3, 0, 6, 1, 5)))
    }
}