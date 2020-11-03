package programmers.레벨1;

public class 문제하샤드수 {
    public static boolean solution(int x) {
        boolean answer = true;

        String xString = String.valueOf(x);
        String[] xArray = xString.split("");
        int sum = 0;
        for (int i = 0; i < xArray.length; i++) {
            sum += Integer.parseInt(xArray[i]);
        }
        if(x % sum == 0) {
            answer = true;
        } else {
            answer = false;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(10));
        System.out.println(solution(12));
        System.out.println(solution(11));
        System.out.println(solution(13));
    }
}
