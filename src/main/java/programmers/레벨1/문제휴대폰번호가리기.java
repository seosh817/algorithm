package programmers.레벨1;


public class 문제휴대폰번호가리기 {
    public static String solution(String phone_number) {
        String[] numberArray = phone_number.split("");
        StringBuilder builder= new StringBuilder();
        for (int i = 0; i < numberArray.length; i++) {
            if (numberArray.length - 1 - i >= 4) {
                builder.append("*");
            } else {
                builder.append(numberArray[i]);
            }
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution("01033334444"));
    }
}
