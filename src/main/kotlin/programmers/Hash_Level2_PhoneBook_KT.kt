package programmers

object Hash_Level2_PhoneBook_KT {

    fun solution(
        phoneBook: Array<String>
    ): Boolean {

        //https://programmers.co.kr/learn/courses/30/lessons/42577
        var answer = true

        for ((i, value) in phoneBook.withIndex()) {
            for (j in i + 1 until phoneBook.size) {
                if (value.startsWith(phoneBook[j])) answer = false
                if (phoneBook[j].startsWith(value)) answer = false
            }
        }

        return answer
    }


    @JvmStatic
    fun main(args: Array<String>) {
        println(solution(arrayOf("119", "97674223", "1195524421")))
        println(solution(arrayOf("123", "456", "789")))
        println(solution(arrayOf("12", "123", "1235", "567", "88")))


    }
}