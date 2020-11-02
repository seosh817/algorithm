package programmers.레벨1;

public class 문제시저암호 {
    public static String solution(String s, int n) {
        StringBuilder builder = new StringBuilder();
        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if(ch >= 'a' && ch <= 'z') {
                ch += n;
                if(ch > 'z') {
                    ch -= 26;
                }
            } else if(ch >= 'A' && ch <= 'Z') {
                ch += n;
                if(ch > 'Z') {
                    ch -= 26;
                }
            }
            builder.append(ch);
        }


        return builder.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution("AB", 1));
    }
}
