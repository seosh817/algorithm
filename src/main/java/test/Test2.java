package test;

import java.util.*;

public class Test2 {
    public static String[] solution(String[] grades) {
        HashMap<String, String> hashMap = new HashMap<>();
        for (int i = 0; i < grades.length; i++) {
            String[] array = grades[i].split(" ");
            String subject = array[0]; // 학정번호
            String grade = array[1];
            if (hashMap.getOrDefault(subject, "G").compareTo(grade) > 0) {
                hashMap.put(subject, grade);
            }
        }

        List<String> list = new ArrayList<>();
        for (Map.Entry<String, String> entryIterator : hashMap.entrySet()) {
            list.add(entryIterator.getKey() + " " + entryIterator.getValue());
        }


        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String[] o1Array = o1.split(" ");
                String[] o2Array = o2.split(" ");
                if(o1Array[1].compareTo(o2Array[1]) > 0) {
                    return 1;
                } else if(o1Array[1].compareTo(o2Array[1]) == 0) {
                    return 0;
                } else {
                    return -1;
                }
            }
        });
        String[] answer = new String[hashMap.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"DS7651 A0", "CA0055 D+", "AI5543 C0", "OS1808 B-", "DS7651 B+", "AI0001 F", "DB0001 B-", "AI5543 D+", "DS7651 A+", "OS1808 B-"})));
        //System.out.println(Arrays.toString(solution(new String[]{"DM0106 D-", "PL6677 B+", "DM0106 B+", "DM0106 B+", "PL6677 C0", "GP0000 A0"})));
    }
}