package codeup.스택;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 문제1402거꾸로출력하기3 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            Stack<String> stack = new Stack<>();

            int n = Integer.parseInt(br.readLine());
            String[] words = br.readLine().split(" ");

            for (int i = 0; i < words.length; i++) {
                String temp = words[i];
                stack.push(temp);
            }


            while (true) {
                if (stack.empty()) {
                    break;
                } else {
                    System.out.print(stack.pop() + " ");
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
