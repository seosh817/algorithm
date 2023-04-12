package codility.lesson4countingelements

fun main() {
    println(PermCheck().solution(intArrayOf(2)))
}

/*
A non-empty array A consisting of N integers is given.

A permutation is a sequence containing each element from 1 to N once, and only once.

For example, array A such that:

    A[0] = 4
    A[1] = 1
    A[2] = 3
    A[3] = 2
is a permutation, but array A such that:

    A[0] = 4
    A[1] = 1
    A[2] = 3
is not a permutation, because value 2 is missing.

The goal is to check whether array A is a permutation.

Write a function:

fun solution(A: IntArray): Int

that, given an array A, returns 1 if array A is a permutation and 0 if it is not.

For example, given array A such that:

    A[0] = 4
    A[1] = 1
    A[2] = 3
    A[3] = 2
the function should return 1.

Given array A such that:

    A[0] = 4
    A[1] = 1
    A[2] = 3
the function should return 0.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [1..100,000];
each element of array A is an integer within the range [1..1,000,000,000].
Copyright 2009–2023 by Codility Limited. All Rights Reserved. Unauthorized copying, publication or disclosure prohibited.
 */
class PermCheck {

    // 순열이면 1 순열 아니면 0
    // 정렬 후 A[i]가 i + 1이면
    fun solution(A: IntArray): Int {
        A.sort()
        for (i in 0..A.lastIndex) {
            if (A[i] != i + 1) {
                return 0
            }
        }

        return 1
    }
}
