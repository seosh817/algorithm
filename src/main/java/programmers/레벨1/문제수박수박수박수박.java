package programmers.레벨1;

public class 문제수박수박수박수박 {

    public static String solution(int n) {
        String[] stringArray = {"수", "박"};
        StringBuilder builder = new StringBuilder();
        for(int i=0; i<n; i++) {
            builder.append(stringArray[i%2]);
        }

        return builder.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution(3));
    }
}
