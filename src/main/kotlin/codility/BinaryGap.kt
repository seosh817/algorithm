package codility

import kotlin.math.max

fun main() {
    // 1041, 15, 9
    println(BinaryGap().solution(9))
    println(BinaryGap().solution2(9))
}

/*
Codility Lesson1 - Binary Gap

A binary gap within a positive integer N is any maximal sequence of consecutive zeros that is surrounded by ones at both ends in the binary representation of N.

For example, number 9 has binary representation 1001 and contains a binary gap of length 2. The number 529 has binary representation 1000010001 and contains two binary gaps: one of length 4 and one of length 3. The number 20 has binary representation 10100 and contains one binary gap of length 1. The number 15 has binary representation 1111 and has no binary gaps. The number 32 has binary representation 100000 and has no binary gaps.

Write a function:

fun solution(N: Int): Int

that, given a positive integer N, returns the length of its longest binary gap. The function should return 0 if N doesn't contain a binary gap.

For example, given N = 1041 the function should return 5, because N has binary representation 10000010001 and so its longest binary gap is of length 5. Given N = 32 the function should return 0, because N has binary representation '100000' and thus no binary gaps.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [1..2,147,483,647].
Copyright 2009–2023 by Codility Limited. All Rights Reserved. Unauthorized copying, publication or disclosure prohibited.

 */
class BinaryGap {

    /*
    1. 이진수 변환을 직접 구현
    2. 이진수 문자열에서 1이 위치한 인덱스들을 값으로 가지는 리스트 생성
    3. (1이 위치한 인덱스의 차이 - 1)를 구하면 0의 갯수가 나옴
    */
    fun solution(N: Int): Int {
        val temp = mutableListOf<Int>()
        var n = N
        /*
            iteration 1: N = 9, 9 % 2 = 1, 9 / 2 = 4
            iteration 2: N = 4, 4 % 2 = 0, 4 / 2 = 2
            iteration 3: N = 2, 2 % 2 = 0, 2 / 2 = 1
            iteration 4: N = 1, 1 % 2 = 1, 1 / 2 = 0

            binary 1, 0, 0, 1 -> 1001
         */
        while (n > 0) {
            temp.add(n % 2)
            n /= 2
        }
        println("binary: ${temp}")
        // reversed 해줘야 2진수
        val binary = temp.reversed()

        // binary 1의 인덱스를 리스트에 저장
        val binaryOneIndex = mutableListOf<Int>()
        for ((index, value) in binary.withIndex()) {
            if (value == 1) {
                binaryOneIndex.add(index)
            }
        }
        var answer = 0

        // 1의 인덱스 끼리 빼주고 1을 더 빼주면 0의 사이즈가 구해짐.
        for (index in 0 until binaryOneIndex.size - 1) {
            val zeroCount = binaryOneIndex[index + 1] - binaryOneIndex[index] - 1
            answer = max(answer, zeroCount)
        }
        return answer
    }

    fun solution2(N: Int): Int {
        // 혹은 Integer 클래스를 사용하지 않으려면 binary.toString(2)
        val binaryString = Integer.toBinaryString(N)

        println("binaryString: ${binaryString}")
        val zeroList = binaryString.split('1').toMutableList()
        println("subString: ${zeroList}, ${zeroList.size}")

        // 만약 이진수의 끝자리가 1이 아닐 경우엔 마지막 연결된 0은 인정되지 않으므로 리스트에서 삭제.
        if (binaryString.last() != '1') {
            zeroList.removeAt(zeroList.lastIndex)
        }

        return zeroList.map { it.length }.max() ?: 0
    }
}
