package codeup.스택;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 문제3021큰수덧셈 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            String a = br.readLine();
            String b = br.readLine();


            String[] aArray = a.split("");
            String[] bArray = b.split("");

            Stack<Integer> aStack = new Stack<>();
            Stack<Integer> bStack = new Stack<>();


            for (int i = 0; i < aArray.length; i++) {
                aStack.push(Integer.parseInt(aArray[i]));
            }

            for (int i = 0; i < bArray.length; i++) {
                bStack.push(Integer.parseInt(bArray[i]));
            }


            int maxLength = aArray.length > bArray.length ? aArray.length : bArray.length;


            int[] plusArray = new int[maxLength];

            int carry = 0;
            int count = maxLength - 1;
            while (count >= 0) {
                if (!aStack.empty() && !bStack.empty()) {
                    int aValue = aStack.pop();
                    int bValue = bStack.pop();
                    plusArray[count] = (aValue + bValue + carry) % 10;
                    carry = (aValue + bValue + carry) / 10;
                } else {
                    if (aStack.size() > bStack.size()) {
                        int aValue = aStack.pop();
                        plusArray[count] = (aValue + carry) % 10;
                        carry = (aValue + carry) / 10;
                    } else {
                        int bValue = bStack.pop();
                        plusArray[count] = (bValue + carry) % 10;
                        carry = (bValue + carry) / 10;
                    }
                }
                count--;
            }


            if (carry != 0) {
                System.out.print(carry);
                for (int i = 0; i < plusArray.length; i++) {
                    System.out.print(plusArray[i]);
                }
            } else {
                for (int i = 0; i < plusArray.length; i++) {
                    System.out.print(plusArray[i]);
                }
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}