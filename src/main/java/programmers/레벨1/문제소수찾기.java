package programmers.레벨1;

public class 문제소수찾기 {
    // 효율성에서 탈락
    public static int solution2(int n) {
        int answer = 0;

        for(int i=2; i<=n; i++) {
            boolean check = true;
            for(int j=2; j<i; j++) {
                if(i%j == 0) {
                    check = false;
                    break;
                }
            }
            if(check) {
                answer++;
            }
        }


        return answer;
    }

    public static int solution(int n) {
        int answer = 0;

        for(int i=2; i<=n; i++) {
            boolean check = true;
            for(int j=2; j<i; j++) {
                if(i%j == 0) {
                    check = false;
                    break;
                }
            }
            if(check) {
                answer++;
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(10));
    }
}
