package BOJ.DFSBFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class 문제2667단지번호붙이기 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int num = Integer.parseInt(br.readLine());
            int[][] board = new int[num][num];

            int[] dx = {1, 0, -1, 0};
            int[] dy = {0, 1, 0, -1};

            for (int i = 0; i < num; i++) {
                String[] rows = br.readLine().split("");
                for (int j = 0; j < num; j++) {
                    board[i][j] = Integer.parseInt(rows[j]);
                }
            }

            boolean[][] visited = new boolean[num][num];
            ArrayList<Integer> distance = new ArrayList();

            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[i].length; j++) { // i,j 시작
                    if (visited[i][j] || board[i][j] == 0) continue;

                    Queue<Pair<Integer, Integer>> queue = new LinkedList<>();
                    queue.add(new Pair(i, j));
                    visited[i][j] = true;
                    int area = 0;
                    while (!queue.isEmpty()) {

                        Pair<Integer, Integer> cur = queue.peek();
                        queue.poll();

                        for (int dir = 0; dir < 4; dir++) {
                            int nx = cur.first + dx[dir];
                            int ny = cur.second + dy[dir];

                            if (nx < 0 || nx >= num || ny < 0 || ny >= num) continue;
                            if (board[nx][ny] == 0 || visited[nx][ny]) continue;
                            visited[nx][ny] = true;
                            area++;
                            queue.add(new Pair(nx,ny));
                        }
                    }
                    distance.add(area+1);
                }
            }

            System.out.println(distance.size());
            distance.stream().sorted().forEach(System.out::println);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
