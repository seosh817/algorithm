package programmers.레벨1;

import java.util.Stack;

public class 문제카카오크레인인형뽑기 {

    public static int solution(int[][] board, int[] moves) {
        int answer = 0;

        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        for (int i = 0; i < moves.length; i++) {
            int curY = moves[i] - 1;

            for (int j = 0; j < board.length; j++) {
                int doll = board[j][curY];
                if (doll != 0) {
                    if (stack.peek() == doll) {
                        stack.pop();
                        answer += 2;
                    } else {
                        stack.push(doll);
                    }
                    board[j][curY] = 0;
                    break;
                }
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[][]{{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}}, new int[]{1, 5, 3, 5, 1, 2, 1, 4}));
        System.out.println(solution(new int[][]{{3,3,3,3,3},{3,3,3,3,3},{3,3,3,3,3},{3,3,3,3,3},{3,3,3,3,3}}, new int[]{1,5,3,5,1,2,1,4}));
        System.out.println(solution(new int[][]{{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0}}, new int[]{1,5,3,5,1,2,1,4}));


    }
}
