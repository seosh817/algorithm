package programmers

object Hash_Level2_Camouflage_KT {

    //https://programmers.co.kr/learn/courses/30/lessons/42578
    fun solution1(clothes: Array<Array<String>>): Int {

        return clothes.groupBy { it[1] }.values.fold(1) { acc, list -> acc * (list.size + 1) } - 1
    }

    fun solution2(clothes: Array<Array<String>>): Int {


        return clothes.groupBy { it[1] }.values.map { it.size + 1 }.reduce{acc, size -> acc * size} - 1
    }


    @JvmStatic
    fun main(args: Array<String>) {
        println(
            solution2(
                arrayOf(
                    arrayOf("yellow_hat", "headgear"),
                    arrayOf("blue_sunglasses", "eyewear"),
                    arrayOf("green_trubran", "headgear")
                )
            )
        )

    }
}