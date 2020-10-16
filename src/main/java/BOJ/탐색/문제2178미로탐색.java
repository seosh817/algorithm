package BOJ.탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class 문제2178미로탐색 {


    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            String[] nums = br.readLine().split(" ");
            int n = Integer.parseInt(nums[0]);
            int m = Integer.parseInt(nums[1]);
            int[][] board = new int[n][m];
            int[] dx = {1, 0, -1, 0};
            int[] dy = {0, 1, 0, -1};
            int[][] distance = new int[n][m];


            for (int i = 0; i < n; i++) {
                String[] temp = br.readLine().split("");
                for (int j = 0; j < m; j++) {
                    board[i][j] = Integer.parseInt(temp[j]);
                }
            }

            Queue<Pair<Integer, Integer>> queue = new LinkedList<>();
            queue.add(new Pair(0, 0));
            distance[0][0] = 0; //해줘도 되고 안해줘도 되고

            while (!queue.isEmpty()) {
                Pair<Integer, Integer> cur = queue.peek();
                queue.poll();

                for (int dir = 0; dir < 4; dir++) {
                    int nx = cur.first + dx[dir];
                    int ny = cur.second + dy[dir];

                    if (nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
                    if (board[nx][ny] == 0 || distance[nx][ny] > 0) continue;
                    distance[nx][ny] = distance[cur.first][cur.second] + 1;
                    queue.add(new Pair(nx, ny));
                }
            }
            System.out.println(distance[n-1][m-1] + 1);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
