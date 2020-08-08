package programmers

object Hash_Level1_Marathon {
    fun solution(
        participant: Array<String>, completion: Array<String>
    ): String {
        //https://programmers.co.kr/learn/courses/30/lessons/42576
        var answer = ""

        var hashMap = hashMapOf<String, Int>()

        participant.forEach {
            hashMap[it] = hashMap.getOrDefault(it, 0) + 1
        }
        completion.forEach { key ->
            hashMap[key]?.let { value ->
                hashMap.put(key, value - 1)
            }
        }

        hashMap.entries.forEach {
            if (it.value != 0) {
                answer = it.key
            }
        }

        return answer
    }


    @JvmStatic
    fun main(args: Array<String>) {

        println(solution(arrayOf("leo", "kiki", "eden"), arrayOf("eden", "kiki")))

    }
}