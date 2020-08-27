package programmers

object Sort_Level2_Biggest {


    fun solution(numbers: IntArray): String {

        return numbers.map { it.toString() }.sortedWith(Comparator { o1, o2 ->
            if (o1.plus(o2) > o2.plus(o1)) -1  //21 34 34
            else 1
        }).let {
            if (it.first() == "0") "0"
            else it.fold(StringBuffer()) { acc, s -> acc.append(s) }.toString()
        }


    }


    @JvmStatic
    fun main(args: Array<String>) {
            println(solution(intArrayOf(3, 30, 34, 5, 9)))
    }
}