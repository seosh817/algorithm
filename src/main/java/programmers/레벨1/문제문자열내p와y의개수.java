package programmers.레벨1;

public class 문제문자열내p와y의개수 {
    public static boolean solution(String s) {
        boolean answer = true;
        int pNum = 0;
        int yNum = 0;
        for(int i=0; i<s.length(); i++) {
            if(s.toLowerCase().charAt(i) == 'p') {
                pNum++;
            }
            if(s.toLowerCase().charAt(i) == 'y') {
                yNum++;
            }
        }
        return pNum == yNum;
    }
    public static void main(String[] args) {
        System.out.println(solution("pPoooyY"));
    }
}
