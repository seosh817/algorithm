package programmers.레벨1;

import java.util.*;

public class 문제카카오실패율 {
    public static int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        try {
            int[] nowStageUsers = new int[N + 1];

            for (int i = 0; i < stages.length; i++) {
                nowStageUsers[stages[i] - 1]++;
            }
            System.out.println(Arrays.toString(nowStageUsers));

            int total = 0;
            for (int i = 0; i < nowStageUsers.length; i++) {
                total += nowStageUsers[i];
            }
            int[] challangeUsers = new int[N];
            for (int i = 0; i < N; i++) {
                int temp = 0;
                for (int j = i; j < nowStageUsers.length; j++) {
                    temp += nowStageUsers[j];
                }
                challangeUsers[i] = temp;
            }
            System.out.println(Arrays.toString(challangeUsers));

            Double[] failRate = new Double[N];

/*            for (int i = 0; i < failRate.length; i++) {
                failRate[i] = (double) nowStageUsers[i] / challangeUsers[i];
            }
            System.out.println(Arrays.toString(failRate));*/

            for (int i = 0; i < failRate.length; i++) {
                if(challangeUsers[i] == 0) { //스테이지에 도달한 사람이 없는 경우를 생각해야함
                    failRate[i] = 0.0;
                } else {
                    failRate[i] = (double) nowStageUsers[i] / challangeUsers[i];
                }
            }
            System.out.println(Arrays.toString(failRate));
            HashMap<Integer, Double> failRateMap = new HashMap<>(); // 스테이지, 실패율

            for (int i = 0; i < N; i++) {
                failRateMap.put(i + 1, failRate[i]);
            }

            List<Integer> keySetList = new ArrayList<>(failRateMap.keySet());

            Collections.sort(keySetList, new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return failRateMap.get(o2).compareTo(failRateMap.get(o1));
                }
            });
            for (int i = 0; i < N; i++) {
                answer[i] = keySetList.get(i);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return answer;
    }


    public static int[] solution2(int N, int[] stages) {
        int[] answer = new int[N];
        int[] dataList = new int[N];

        for (int i = 0; i <= N; i++) {

        }

        return answer;
    }

    class Data {
        int stage;
        double failRate;

        public double getFailRate() {
            return failRate;
        }

        public int getStage() {
            return stage;
        }
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(5, new int[]{2, 1, 2, 6, 2, 4, 3, 3})));
    }
}
