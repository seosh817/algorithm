package programmers.레벨1;

public class 문제2016년 {

    public static String solution(int a, int b) {
        String answer = "";

        try{
            String[] dayOfWeek = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
            int[] monthArray = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31 ,30 ,31};
            String[] year = new String[366];

            int sum = 0;
            for(int i=0; i<year.length; i++) {
                year[i] = dayOfWeek[(i+5) %7];
            }

            int want_day = 0;

            for(int i=0; i<a-1; i++) {
                want_day += monthArray[i];
            }

            want_day += b-1;

            answer = year[want_day];
        }catch (Exception e) {
            e.printStackTrace();
        }


        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(5, 24));
    }
}
