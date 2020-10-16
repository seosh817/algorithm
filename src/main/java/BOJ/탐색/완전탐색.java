package BOJ.탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;


public class 완전탐색 {

    static int n;
    static int m;
    static int dx[] = {1, 0, -1, 0}; // 아래부터 반시계방향으로
    static int dy[] = {0, 1, 0, -1};
    static boolean[][] visited;
    static int[][] board;
    static int count=0;
    static int maxArea = 0;



    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            String[] nums = br.readLine().split(" ");
            n = Integer.parseInt(nums[0]);
            m = Integer.parseInt(nums[1]);
            visited = new boolean[n][m];
            board = new int[n][m];

            for (int i = 0; i < n; i++) {
                String[] temp = br.readLine().split(" ");
                for (int j = 0; j < m; j++) {
                    board[i][j] = Integer.parseInt(temp[j]);
                }
            }





            Queue<Pair<Integer, Integer>> queue = new LinkedList<>();
            visited[0][0] = true;
            queue.add(new Pair<Integer, Integer>(0, 0));

            while (!queue.isEmpty()) {
                Pair<Integer, Integer> cur = queue.peek();
                queue.poll();
                for (int dir = 0; dir < 4; dir++) {
                    int nx = cur.first + dx[dir];
                    int ny = cur.second + dy[dir];
                    if (nx < 0 || nx >= n || ny < 0 || ny > m) continue;
                    if (visited[nx][ny] || board[nx][ny] == 0) continue;
                    visited[nx][ny] = true;
                    queue.add(new Pair<Integer, Integer>(nx, ny));
                }
            }


        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
