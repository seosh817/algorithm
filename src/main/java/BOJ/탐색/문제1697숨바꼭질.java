package BOJ.탐색;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class 문제1697숨바꼭질 {
    static int[] road;
    static int start;
    static int target;

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        try {
            String[] nums = br.readLine().split(" ");
            start = Integer.parseInt(nums[0]);
            target = Integer.parseInt(nums[1]);
            road = new int[100001];
            Queue<Integer> queue = new LinkedList<>();

            road[start] = 1;
            if (start == target) {
                System.out.println("0");
                return;
            }

            queue.offer(start);

            while (!queue.isEmpty()) {
                int cur = queue.peek();
                queue.poll();
                if (cur == target) {
                    System.out.println(road[cur] -1);
                    return;
                }

                if (cur - 1 >= 0 && cur - 1 <= 100000 && road[cur - 1] == 0) {
                    queue.add(cur - 1);
                    road[cur - 1] = road[cur] + 1;
                }


                if (cur + 1 >= 0 && cur + 1 <= 100000 && road[cur + 1] == 0) {
                    queue.add(cur + 1);
                    road[cur + 1] = road[cur] + 1;
                }
                if (cur * 2 >= 0 && cur * 2 <= 100000 && road[cur * 2] == 0) {
                    queue.add(cur * 2);
                    road[cur * 2] = road[cur] + 1;
                }
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
