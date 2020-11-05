package programmers.레벨1;

public class 문제카카오키패드누르기 {

    public static String solution(int[] numbers, String hand) {
        int left = 10;
        int right = 12;

        //x좌표 1, 2, 3 -> 0 || 4, 5, 6 -> 1 || 7, 8, 9 -> 2 가 되어야 하므로 (num-1)/3
        //y좌표 1, 4, 7 -> 0 || 2, 5, 8 -> 1 || 3, 6, 9 -> 2 가 되어야 하므로 (num-1)%3

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            if(num == 0) {
                num = 11;
            }
            if (num == 1 || num == 4 || num == 7) {
                left = num;
                builder.append("L");
            } else if (num == 3 || num == 6 || num == 9) {
                right = num;
                builder.append("R");
            } else {
                int numX = (num - 1) / 3;
                int numY = (num - 1) % 3;

                int leftX = (left - 1) / 3;
                int leftY = (left - 1) % 3;

                int rightX = (right - 1) / 3;
                int rightY = (right - 1) % 3;

                int leftDistance = Math.abs(numX - leftX) + Math.abs(numY - leftY);
                int rightDistance = Math.abs(numX - rightX) + Math.abs(numY - rightY);

                if (leftDistance > rightDistance) {
                    builder.append("R");
                    right = num;
                } else if (leftDistance < rightDistance) {
                    builder.append("L");
                    left = num;
                } else {
                    if (hand.equals("right")) {
                        builder.append("R");
                        right = num;
                    } else if (hand.equals("left")) {
                        builder.append("L");
                        left = num;
                    }
                }
            }
        }


        return builder.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5}, "right"));
        System.out.println(solution(new int[]{7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2}, "left"));
    }
}
