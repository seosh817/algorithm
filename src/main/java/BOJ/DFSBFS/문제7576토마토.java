package BOJ.DFSBFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class 문제7576토마토 {

    static Queue<Pair<Integer, Integer>> queue = new LinkedList<>();
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int n;
    static int m;
    static int[][] board;

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String[] nums = br.readLine().split(" ");
            m = Integer.parseInt(nums[0]);
            n = Integer.parseInt(nums[1]);
            board = new int[n][m];


            for (int i = 0; i < n; i++) {
                String[] rows = br.readLine().split(" ");
                for (int j = 0; j < m; j++) {
                    board[i][j] = Integer.parseInt(rows[j]);
                }
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (board[i][j] == 1) {
                        queue.add(new Pair(i, j));
                    }
                }
            }
            bfs();
            int max = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (board[i][j] == 0) {
                        System.out.println("-1");
                        return;
                    }
                    if (max < board[i][j]) max = board[i][j];
                }
            }
            System.out.printf("%d", max - 1);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void bfs() {
        while (!queue.isEmpty()) {
            Pair<Integer, Integer> cur = queue.peek();
            queue.poll();
            for (int dir = 0; dir < 4; dir++) {
                int nx = cur.first + dx[dir];
                int ny = cur.second + dy[dir];
                if (nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
                if (board[nx][ny] != 0) continue;
                board[nx][ny] = board[cur.first][cur.second] + 1;
                queue.add(new Pair(nx, ny));
            }

        }
    }
}
