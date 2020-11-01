package programmers.레벨1;

public class 문제문자열을정수로바꾸기 {
    public static int solution(String s) {
        int answer = 0;
        answer = Integer.parseInt(s);
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("-1234"));
    }
}
