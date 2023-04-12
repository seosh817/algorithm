package codility

fun main() {
    println(PermMissingElem().solution(intArrayOf(2, 3, 1, 5)))
}

/*
An array A consisting of N different integers is given. The array contains integers in the range [1..(N + 1)], which means that exactly one element is missing.

Your goal is to find that missing element.

Write a function:

fun solution(A: IntArray): Int

that, given an array A, returns the value of the missing element.

For example, given array A such that:

  A[0] = 2
  A[1] = 3
  A[2] = 1
  A[3] = 5
the function should return 4, as it is the missing element.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [0..100,000];
the elements of A are all distinct;
each element of array A is an integer within the range [1..(N + 1)].
Copyright 2009–2023 by Codility Limited. All Rights Reserved. Unauthorized copying, publication or disclosure prohibited.
 */
class PermMissingElem {

    fun solution(A: IntArray): Int {
        A.sort()

        if (A.isEmpty() || A[0] != 1) return 1
        if (A.last() != A.size + 1) return A.size + 1

        for (i in A.indices) {
            if (i + 1 != A[i]) return i + 1
        }

        return A.size + 1
    }
}
