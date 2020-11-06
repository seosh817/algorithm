package programmers.레벨3;

public class 문제네트워크 {

    static boolean[] visited;

    public static int solution(int n, int[][] computers) {
        int answer = 0;
        visited = new boolean[n];

        for (int i = 0; i < computers.length; i++) {
            if (!visited[i]) {
                answer++;
                dfs(i, n, computers);
            }
        }

        return answer;
    }

    public static void dfs(int start, int n, int[][] computers) {
        if (visited[start]) {
            return;
        }
        visited[start] = true;

        for (int i = 0; i < n; i++) {
            if (!visited[i] && computers[start][i] == 1) {
                dfs(i, n, computers);
            }
        }

    }

    public static void main(String[] args) {
        System.out.println(solution(3, new int[][]{{1, 1, 0}, {1, 1, 0}, {0, 0, 1}}));
        System.out.println(solution(3, new int[][]{{1, 1, 0}, {1, 1, 1}, {0, 1, 1}}));
    }
}

