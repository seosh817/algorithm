package programmers.레벨1;

public class 서울에서김서방찾기 {
    public static String solution(String[] seoul) {
        int n = 0;
        for(int i=0; i< seoul.length; i++) {
            if(seoul[i].equals("Kim")) {
                n = i;
            }
        }
        StringBuilder builder = new StringBuilder();
        builder.append("김서방은 ")
                .append(n)
                .append("에 있다");

        return builder.toString();
    }
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"Jane", "Kim"}));
    }
}
