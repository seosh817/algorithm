package programmers.레벨1;

public class 문제정수제곱근판별 {
    public static long solution(long n) {
        long answer = 0;
        double doubleSqrt = Math.sqrt(n);
        if(doubleSqrt == (int)doubleSqrt) {
            answer = (long) Math.pow(doubleSqrt+1, 2);
        } else {
            answer = -1;
        }

        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution(121));
    }
}
