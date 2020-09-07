package programmers;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Stack;


//https://programmers.co.kr/learn/courses/30/lessons/42584
public class Stack_Level2_StockPrice {

    public static int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        for(int i=0; i< prices.length-1; i++) {
            answer[i] = 0;
        }

        for(int i=0; i<prices.length-1; i++) {
            for(int j=i+1; j<=prices.length-1; j++) {
                if(prices[i] <= prices[j]) {
                    answer[i] = answer[i] + 1;
                } else {
                    answer[i] = answer[i] + 1;
                    break;
                }
            }
        }
        return answer;
    }

    public static int[] solutionStack(int[] prices) {
        int[] answer = new int[prices.length];
        Stack<Integer> beginIdxs = new Stack<>();

        beginIdxs.push(0);
        for(int i=1; i<prices.length-1; i++) {
            while(!beginIdxs.empty() && prices[beginIdxs.peek()] > prices[i] ) {
                int beginIdx = beginIdxs.pop();
                answer[beginIdx] = i - beginIdx;
            }
            beginIdxs.push(i);
        }
        while (!beginIdxs.empty()) {
            int beginIdx = beginIdxs.pop();
            answer[beginIdx] = prices.length - 1 - beginIdx;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solutionStack(new int[]{1, 2, 3, 2, 3})));

        Date date = new Date();

        String format = new SimpleDateFormat("yyyy-MM").format(date);
        System.out.println(format);
    }
}
