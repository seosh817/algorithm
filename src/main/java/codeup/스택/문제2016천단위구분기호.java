package codeup.스택;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

public class 문제2016천단위구분기호 {

    static void printRecursiveComma(int n) {
        if (n < 1000) {
            System.out.printf("%d", n);
            return;
        }
        printRecursiveComma(n / 1000);
        System.out.printf(",%03d", n % 1000);

    }

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int n = Integer.parseInt(br.readLine());
            String num = br.readLine();

            String[] word = num.split("");

            Stack<String> stack = new Stack<>();

            for (int i = 0; i < word.length; i++) {
                stack.push(word[i]);
            }


            Stack<String> printStack = new Stack<>();

            int count = 0;
            while (!stack.empty()) {
                count++;
                if (count % 4 == 0) {
                    printStack.push(",");
                } else {
                    printStack.push(stack.pop());
                }
            }

            while (!printStack.empty()) {
                System.out.print(printStack.pop());
            }


            //12521421
            //12521 421
            //12 521

            //printRecursiveComma(num);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}