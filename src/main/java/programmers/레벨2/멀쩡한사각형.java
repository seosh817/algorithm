package programmers.레벨2;

public class 멀쩡한사각형 {
    public static long solution(int w, int h) {
        long answer = 1;

        answer = (long)((w * h) - (w + h - gcd(w, h)));

        return answer;
    }

    private static long gcd(long w, long h) {
        long small, big;
        big = w>=h ? w:h;
        small = w<h ? w:h;

        while ( small != 0 ) {
            long nmg = big % small ;
            big = small;
            small = nmg;
        }
        return big;
    }

    public static void main(String[] args) {
        System.out.println(solution(8, 12));
    }
}
