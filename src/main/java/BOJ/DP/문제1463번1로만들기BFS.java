package BOJ.DP;

import BOJ.탐색.Pair;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class 문제1463번1로만들기BFS {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int n = Integer.parseInt(br.readLine());

            Queue<Pair<Integer,Integer>> queue = new LinkedList<>();
            int count = 0;
            queue.add(new Pair<>(n, count));

            while(!queue.isEmpty()) {
                Pair<Integer, Integer> pair = queue.peek();
                queue.poll();
                int num = pair.first();
                count = pair.second();
                count++;
                if(num == 1) {
                    System.out.println(count -1);
                    return;
                }
                if(num > 1) {
                    queue.add(new Pair(num-1, count));
                }
                if(num % 2 == 0) {
                    queue.add(new Pair(num / 2, count));
                }
                if(num%3==0) {
                    queue.add(new Pair(num / 3, count));
                }


            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
