package programmers.레벨1;

import java.util.Arrays;

public class 문제최대공약수와최소공배수 {
    /*유클리드 호제법
        1)  입력 받은 두 수중 큰 수를 A, 작은수를 B로 정한다.

        2)  A 를 B 로 나눈값의 나머지를 R로 지칭한다.

        3)  R 이 0이라면 A는 B로 나누어 지기 때문에 최대 공약수는 B가 된다.

        4)  만약 R이 0이 아니라면 A값은 B로, B 값은 R로 변경한뒤 3번 과정을 반복한다.*/

    public static int[] solution(int n, int m) {
        int[] answer = new int[2];
        int GCD = getGCD(n, m);
        answer[0] = GCD;
        answer[1] = getLCM(n, m, GCD);


        return answer;
    }

    public static int getGCD(int a, int b) {
        while (b > 0) {
            int tmp = a;
            a = b;
            b = tmp % b;
        }
        return a;
    }

    public static int getLCM(int a, int b, int gcd) {
        return (a * b) / gcd;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(3, 12)));
    }
}
