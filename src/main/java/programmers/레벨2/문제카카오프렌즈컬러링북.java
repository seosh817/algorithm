package programmers.레벨2;

import BOJ.탐색.Pair;

import java.util.*;

public class 문제카카오프렌즈컬러링북 {

    static int[] dx;
    static int[] dy;
    static int endX;
    static int endY;
    static int[][] board;
    static boolean[][] visited;
    static List<Integer> list;


    public static int[] solution(int m, int n, int[][] picture) {
        dx = new int[]{1, 0, -1, 0};
        dy = new int[]{0, 1, 0, -1};
        visited = new boolean[m][n];
        list = new ArrayList<>();
        board = new int[m][n];
        endX = m;
        endY = n;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = picture[i][j];
            }
        }


        for (int i = 0; i < picture.length; i++) {
            for (int j = 0; j < picture[i].length; j++) {
                if (visited[i][j] || picture[i][j] == 0) continue;
                bfs(i, j);
            }
        }
        int[] answer = new int[2];

        answer[0] = list.size();
        list.sort(Collections.reverseOrder());
        answer[1] = list.get(0);

        return answer;
    }

    public static void bfs(int x, int y) {
        int size = 0;
        Queue<Pair<Integer, Integer>> queue = new LinkedList<>();
        queue.add(new Pair(x, y));
        while (!queue.isEmpty()) {
            Pair<Integer, Integer> cur = queue.peek();
            queue.poll();
            for (int dir = 0; dir < 4; dir++) {
                int nx = cur.first() + dx[dir];
                int ny = cur.second() + dy[dir];
                if (nx >= endX || nx < 0 || ny >= endY || ny < 0) continue;
                if (board[nx][ny] == board[x][y] && !visited[nx][ny]) {
                    visited[nx][ny] = true;
                    size++;
                    queue.add(new Pair(nx, ny));
                }

            }
        }
        list.add(size);
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(solution(6, 4, new int[][]{{1, 1, 1, 0}, {1, 2, 2, 0}, {1, 0, 0, 1}, {0, 0, 0, 1}, {0, 0, 0, 3}, {0, 0, 0, 3}})));
    }
}

