package codility.lesson3timecomplexity

import kotlin.math.abs
import kotlin.math.min

fun main() {
    println(TapeEquilibrium().solution2(intArrayOf(2000)))
}

/*
A non-empty array A consisting of N integers is given. Array A represents numbers on a tape.

Any integer P, such that 0 < P < N, splits this tape into two non-empty parts: A[0], A[1], ..., A[P − 1] and A[P], A[P + 1], ..., A[N − 1].

The difference between the two parts is the value of: |(A[0] + A[1] + ... + A[P − 1]) − (A[P] + A[P + 1] + ... + A[N − 1])|

In other words, it is the absolute difference between the sum of the first part and the sum of the second part.

For example, consider array A such that:

  A[0] = 3
  A[1] = 1
  A[2] = 2
  A[3] = 4
  A[4] = 3
We can split this tape in four places:

P = 1, difference = |3 − 10| = 7
P = 2, difference = |4 − 9| = 5
P = 3, difference = |6 − 7| = 1
P = 4, difference = |10 − 3| = 7
Write a function:

fun solution(A: IntArray): Int

that, given a non-empty array A of N integers, returns the minimal difference that can be achieved.

For example, given:

  A[0] = 3
  A[1] = 1
  A[2] = 2
  A[3] = 4
  A[4] = 3
the function should return 1, as explained above.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [2..100,000];
each element of array A is an integer within the range [−1,000..1,000].
Copyright 2009–2023 by Codility Limited. All Rights Reserved. Unauthorized copying, publication or disclosure prohibited.
 */
class TapeEquilibrium {

    // 솔루션 1 ->
    // 이중 for문을 사용.
    // 배열 크기가 큰 경우에는 Performance test에서 몇가지 케이스가 실패함.
    fun solution1(A: IntArray): Int {
        if (A.isEmpty()) {
            return 0
        }
        if (A.size == 1) {
            return A[0]
        }

        var minimalDifference = Integer.MAX_VALUE
        for (i in 0 until A.lastIndex) {
            var firstPart = 0
            var secondPart = 0
            for (j in 0..i) {
                firstPart += A[j]
            }
            for (k in i+1..A.lastIndex) {
                secondPart += A[k]
            }
            minimalDifference = min(minimalDifference, abs(firstPart - secondPart))
        }
        return minimalDifference
    }

    // 솔루션 2 ->
    // 이중 for문을 제거함.
    // firstPart 배열과 secondPart 배열을 따로 계산한 후에 최소값을 찾음.
    fun solution2(A: IntArray): Int {
        var sum = 0
        for (item in A) {
            sum += item
        }

        var minimalDifference = Integer.MAX_VALUE
        var firstPart = 0
        var secondPart = sum
        for (i in 0..A.lastIndex - 1) {
            firstPart += A[i]
            secondPart -= A[i]
            minimalDifference = min(minimalDifference, abs(firstPart - secondPart))
        }
        return minimalDifference
    }
}
