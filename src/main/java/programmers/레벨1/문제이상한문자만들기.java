package programmers.레벨1;

public class 문제이상한문자만들기 {
    public static String solution(String s) {
        int index = 0;
        StringBuilder builder = new StringBuilder();
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == ' ') {
                index = 0;
                builder.append(' ');
            } else {
                if(index % 2 ==0) {
                    builder.append(Character.toUpperCase(s.charAt(i)));
                    index++;
                } else {
                    builder.append(Character.toLowerCase(s.charAt(i)));
                    index++;
                }
            }
        }

        return builder.toString();
    }
    public static void main(String[] args) {
        System.out.println(solution("try hello world"));
    }
}
