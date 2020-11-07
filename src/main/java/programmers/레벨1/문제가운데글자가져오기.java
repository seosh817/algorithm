package programmers.레벨1;

public class 문제가운데글자가져오기 {
    public static String solution(String s) {
        String answer = "";
        StringBuilder builder = new StringBuilder();
        if(s.length()%2 ==0) {
            builder.append(s.charAt(s.length()/2-1))
                    .append(s.charAt(s.length()/2));
        } else {
            builder.append(s.charAt(s.length()/2));
        }
        answer = builder.toString();
        return answer;
    }

    public static String solution2(String s) {
        String answer = "";
        int length = s.length();
        String word1;
        if ( length % 2 == 0 )
            word1 = s.substring(length/2 - 1, (length/2) + 1);
        else
            word1 = s.substring((length/2), (length/2) + 1);
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution("qwer"));
    }
}
