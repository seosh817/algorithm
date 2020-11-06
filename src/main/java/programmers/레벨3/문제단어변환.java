package programmers.레벨3;


import java.util.*;

public class 문제단어변환 {
    static List<Integer> list;

    public static int solution(String begin, String target, String[] words) {
        int answer = 0;
        boolean[] visited = new boolean[words.length];
        list = new ArrayList<>();
        try {
            //dfs(begin, target, 0, visited, words, 0);
            bfs(begin, target,  visited, words);
            if (list.size() > 0) {
                Collections.sort(list);
                answer = list.get(0);
            } else {
                answer = 0;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


        return answer;
    }

    public static void dfs(String now, String target, int index, boolean[] visited, String[] words, int count) {
        System.out.println(now);
        if (now.equals(target)) {
            list.add(count);
        }

        for (int i = 0; i < words.length; i++) {
            if (checkPossible(now, words[i]) && !visited[i]) {
                visited[index] = true;
                System.out.println(words[i] + " " + visited[index]);
                dfs(words[i], target, i, visited, words, count + 1);
            }
        }
    }

    public static void bfs(String now, String target, boolean[] visited, String[] words) {
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(now, 0));
        while(!queue.isEmpty()) {
            Pair cur = queue.poll();
            if(cur.word.equals(target)) {
                list.add(cur.cnt);
                break;
            }
            for(int i=0; i< words.length; i++) {
                if(!visited[i] && checkPossible(cur.word, words[i])) {
                    visited[i] = true;
                    queue.add(new Pair(words[i], cur.cnt+1));
                }
            }
        }
    }

    public static boolean checkPossible(String prevWord, String nextWord) {
        int check = 0;

        for (int i = 0; i < nextWord.length(); i++) {
            if (prevWord.charAt(i) != nextWord.charAt(i)) {
                check++;
            }

        }
        //boolean c = check==1;
        //System.out.println(prevWord + nextWord + c);
        return check == 1;
    }

    public static void main(String[] args) {
        //System.out.println(solution("hit", "cog", new String[]{"hot", "dot", "dog", "lot", "log", "cog" }));
        //System.out.println(solution("hit", "cog", new String[]{"hot", "dot", "dog", "lot", "log" }));
        System.out.println(solution("hit", "hhh", new String[]{"hhh", "hht" }));
    }
}

class Pair {
    String word;
    int cnt;

    public Pair(String word, int cnt) {
        this.word = word;
        this.cnt = cnt;
    }

    public String getWord() {
        return word;
    }

    public int getCnt() {
        return cnt;
    }
}