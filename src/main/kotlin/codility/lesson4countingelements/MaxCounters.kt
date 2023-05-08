package codility.lesson4countingelements

import kotlin.math.max

fun main() {
    // println(MaxCounters().solution2(5, intArrayOf(3, 4, 4, 6, 1, 4, 4)).toList())
    println(MaxCounters().solution2(1, intArrayOf(6, 1, 1, 1, 1, 1)).toList())
}

/*
You are given N counters, initially set to 0, and you have two possible operations on them:

increase(X) − counter X is increased by 1,
max counter − all counters are set to the maximum value of any counter.
A non-empty array A of M integers is given. This array represents consecutive operations:

if A[K] = X, such that 1 ≤ X ≤ N, then operation K is increase(X),
if A[K] = N + 1 then operation K is max counter.
For example, given integer N = 5 and array A such that:

    A[0] = 3
    A[1] = 4
    A[2] = 4
    A[3] = 6
    A[4] = 1
    A[5] = 4
    A[6] = 4
the values of the counters after each consecutive operation will be:

    (0, 0, 1, 0, 0)
    (0, 0, 1, 1, 0)
    (0, 0, 1, 2, 0)
    (2, 2, 2, 2, 2)
    (3, 2, 2, 2, 2)
    (3, 2, 2, 3, 2)
    (3, 2, 2, 4, 2)
The goal is to calculate the value of every counter after all operations.

Write a function:

fun solution(N: Int, A: IntArray): IntArray

that, given an integer N and a non-empty array A consisting of M integers, returns a sequence of integers representing the values of the counters.

Result array should be returned as an array of integers.

For example, given:

    A[0] = 3
    A[1] = 4
    A[2] = 4
    A[3] = 6
    A[4] = 1
    A[5] = 4
    A[6] = 4
the function should return [3, 2, 2, 4, 2], as explained above.

Write an efficient algorithm for the following assumptions:

N and M are integers within the range [1..100,000];
each element of array A is an integer within the range [1..N + 1].
Copyright 2009–2023 by Codility Limited. All Rights Reserved. Unauthorized copying, publication or disclosure prohibited.
 */
class MaxCounters {

    // 첫 번째 풀이
    // 만약 A[i]가 N보다 크면 counters 배열의 모든 값들을 현재 최대값으로 설정함.
    // 효율성 테스트 88% 배열의 크기가 엄청 큰 경우에 효율성 테스트 하나 실패함. O(N^2)

    fun solution(N: Int, A: IntArray): IntArray {
        val counters = IntArray(N) { 0 }
        var maxCounter = 0
        for (i in A.indices) {
            if (A[i] > N) {
                for (j in counters.indices) {
                    counters[j] = maxCounter
                }
            } else {
                counters[A[i] - 1] += 1
                if (counters[A[i] - 1] > maxCounter) {
                    maxCounter = counters[A[i] - 1]
                }
            }
        }
        return counters
    }

    // {0,0,0,0,0}
    // {0,0,1,0,0}
    // {0,0,1,1,0}
    // {0,0,1,2,0}
    // {0,0,1,2,0} position =3 checkMax = 2
    // {2,0,1,2,0} 되었다 -> {3,0,1,2,0}
    // {3,0,1,3,0}
    // {3,0,1,4,0}
    // for문이 끝나고 position이 0보다 크기 떄문에 Array ans는 {2,2,2,2,2}로 다시 생성되고
    // 다시 Array A에 대해 for문을 진행하는데 position+1이므로 A[4]부터 진행됩니다. 그래서
    // {3,2,2,2,2}
    // 
    // {3,2,2,3,2}
    // 
    // {3,2,2,4,2}
    fun solution2(N: Int, A: IntArray): IntArray {
        val counters = IntArray(N) { 0 }
        var maxTemp = 0
        var maxIndex = 0
        var maxValue = 0
        for (i in A.indices) {
            if (A[i] <= N) {
                // maxValue 설정을 건너 뛰었으므로 maxValue보다 작으면 maxValue로 설정 한 뒤에 +1 증가
                if (counters[A[i] - 1] < maxValue) {
                    counters[A[i] - 1] = maxValue
                }
                counters[A[i] - 1]++
                maxTemp = max(maxTemp, counters[A[i] - 1])
            } else if (A[i] > N) {
                maxIndex = i
                maxValue = maxTemp
            }
        }

        if (maxIndex > 0) {
            for (i in 0..counters.lastIndex) {
                counters[i] = maxValue
            }

            println("maxTemp: $maxValue, maxIndex: $maxIndex, counters: ${counters.toList()}")
            for (i in (maxIndex + 1)..A.lastIndex) {
                println("i: ${i}")
                counters[A[i] - 1]++
            }
        }
        return counters
    }
}
