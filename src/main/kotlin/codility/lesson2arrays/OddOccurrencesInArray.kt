package codility.lesson2arrays

fun main() {
    println(OddOccurrencesInArray().solution(intArrayOf(9, 3, 9, 3, 9, 7, 9)))
}

/*

Codility Lesson 2 OddOccurrencesInArray

A non-empty array A consisting of N integers is given. The array contains an odd number of elements, and each element of the array can be paired with another element that has the same value, except for one element that is left unpaired.

For example, in array A such that:

  A[0] = 9  A[1] = 3  A[2] = 9
  A[3] = 3  A[4] = 9  A[5] = 7
  A[6] = 9
the elements at indexes 0 and 2 have value 9,
the elements at indexes 1 and 3 have value 3,
the elements at indexes 4 and 6 have value 9,
the element at index 5 has value 7 and is unpaired.
Write a function:

fun solution(A: IntArray): Int

that, given an array A consisting of N integers fulfilling the above conditions, returns the value of the unpaired element.

For example, given array A such that:

  A[0] = 9  A[1] = 3  A[2] = 9
  A[3] = 3  A[4] = 9  A[5] = 7
  A[6] = 9
the function should return 7, as explained in the example above.

Write an efficient algorithm for the following assumptions:

N is an odd integer within the range [1..1,000,000];
each element of array A is an integer within the range [1..1,000,000,000];
all but one of the values in A occur an even number of times.
Copyright 2009–2023 by Codility Limited. All Rights Reserved. Unauthorized copying, publication or disclosure prohibited.
 */
class OddOccurrencesInArray {


    // 첫 시도 테스트 케이스 실패..
    // fun solution(A: IntArray): Int {
    //     val sorted = A.sorted()
    //     return A.groupBy { it }.filter { it.value.size % 2 == 1 }.keys.first()
    // }

    fun solution(A: IntArray): Int {

        A.sort()

        // i+1이 사이즈 일때, 즉, 홀수일 경우 해당 element가 짝이 없는 것
        // 정렬한 상태에서 2씩 건너뛰면서 i와 i+1 element가 다르다면 짝이 없는 것
        for (i in A.indices step 2) {
            if (i + 1 == A.size) return A[i]
            if (A[i] != A[i+1]) return A[i]
        }
        return -1
    }
}
