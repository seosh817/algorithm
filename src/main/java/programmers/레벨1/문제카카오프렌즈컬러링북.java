package programmers.레벨1;

import BOJ.탐색.Pair;

import java.util.*;

public class 문제카카오프렌즈컬러링북 {

    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    static boolean[][] visited;

    public static int[] solution(int m, int n, int[][] picture) {
        int numberOfArea = 0;
        int maxSizeOfOneArea = 0;
        List<Integer> list = new ArrayList<>();
        visited = new boolean[m][n];
        Queue<Pair<Integer, Integer>> queue = new LinkedList<>();
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (picture[i][j] == 0 || visited[i][j]) continue;
                count++;
                queue.add(new Pair(i, j));

                int area = 0;
                while (!queue.isEmpty()) {
                    area++;
                    Pair<Integer, Integer> cur = queue.peek();
                    queue.poll();
                    for (int dir = 0; dir < 4; dir++) {
                        int nx = cur.first() + dx[dir];
                        int ny = cur.second() + dy[dir];
                        if (nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
                        if (picture[nx][ny] == 0 || visited[nx][ny]) continue;
                        visited[nx][ny] = true;
                        queue.add(new Pair(nx, ny));
                    }
                }
                list.add(area);
            }
        }
        maxSizeOfOneArea = Collections.max(list);
        numberOfArea = count;

        int[] answer = new int[2];
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;
        return answer;
    }

    public static void main(String[] args) {
        int[][] pictures = {{1, 1, 1, 0}, {1, 2, 2, 0}, {1, 0, 0, 1}, {0, 0, 0, 1}, {0, 0, 0, 3}, {0, 0, 0, 3}};
        System.out.println(Arrays.toString(solution(6, 4, pictures)));
    }
}

