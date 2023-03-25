package codility

fun main() {
    println(CyclicRotation().solution(intArrayOf(), 3))
}

/*

Codility Lesson2 - CyclicRotation

An array A consisting of N integers is given. Rotation of the array means that each element is shifted right by one index, and the last element of the array is moved to the first place. For example, the rotation of array A = [3, 8, 9, 7, 6] is [6, 3, 8, 9, 7] (elements are shifted right by one index and 6 is moved to the first place).

The goal is to rotate array A K times; that is, each element of A will be shifted to the right K times.

Write a function:

fun solution(A: IntArray, K: Int): IntArray

that, given an array A consisting of N integers and an integer K, returns the array A rotated K times.

For example, given

    A = [3, 8, 9, 7, 6]
    K = 3
the function should return [9, 7, 6, 3, 8]. Three rotations were made:

    [3, 8, 9, 7, 6] -> [6, 3, 8, 9, 7]
    [6, 3, 8, 9, 7] -> [7, 6, 3, 8, 9]
    [7, 6, 3, 8, 9] -> [9, 7, 6, 3, 8]
For another example, given

    A = [0, 0, 0]
    K = 1
the function should return [0, 0, 0]

Given

    A = [1, 2, 3, 4]
    K = 4
the function should return [1, 2, 3, 4]

Assume that:

N and K are integers within the range [0..100];
each element of array A is an integer within the range [−1,000..1,000].
In your solution, focus on correctness. The performance of your solution will not be the focus of the assessment.

Copyright 2009–2023 by Codility Limited. All Rights Reserved. Unauthorized copying, publication or disclosure prohibited.
 */
class CyclicRotation {

    fun solution(A: IntArray, K: Int): IntArray {
        if (A.isEmpty()) return intArrayOf()

        val rotatedArray = A.toMutableList()

        // K번 돌면서 맨앞에 마지막 element 추가, 마지막 element 제거
        for (i in 0 until K) {
            rotatedArray.add(0, rotatedArray.last())
            rotatedArray.removeAt(rotatedArray.lastIndex)
        }

        println("rotatedArray: ${rotatedArray.toList()}")
        return rotatedArray.toIntArray()
    }

    @ExperimentalStdlibApi
    fun solution2(A: IntArray, K: Int): IntArray {
        val dequeue = ArrayDeque<Int>()
        val rotation = when(A.size) {
            0 -> 0
            else -> K % A.size
        }

        dequeue.addAll(A.toList())
        repeat(rotation) { dequeue.addFirst(dequeue.removeLast()) }

        return dequeue.toIntArray()
    }
}
