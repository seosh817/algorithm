package programmers.레벨1;

public class 문제콜라츠추측 {
    public static int solution(int num) {
        int answer = 0;
        while (num != 1 && answer < 500) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num = (num * 3) + 1;
            }
            answer++;
        }
        if (answer == 500) answer = -1;
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(6));
        System.out.println(solution(16));
        System.out.println(solution(626331));
    }
}
