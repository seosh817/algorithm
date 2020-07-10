package programmers.stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Stack_Level2_Truck {


    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;

        Stack<Integer> truckStack = new Stack<Integer>();
        Map<Integer, Integer> bridgeMap = new HashMap<Integer, Integer>();

        for(int i = truck_weights.length-1; i>=0; i--) {
            truckStack.push(truck_weights[i]);
        }

        int sum =0;
        while(true) {
            answer++;

            if(bridgeMap.containsKey(answer)) {
                bridgeMap.remove(answer);
            }

            sum = bridgeMap.values().stream().mapToInt(Number::intValue).sum();

            if(!truckStack.isEmpty()) {
                if(sum + truckStack.peek() <= weight) {
                    bridgeMap.put(answer + bridge_length, truckStack.pop());
                }
            }

            if(bridgeMap.isEmpty() && truckStack.isEmpty())
                break;
        }


        return answer;
    }


    public static void main(String [] args) {
        System.out.println(solution(2, 10, new int[] {7,4,5,6}));
    }

}

