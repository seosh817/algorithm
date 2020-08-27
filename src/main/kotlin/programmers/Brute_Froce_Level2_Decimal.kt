package programmers

object Brute_Froce_Level2_Decimal {


    fun solution(numbers: String): Int {
        var answer = 0

        var array = ArrayList<String>()

        for(i in numbers.indices) {
            var sub = numbers.substring(i-1, i)
            array.add(sub)
        }


        return answer
    }

    fun isPrimeNum(number: Int): Boolean {
        if(number == 0) return false
        if(number == 1) return false
        for(i in 2..number) {
            if(number % i == 0) {
                return false
            }
        }
        return true
    }



    @JvmStatic
    fun main(args: Array<String>) {

        println(solution("17"))

    }
}