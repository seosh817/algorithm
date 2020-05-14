object Stack_Level2_Top {

    //https://programmers.co.kr/learn/courses/30/lessons/42588
    fun solution(heights: IntArray): IntArray {

        var answer = IntArray(heights.size) { 0}

        for(i in heights.size - 1 downTo(0)) {
            for(j in i-1 downTo(0)) {
                if(heights[j] > heights[i]) {
                    answer[i] = j+1
                    break;
                }
            }
        }


        return answer
    }

        @JvmStatic
        fun main(args: Array<String>) {
            for (value in solution(intArrayOf(6, 9, 5, 7, 4))) {
                println("$value")
            }
        }


}