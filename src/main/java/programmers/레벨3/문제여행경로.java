package programmers.레벨3;

import java.util.*;

public class 문제여행경로 {

    static String route = "";

    public static String[] solution(String[][] tickets) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < tickets.length; i++) {
            if (tickets[i][0].equals("ICN")) {
                route = "ICN" + ",";
                boolean[] visited = new boolean[tickets.length];
                visited[i] = true;
                dfs(tickets[i][1], tickets, visited, 1, list);
                visited[i] = false;
            }
        }

        Collections.sort(list);
        list.stream().forEach(System.out::println);
        String[] answer = list.get(0).split(",");

        return answer;
    }

/*    public static void dfs(String start, String departure, String[][] tickets, boolean[] visited, List<String> list) {
        StringBuilder builder = new StringBuilder();
        builder.append(start + ",");
        Stack<Node> stack = new Stack<>();
        stack.push(new Node(start, departure));
        System.out.println(visited[0]);
        while (!stack.isEmpty()) {
            Node cur = stack.peek();
            stack.pop();
            System.out.println(cur.start + " -> " + cur.departure);
            for (int i = 0; i < tickets.length; i++) {
                if (cur.departure.equals(tickets[i][0]) && !visited[i]) {
                    builder.append(cur.departure + ",");
                    visited[i] = true;
                    stack.push(new Node(tickets[i][0], tickets[i][1]));
                }
            }
        }
        list.add(builder.toString());
        builder.setLength(0);
    }*/

    public static void dfs(String destination, String[][] tickets, boolean[] visited, int cnt, List<String> list) {
        route += destination + ",";
        if (cnt == tickets.length) {
            list.add(route);
            return;
        }

        for (int i = 0; i < tickets.length; i++) {
            if (!visited[i] && destination.equals(tickets[i][0])) {
                visited[i] = true;
                dfs(tickets[i][1], tickets, visited, cnt + 1, list);
                visited[i] = false;
                route = route.substring(0, route.length() - 4);
            }
        }
    }

    public static void main(String[] args) {
        //System.out.println(Arrays.toString(solution(new String[][]{{"ICN", "JFK" }, {"HND", "IAD" }, {"JFK", "HND" }})));
        System.out.println(Arrays.toString(solution(new String[][]{{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"}, {"ATL", "SFO"}})));
    }
}

class Node {
    String start;
    String departure;

    public Node(String start, String departure) {
        this.start = start;
        this.departure = departure;
    }
}

